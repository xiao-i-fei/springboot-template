package com.xiaofei.template.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * User: 李飞
 * Date: 2022/4/20
 * Time: 14:20
 *
 * @author 李飞
 */
@MapperScan("com.xiaofei.template.mapper")
@Configuration
public class MyBatisConfig {
}
