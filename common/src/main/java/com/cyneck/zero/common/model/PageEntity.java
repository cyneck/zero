package com.cyneck.zero.common.model;

import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.model
 * @Description : 手动注入分页类的返回的数据
 * @Create on : 2019/5/13 09:20
 **/

@Data
public class PageEntity<T> implements Serializable {
    private static final long serialVersionUID = 8656597559014685635L;
    private long total;        //总记录数
    private List<T> list;    //结果集
    private int pageNum;    // 第几页
    private int pageSize;    // 每页记录数
    private int pages;        // 总页数
    private int size;        // 当前页的数量 <= pageSize，该属性来自ArrayList的size属性

    public PageEntity(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.list = page;
            this.size = page.size();
        }
    }
}
