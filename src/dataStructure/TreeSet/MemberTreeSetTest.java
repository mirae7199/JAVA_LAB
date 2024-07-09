package dataStructure.TreeSet;


public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1, "김미래");
        Member member2 = new Member(2, "김다호");
        Member member3 = new Member(3, "차은호");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

        memberTreeSet.showAllMembers();

        memberTreeSet.removeMember(1);
    }



}
