package com.jing.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @ClassName:SpringConfiguration
 * @Description TODO 代替applicationContext.xml配置的配置类
 * @author:RanMoAnRan
 * @Date:2019/5/18 15:45
 * @Version 1.0
 */

@Configuration  //用于指定当前类是一个spring配置类，当创建容器时会从该类上加载注解。
@ComponentScan("com.jing") //用于指定spring在初始化容器时要扫描的包。
@Import(value = {JdbcConfig.class}) //用于导入其他配置类，在引入其他配置类时，其他配置类上可以不用再写@Configuration注解
public class SpringConfiguration {

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate createJdbcTempalte(@Qualifier("dataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
