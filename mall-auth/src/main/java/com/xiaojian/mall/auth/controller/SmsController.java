package com.xiaojian.mall.auth.controller;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;
import com.xiaojian.mall.auth.config.TencentSmsConfig;
import com.xiaojian.mall.common.api.CommonResult;
import com.xiaojian.mall.common.exception.Asserts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {
    @Autowired
    private TencentSmsConfig tencentSmsConfig;
    @Autowired
    private SmsClient smsClient;

    @GetMapping("/sms/sendCode")
    private CommonResult<SendSmsResponse> sendCode(@RequestParam String telphone ,  @RequestParam String code){
        SendSmsRequest sendSmsRequest = tencentSmsConfig.sendSmsRequestBuilder(new String[]{"+86"+telphone} ,new String[]{code});
        SendSmsResponse sendSmsResponse = null;
        try {
             sendSmsResponse = smsClient.SendSms(sendSmsRequest);
        } catch (TencentCloudSDKException e) {
            Asserts.fail(e.getMessage());
        }
        return CommonResult.success(sendSmsResponse);
    }
}
