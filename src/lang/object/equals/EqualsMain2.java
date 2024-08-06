package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        Member2 member = new Member2("2");
        Member2 member2 = new Member2("2");

        System.out.println(member.equals(member2));
    }
}
