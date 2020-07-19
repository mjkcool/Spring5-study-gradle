package spring;

import java.util.Collection;

//회원 정보 출력 관련 클래스
public class MemberListPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m->printer.print(m)); //요소를 모두 m이란 변수에 꺼내어 사용, (변수->반복처리(변수))
	
	}
	
	
}
