package com.vamsi.beaninit.dynamic_init;

import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;
public class MessageServiceBeanRegistrar implements BeanRegistrar {

    @Override
    public void register(BeanRegistry registry, Environment env) {
        String serviceType = env.getProperty("app.message.service.type", "email").toLowerCase();
        switch (serviceType) {
            case "sms" -> 
                registry.registerBean("smsMessageService", SmsMessageService.class,
                                    spec->spec.description("SmsMessage service to deliver sms"));

            case "email" ->
                registry.registerBean("emailMessageService", EmailMessageService.class,
                                    spec->spec.description("EmailMessage service to deliver email"));

            default -> throw new IllegalArgumentException("Unsupported message service type: " + serviceType);
        };
    }

}
