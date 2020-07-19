package spring;

import java.time.LocalDateTime;

//회원 가입 처리 관련 클래스
public class MemberRegisterService {
	
	private MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) { //객체 의존 주입
		this.memberDao = memberDao;
	}
	
	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) throw new DuplicateMemberException("dup email "+req.getEmail());
		
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(),LocalDateTime.now());
		memberDao.insert(newMember);
		
		return newMember.getId(); 
	}
}
