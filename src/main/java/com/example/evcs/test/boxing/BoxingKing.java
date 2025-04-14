package com.example.evcs.test.boxing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BoxingKing {

	private String name;
	private String contest;
	private String price;
	
	
	
	@Override
	public String toString() {
		
		
		return this.name + "는 " + this.contest + "에서 " + this.price + "등을 했다";
	}
}
