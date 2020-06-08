package com.example.service;

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
}
