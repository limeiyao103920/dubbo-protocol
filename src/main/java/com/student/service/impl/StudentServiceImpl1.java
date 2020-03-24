package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.student.pojo.MyInteger;
import com.student.pojo.Student;
import com.student.service.StudentService;

/**
 * 
 * @author zhuzg
 *
 */
public class StudentServiceImpl1  implements StudentService{

	@Override
	public Student getById(int id) {
		System.out.println(" 服务端11111 getById 方法被调用");
		try {
			System.out.println("开始睡觉");
			Thread.sleep(2000);
			System.out.println("睡觉结束");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(id);
		student.setName("服务一  Sutent:" + id);
		student.setAge(15 + new Random().nextInt(10));
		student.setGender("女");
		return student;
	}

	@Override
	public int getAge(Student student) {
		// TODO Auto-generated method stub
		System.out.println(" 服务端 11111 getAge 方法被调用");
	
		try {
			System.out.println("开始睡觉");
			Thread.sleep(20);
			System.out.println("睡觉结束");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student.getAge();
	}

	@Override
	public List<String> getStus() {
		// TODO Auto-generated method stub
		
			 ArrayList<String> list = new ArrayList<String>() ;
			 list.add("a1");
			 list.add("b1");
			 list.add("c1");
			 return list;
			 
			
		}

	@Override
	public MyInteger calTotal() {
		// TODO Auto-generated method stub
		return new MyInteger(10);
	}

	
}
