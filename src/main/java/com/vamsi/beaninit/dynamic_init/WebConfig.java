package com.vamsi.beaninit.dynamic_init;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MessageServiceBeanRegistrar.class})
public class WebConfig {

}
