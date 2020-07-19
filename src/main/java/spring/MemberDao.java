package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//회원 데이터 관련 클래스
public class MemberDao {

	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<>(); 
	/*	key와 value의 타입을 정의함 
	 * <key=(member.email), value=(Member's instance 'member')> 딕셔너리 같은 형태의 객체. 
	*/
	
	public Collection<Member> selectAll(){ //Collection이 Map보다 상위
		return map.values(); //map에 등록된 Member타입의 인스턴스들을 모두 반환
	}
	
	public Member selectByEmail(String email) {
		return map.get(email); //key값을 이용해 value값 반환
	}
	
	public void insert(Member member) {
		member.setId(++nextId); //member의 아이디 등록
		map.put(member.getEmail(), member); 
		/* 아이디까지 set되어 완벽해진 member인스턴스를 map에 등록.
		email값을 key로 등록. email값으로 멤버 조회 유도. */
	}
	
	public void update(Member member) { 
		map.put(member.getEmail(), member);
	}
	
}
