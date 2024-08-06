package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        Member1 member1 = new Member1("1");
        Member1 member2 = new Member1("1");

        System.out.println("동일성 비교 : " + (member1 == member2));
        System.out.println("동일성 비교 : " + (member1.equals(member2)));
    }
}
