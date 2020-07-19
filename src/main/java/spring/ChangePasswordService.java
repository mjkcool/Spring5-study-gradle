package spring; 
//암호 변경 관련 클래스
public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member ==null) throw new MemberNotFoundException();
		
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}

	//어떤 Map 자료를 사용하는 Dao인지 모르니까 다른 Map을 사용시 새로 적용
	public void setMemberDao(MemberDao memberDao) { //객체 의존 주입
		this.memberDao = memberDao;
	}

}
