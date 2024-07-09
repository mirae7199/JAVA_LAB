package dataStructure.HashSet;


public class MemberHashSetTest {
    public static void main(String[] args) {
        Member member1 = new Member(1, "김미래");
        Member member2 = new Member(2, "김다호");
        Member member3= new Member(3, "차은호");

        MemberHashSet memberHashSet = new MemberHashSet();

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.showAllMembers();

        Member member4 = new Member(3, "차은호");

        memberHashSet.addMember(member4);
        memberHashSet.removeMember(2);
        System.out.println("=============================");
        memberHashSet.showAllMembers();
    }
}
