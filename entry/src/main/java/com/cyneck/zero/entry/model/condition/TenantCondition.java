package com.cyneck.zero.entry.model.condition;

import com.cyneck.zero.common.model.BaseCondition;
import lombok.Data;

import java.util.Date;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.model.condition
 * @Description : TODO
 * @Create on : 2019/5/15 11:52
 **/
@Data
public class TenantCondition extends BaseCondition {
    private String organCode;

    private String companyName;

    private String state;

    private String contactName;

    private String createStaffId;

    private Date createTime;

    private String modifyStaffId;

    private Date modifyTime;

    private String domainName;

    private String tnameShort;

    private Date beginDate;

    private Date endDate;

    private String contactPhone;

    private String logoPath;

    private String welcomeInfo;

    private String saleCustName;

    private String saleTaxIdNumber;

    private String saleOpenBank;

    private String saleAddrAndTel;
}
