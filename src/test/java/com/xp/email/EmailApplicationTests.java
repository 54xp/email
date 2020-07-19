package com.xp.email;

import com.xp.email.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailApplicationTests {
    @Resource
    private MailService mailService;

    @Test
    public void sendEmail(){
        mailService.sendSimpleMail("927309965@qq.com","简单文本邮件","这是我的第一封邮件,哈哈...");
    }
}
