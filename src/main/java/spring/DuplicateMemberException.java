package spring;
//회원 가입 처리 관련 클래스
public class DuplicateMemberException extends RuntimeException{

	public DuplicateMemberException(String message) {
		super(message);
	}
	
}
