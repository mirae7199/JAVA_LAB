package dataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>(); // 기본 10개의 자리가 만들어짐
    }

    public void addMember(Member member){
        arrayList.add(member);

    }

    public boolean removeMember(int memberId){
//        for(int i=0; i<arrayList.size(); i++) {
//           Member member = arrayList.get(i);
//
//           if(member.getMemberId() == memberId) {
//               arrayList.remove(i);
//               return true;
//           }
//        }

        // iterator함수를 호출하면 iterator 클래스가 반환 된다.
        // 모든 컬랙션에는 iterator()함수가 존재
        // iterator 요소를 순회한다...
        Iterator<Member> ir = arrayList.iterator();

        // hasNext() 이후에 요소가 더 있는지를 체크한다. 요소가 있다면 True를 반환
        while(ir.hasNext()) {
            // next() 다음에 있는 요소를 반환한다.
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                arrayList.remove(member); // remove(object o)
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;


    }

    public void showAllMembers() {
//        for (int i=0; i<arrayList.size(); i++) {
//           Member member = arrayList.get(i);
//            System.out.println(member);
//
//        }
        Iterator<Member> ir = arrayList.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }

    }


}
