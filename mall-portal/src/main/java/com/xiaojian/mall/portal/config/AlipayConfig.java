package com.xiaojian.mall.portal.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@PropertySource(value = {
        "classpath:alipay.properties"
}, encoding = "utf-8")
@Configuration
public class AlipayConfig {

	@Value("${alipay.app_id}")
	private  String app_id ;

	@Value("${alipay.private_key}")
    private  String merchant_private_key ;

	@Value("${alipay.public_key}")
    private  String alipay_public_key ;

	@Value("${alipay.notify_url}")
    private  String notify_url;

	@Value("${alipay.return_url}")
    private  String return_url ;

	@Value("${alipay.sign_type}")
    private  String sign_type ;

	@Value("${alipay.charset}")
    private  String charset ;

	@Value("${alipay.gatewayUrl}")
    private  String gatewayUrl;

	@Bean
	public AlipayClient alipayClient(){
		return new DefaultAlipayClient(gatewayUrl,
				app_id,
				merchant_private_key,
				"json",
				charset,
				alipay_public_key,
				sign_type);
	}

}

