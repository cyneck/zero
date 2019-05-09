package com.cyneck.zero.entry.service.impl;

import com.cyneck.zero.entry.dao.common.Update;
import com.cyneck.zero.entry.model.Person;
import com.cyneck.zero.entry.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.service.impl
 * @Description : TODO
 * @Create on : 2019/5/9 09:06
 **/
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    @Transactional
    public Person update(Person person) {

        // some database options
        /*if (true) {
            throw new BusinessException("异常testing");
        }*/
        // update database dog info
        Update update = new Update(person);
        update.isOk();

        return person;
    }
}
