package spring;

import java.time.LocalDateTime;

//회원 데이터 관련 클래스
public class Member { //DTO
	
	private Long id;
	private String email, password, name;
	private LocalDateTime registerDateTime;
	
	public Member(String email, String password, String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}
	
	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	
	//비밀번호 변경을 위해 기존 비밀번호를 확인받은 후 진행하는 메서드
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) throw new WrongIdPasswordException();
		this.password = newPassword; //비밀번호 확인이 일치하였을 때
	}
	
}