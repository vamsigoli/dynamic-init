package com.vamsi.beaninit.dynamic_init;
import java.time.LocalDateTime;

public class SmsMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "This is an SMS message generated at " + LocalDateTime.now(); 
    }

    @Override
    public String getServiceType() {
        return "SMS";
    }

}
