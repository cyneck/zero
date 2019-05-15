# 事务的核心问题
_________________________
## 1、事务的隔离
Springboot中定义了

 隔离级别数字数字配置含义:
 * -1：数据库默认隔离级别
 
 *  1：未提交读
 <br>允许一个事物读取另一个事物没提交的数据。
 <br>优点在于并发能力高，适合那些对数据一致性没有要求而追求高并发的场景。
 <br>最大缺点是出现脏读。
 
 *  2：读写提交
 <br>一个事务只能读取另外一个事务已提交的数据，不能读取未提交的数据。
 <br>克服了脏读，但不可重复读。
 
 *  4：可重复读
 <br>目标是克服读写提交中出现的不可重复读的现象，但会出现幻读。
 
 *  8：串行化
 <br>是数据库最高的隔离级别，它能够完全保证数据的一致性，但性能降低了。
 
<br>
<pre><code>
public enum Isolation {
    DEFAULT(-1),
    READ_UNCOMMITTED(1),
    READ_COMMITTED(2),
    REPEATABLE_READ(4),
    SERIALIZABLE(8);
}
</code></pre>
______________________________

## 2、事务的传播
* ***REQUIRED(0)*** ：需要事务
<br>它是默认传播行为，如果当前存在事务，就沿用当前事务，否则新建一个事务运行子方法。

* SUPPORTS(1)：支持事务
<br>如果当前存在事务，就沿用当前事务，如果不存在，则继续采用无事务的方式运行子方法。

* MANDATORY(2)：强制事务
<br>如果当前没有事务，则会抛出异常，如果存在当前事务，就沿用当前事务。

* ***REQUIRES_NEW(3)*** ：新事务
<br>无论当前事务是否存在，都会创建新事务运行方法，这样新事务就可以拥有新的锁和隔离级别等特性，与当前事务相互独立。

* NOT_SUPPORTED(4)：不支持事务
<br>当前存在事务时，将挂起事务，运行方法。

* NEVER(5)：不支持事务
<br>如果当前方法存在事务，则抛出异常，否则继续使用无事务机制运行。

* ***NESTED(6)*** ：抛出当前
<br>在当前方法调用子方法时，如果子方法发生异常，只回滚子方法执行过的SQL，而不回滚当前方法的事务。

常用的传播行为主要有三种：*REQUIRED*、*REQUIRES_NEW*、 *NESTED*。

<pre><code>
public enum Propagation {
    REQUIRED(0),
    SUPPORTS(1),
    MANDATORY(2),
    REQUIRES_NEW(3),
    NOT_SUPPORTED(4),
    NEVER(5),
    NESTED(6);
}
</code></pre>
---------------------------------
## 3、@Transactional的自调用失效问题

> 注解@transactional的底层实现是Spring AOP技术，
而Spring AOP技术使用的是动态代理。
这就意味着对于静态（static）方法和非public方法，
注解@Transactional是失效的。
自调用是指一个类的一个方法去调用自身另外一个方法的过程。
在自调用的过程中，是类自身的调用，而不是代理对象去调用， 
那么就不会产生 AOP，这样 Spring就不能把你的代码织入到约定的流程中。
为了克服这个问题，一方面可以写两个Service，用一个Service去调用另一个Service，
这样就是代理对象的调用。Spring才会将你的代码织入事务流程。
另一方面，也可以从Spring IoC容器中获取代理对象来启用AOP

<pre><code>
@Service  
public class AServiceImpl implements AService{

    //①  注入上下文  
    @Autowired 
    private ApplicationContext context;  
      
    //②  表示代理对象，不是目标对象  
    private AService proxySelf; 
    
    //③ 初始化方法 
    @PostConstruct
    private void setSelf() {  
        // 从上下文获取代理对象（如果通过proxtSelf=this是不对的，this是目标对象）  
        // 此种方法不适合于prototype Bean，因为每次getBean返回一个新的Bean  
        proxySelf = context.getBean(AService.class);
    }
    
    @Transactional(propagation = Propagation.REQUIRED)  
    public void a() {
       //④ 调用代理对象的方法 这样可以执行事务切面  
       proxySelf.b();
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)  
    public void b() {
       return;
    }  
}
</code></pre>