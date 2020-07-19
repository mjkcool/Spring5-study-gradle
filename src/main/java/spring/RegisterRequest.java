package spring;
//회원 가입 처리 관련 클래스
public class RegisterRequest {
	
	private String email, password, confirmPassword, name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//비밀번호 재확인 값이 비밀번호 값과 동일한지
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
}
