package dataStructure.TreeSet;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }

    public void addMember(Member member){
        treeSet.add(member);

    }

    public boolean removeMember(int memberId){
        // iterator함수를 호출하면 iterator 클래스가 반환 된다.
        // 모든 컬랙션에는 iterator()함수가 존재
        // iterator 요소를 순회한다...
        Iterator<Member> ir = treeSet.iterator();

        // hasNext() 이후에 요소가 더 있는지를 체크한다. 요소가 있다면 True를 반환
        while(ir.hasNext()) {
            // next() 다음에 있는 요소를 반환한다.
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                treeSet.remove(member); // remove(object o)
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;


    }

    public void showAllMembers() {
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }

    }


}
