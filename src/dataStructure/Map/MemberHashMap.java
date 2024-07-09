package dataStructure.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)) { // containsKey Map에 해당 key가 있는지 여부를 반환한다.
            hashMap.remove(memberId);
            return true;
        }

        return false;

    }

    public void showAllMembers() {
        // keySet() key집합을 Set로 반환
        // values() value를 Collection으로 반환한다.
        // Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while(ir.hasNext()){

            Integer key = ir.next();

            Member member = hashMap.get(key);
            System.out.println("member = " + member);
        }
    }
}
