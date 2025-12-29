package com.vamsi.beaninit.dynamic_init;

import java.time.LocalDateTime;

public class EmailMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "This is an Email message sent at your inbox at !" + LocalDateTime.now();

    }

    @Override
    public String getServiceType() {
        return "Email";
    }

}
