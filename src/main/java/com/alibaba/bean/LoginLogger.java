package com.alibaba.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginLogger {

    private Long id;
    private String username;
    private Date loginDate;
}
