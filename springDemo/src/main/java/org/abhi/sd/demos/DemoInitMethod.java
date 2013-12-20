package org.abhi.sd.demos;

import org.abhi.sd.beans.InitTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoInitMethod {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/abhi/sd/resources/springConfig/beans.xml");
		applicationContext.getBean(InitTestBean.class);
	}
}
