package com.dozerMapper.main;

import org.apache.catalina.mapper.Mapper;
import org.dozer.DozerBeanMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dozerMapper.destination.ClassB;
import com.dozerMapper.source.ClassA;

@SpringBootApplication
public class DozerMapperApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DozerMapperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ClassA classA=new ClassA();
		classA.setName("simran");
		classA.setUsn("3kc18cs022");
		classA.setAddress("hyderbad");
		
		System.out.println(classA);
		
		DozerBeanMapper mapper=new DozerBeanMapper();
		ClassB classB=mapper.map(classA, ClassB.class);
		
		System.out.println(classB);
	}

}
