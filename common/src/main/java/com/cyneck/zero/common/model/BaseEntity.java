package com.cyneck.zero.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.model
 * @Description : 基类
 * @Create on : 2019/5/13 10:54
 **/
@Data
public class BaseEntity {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Column(name = "CreateDate")
    private Date createDate;

    @JsonIgnore
    @Column(name = "UpdateDate", updatable = true)
    private Date updateDate;

}
