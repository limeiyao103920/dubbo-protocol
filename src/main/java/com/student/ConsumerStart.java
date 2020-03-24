package com.student;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.pojo.MyInteger;
import com.student.service.StudentService;


public class ConsumerStart {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = 
				 new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		context.start();
		
		//java.util.Map<K, V>
	
		
		// 测试多协议
		 StudentService studentService = (StudentService)context.getBean("myStudentc");
		 List<String> list = studentService.getStus();
		 list.stream().forEach(x->{System.out.println("名单是 " + x);});
		 
		 MyInteger calTotal = studentService.calTotal();
		 System.out.println("calTotal is " + calTotal);
		
		 //测试redis 协议
		 Map cache=(Map)context.getBean("cache");
		 cache.put("mytestkey", "mytestValue");
		 System.out.println("存入成功");
		 
		 
		
		 Thread.sleep(10000);
		
		
		
		
	}
	

}
