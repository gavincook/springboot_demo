package com.example.demo.configuration;

import java.util.HashMap;
import java.util.Map;
import me.gavincook.moon.template.ExecuteTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Demo工程配置
 *
 * @author gavincook
 * @date 2018-08-29 14:37
 * @since 1.0.0
 */
@Configuration
public class DemoConfiguration {

    @Bean
    public ExecuteTemplate executeTemplate(TransactionTemplate transactionTemplate) {
        Map<String, TransactionTemplate> transactionTemplateMap = new HashMap<>();
        transactionTemplateMap.put("default", transactionTemplate);
        return new ExecuteTemplate("default", transactionTemplateMap);
    }

}
