package com.why.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 5:46 下午
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    private static final long serialVersionUID = -5375388684908449766L;


    private String courseId;
    private String title;
    private String deptName;
    private BigDecimal credits;
}
