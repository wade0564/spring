package com.baobaotao.ltw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringManagerAspectjTest {
	public static void main(String[] args) {
		String configPath = "com/baobaotao/ltw/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
//		
//		Topic topic = new Topic();
//		topic.setTitle("测试主题"); 
//
		Object obj = ctx.getBean("aspectj");
		System.out.println("TopicAspectj:" + obj);
	}
}
