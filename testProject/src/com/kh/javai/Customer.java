package com.kh.javai;

public class Customer {
	//필드
	//name, id, password, email
	private String name;
	private String id;
	private String password;
	private String email;
	//모든 데이터를 초기화하는 생성자
	public Customer(String name, String id, String password, String email) {
		this.name =name;
		this.id = id;
		this.password = password;
		this.email = email;
	}
	//값을 가지고 오는 getter매서드
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	//값을 넣어주는 setter 매서드
	public void setName(String sName) {
		this.name = sName;
	}
	public void setId(String sId) {
		this.id = sId;
	}
	public void setPassword(String sPassword) {
		this.password = sPassword;
	}
	public void setEmail(String sEmail) {
		this.email = sEmail;
	}
	//정보를 보여주는 toString 매서드 (리턴형 스트링)
	@Override
	public String toString() {
		String str = this.name + "\t" + this.id + "\t" + 
					this.password + "\t" + this.email;
		return str;
	}
	// 회원정보 일치여부
	public boolean equals(String id, String password) {
		return (this.id.equals(id) &&
				this.password.equals(password));
	}
	// 아이디 일치
	public boolean idCheck(String id) {
		return (this.id.equals(id));
	}
	// 비밀번호 일치
	public boolean passwordCheck(String password) {
		return (this.password.equals(password));
	}

}
