package dataStructure.Map;

public class Member implements Comparable<Member>{
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 "  + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            if(this.memberId == member.getMemberId()){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) { // member 비교가 되는 객체
        // this.memberId 추가되는 객체가 this
        // this.memberId 값이 크면 양수(오름차순)
        // this.memberId 값이 작으면 음수(내림차순)

        // return (this.memberId - member.getMemberId()) * (-1);

        return(this.memberName.compareTo(member.getMemberName())) * (-1); // 문자열은 기본 오름차순
    }
}
