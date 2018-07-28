package com.openfaas.function;

import com.openfaas.model.IHandler;
import com.openfaas.model.IResponse;
import com.openfaas.model.IRequest;
import com.openfaas.model.Response;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Handler implements com.openfaas.model.IHandler {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "your_account_sid";
    public static final String AUTH_TOKEN = "your_auth_token";

    public IResponse Handle(IRequest req) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
            .creator(new PhoneNumber("+14159352345"), // to
                new PhoneNumber("+14158141829"), // from
                "Test SMS")
            .create();


        Response res = new Response();

        res.setBody(message.getSid());

	    return res;
    }
}
