package com.larry.fc.finalproject.api.service;

import com.larry.fc.finalproject.api.controller.api.BatchController;
import com.larry.fc.finalproject.api.dto.EngagementEmailStuff;
import com.larry.fc.finalproject.core.domain.entity.Share;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Larry
 */
@Profile("test")
@Service
public class FakeEmailService implements EmailService {

    @Override
    public void sendEngagement(EngagementEmailStuff stuff) {
        System.out.println(stuff.getProps());
    }

    @Override
    public void sendAlarmMail(BatchController.SendMailBatchReq sendMailBatchReq) {
        System.out.println(sendMailBatchReq.toString());
    }

    @Override
    public void sendShareRequestMail(String email, String email1, Share.Direction direction) {
        System.out.println("send share mail");
    }
}
