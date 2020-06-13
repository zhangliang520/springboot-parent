package com.example.service;

import java.util.Map;

public interface MailService {
    /**
     *发送普通邮件
     */

    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送html格式邮件
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件邮件
     */
    void sendAttachmentsMail(String to, String subject, String content, String filePath);

    /**
     * 发送模版邮件
     */
    void sendTemplateMail(String to, String subject,Map<String,Object>  map);

    /**
     * 发送带静态资源的邮件
     */
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
