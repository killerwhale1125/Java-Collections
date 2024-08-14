package collection.set;

import collection.set.member.Member;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("1"));
        set.add(new Member("1"));
        set.add(new Member("1"));

        System.out.println("set.contains(new Member(\"1\")) = " + set.contains(new Member("1")));

        System.out.println("set = " + set);

    }
}
