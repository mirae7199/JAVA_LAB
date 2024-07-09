package dataStructure.ArrayList;

public class MemberArrayListTest {
    public static void main(String[] args) {
        Member member1 = new Member(1, "김미래");
        Member member2 = new Member(2, "김다호");
        Member member3= new Member(3, "차은호");

        MemberArrayList memberArrayList = new MemberArrayList();

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);

        memberArrayList.showAllMembers();
        System.out.println("=============================");
        memberArrayList.showAllMembers();
    }
}
