package com.wkk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Time: 20-2-13下午1:10
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private  int age;
    private String sex;
    
}
