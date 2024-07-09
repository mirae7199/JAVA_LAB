package dataStructure.Map;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1, "김미래");
        Member member2 = new Member(2, "김다호");
        Member member3 = new Member(3, "차은호");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);

        memberHashMap.showAllMembers();

        memberHashMap.removeMember(1);
        memberHashMap.showAllMembers();
    }
}
