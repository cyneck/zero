package com.cyneck.zero.entry.service;

import com.cyneck.zero.common.model.PageEntity;
import com.cyneck.zero.entry.model.condition.UserCondition;
import com.github.pagehelper.Page;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.service
 * @Description : TODO
 * @Create on : 2019/5/13 14:14
 **/
public interface UserService {

    PageEntity getUserListByCondition(int pageNum, int pageSize);

    PageEntity getPageByCondition(UserCondition condition);
}
