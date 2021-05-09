package com.xiaojian.mall.auth.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.*;;

@PropertySource(value = {
        "classpath:tencent-sms.properties",
}, encoding = "utf-8")

@Configuration
public class TencentSmsConfig {
    @Value("${tencent.secretId}")
    private String SECRET_ID ;

    @Value("${tencent.secretKey}")
    private String SECRET_KEY ;

    @Value("${tencent.sms.endpoint}")
    private String ENDPOINT ;

    @Value("${tencent.sms.appId}")
    private String APP_ID ;

    @Value("${tencent.sms.sign}")
    private String SIGN ;

    @Value("${tencent.sms.templateId}")
    private String TEMPLATE_ID ;

    @Bean
    public SmsClient smsClient(){
        Credential cred = new Credential(SECRET_ID, SECRET_KEY);

        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint(ENDPOINT);

        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);

        return new SmsClient(cred, "", clientProfile);
    }

    public SendSmsRequest sendSmsRequestBuilder(String[] phoneNumberSet ,String[] templateParamSet){
        SendSmsRequest req = new SendSmsRequest();
        req.setTemplateID(TEMPLATE_ID);
        req.setSign(SIGN);
        req.setPhoneNumberSet(phoneNumberSet);
        req.setTemplateParamSet(templateParamSet);
        req.setSmsSdkAppid(APP_ID);
        return req;
    }
}
