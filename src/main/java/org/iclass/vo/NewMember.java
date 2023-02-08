package org.iclass.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class NewMember {
	private String id;
	private String name;
	private String password;
	private String email;
	private int age; 
}
