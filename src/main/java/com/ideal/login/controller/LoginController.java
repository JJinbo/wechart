package com.ideal.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


/**
 * @Auther: devoty
 * @Date: 2018/12/24 14:21
 * @Description:
 * 微信登录请求地址：GET https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
 * appid	string		是	小程序 appId       wxe4b8de111db51cf5                   wxe73443b05ccf371f
 * secret	string		是	小程序 appSecret   ae7295ace6dee7edff2030bae13258a2     01b154dfc0bdb95f41b6a8f16e48d906
 * js_code	string		是	登录时获取的 code
 * grant_type	string		是	授权类型，此处只需填写 authorization_code
 */

@Controller
public class LoginController {
//
//    @Autowired
//    RestTemplate restTemplate;
//


    @RequestMapping("/login")
    @ResponseBody
    public void login(String code){
        System.out.println(code);

        String appID = "wxe73443b05ccf371f";

        String secret = "01b154dfc0bdb95f41b6a8f16e48d906";

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appID+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code";
        String result = restTemplate.getForObject(url, String.class);
        
        
        
        System.out.println(result);

    }




}
