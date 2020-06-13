package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("1796969389@qq.com","test simple mail"," hello this is simple mail");
    }

    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("1796969389@qq.com","test html mail", content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="E:\\weixinworkspace\\springboot-parent\\gzh.png";
        mailService.sendAttachmentsMail("1796969389@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void testTemplateMail() {
        Map<String, Object> map = new HashMap<>();
        map.put("id","001");
        mailService.sendTemplateMail("1796969389@qq.com","test template mail", map);
    }
    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath="E:\\weixinworkspace\\springboot-parent\\gzh.png";
        mailService.sendInlineResourceMail("1796969389@126.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
