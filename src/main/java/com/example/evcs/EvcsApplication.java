package com.example.evcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.evcs.test.sorry.*;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class EvcsApplication {
	
	public static void main(String[] args) {
		
		Sorry sorry = new Sorry("멍멍멍멍멍", " 왈로왈왈왈", "미안하면 군생활 끝나나?");
		
		System.out.println(sorry.getMungmung() + sorry.getSorry());
		System.out.println("너 뭐닝?" + sorry);
		
		log.info("이게 되네 {}" , sorry);
		
		
		
		SpringApplication.run(EvcsApplication.class, args);
		
	}

}
