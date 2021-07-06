package com.example.rjany.service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

@Service
public class SMSServiceImpl implements SMSService {
	
    public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; //Account SID form twillo dashborad
    public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; //Auth Token form twillo dashboard

    @Override
    public Message sendSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+XXXXXXXXXXX"),// Send message to the number
                new com.twilio.type.PhoneNumber("+XXXXXXXXXXX"),//the twillo generated number
                "Hello from the other side.") // Messages to be send
           .create();

        return message;
    }

}
