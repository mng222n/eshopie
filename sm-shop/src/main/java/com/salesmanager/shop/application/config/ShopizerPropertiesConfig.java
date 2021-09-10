package com.salesmanager.shop.application.config;


import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class eShopiePropertiesConfig {

  @Bean
  public List<String> templates() {
    return Arrays.asList("bootstrap", "generic", "exoticamobilia", "december");
  }

  @Bean(name = "eShopie-properties")
  public PropertiesFactoryBean mapper() {
    PropertiesFactoryBean bean = new PropertiesFactoryBean();
    bean.setLocation(new ClassPathResource("eShopie-properties.properties"));
    return bean;
  }
}
