package dataStructure.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member){
        hashSet.add(member);

    }

    public boolean removeMember(int memberId){
        // iterator함수를 호출하면 iterator 클래스가 반환 된다.
        // 모든 컬랙션에는 iterator()함수가 존재
        // iterator 요소를 순회한다...
        Iterator<Member> ir = hashSet.iterator();

        // hasNext() 이후에 요소가 더 있는지를 체크한다. 요소가 있다면 True를 반환
        while(ir.hasNext()) {
            // next() 다음에 있는 요소를 반환한다.
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                hashSet.remove(member); // remove(object o)
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;


    }

    public void showAllMembers() {
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }

    }


}
