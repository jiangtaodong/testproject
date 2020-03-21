package javamail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		
		// 收件人电子邮箱
		String to = "dongjiangtaowy@163.com";
		// 发件人电子邮箱
		String from = "2213382160@qq.com";
		// 指定发送邮件的主机为 localhost
		String host = "smtp.qq.com";
		// 获取系统属性
		Properties properties = System.getProperties();
		// 设置邮件服务器
		properties.setProperty("mail.smtp.host", host);
		properties.put("mail.smtp.auth", "true");
		// 获取默认session对象
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("2213382160@qq.com","tmtmrxbpyxaiebfe");
			}
		});
		 // 创建默认的 MimeMessage 对象
		MimeMessage message = new MimeMessage(session);
		
		try {
			// Set From: 头部头字段
			message.setFrom(new InternetAddress(from));
			// Set To: 头部头字段
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			// Set Subject: 头部头字段
			message.setSubject("测试javaMail");
			// 设置消息体
			message.setText("测试JavaMail........................................");
//			message.setContent("<table>"
//					+ "<tr>"
//					+ "<td>姓名</td>"
//					+ "<td>邮箱</td>"
//					+ "</tr>"
//					+ "tr>"
//					+ "<td>董江涛</td>"
//					+ "<td>2213382160@qq.com</td>"
//					+ "</tr>"
//					+ "</table>","test/html");
			// 发送消息
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
