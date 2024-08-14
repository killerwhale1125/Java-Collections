package collection.set.member;

import collection.set.expansion.HashSetExpansion2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        HashSetExpansion2 set = new HashSetExpansion2(10);

        MemberNohashNoEq a = new MemberNohashNoEq("A");
        MemberNohashNoEq b = new MemberNohashNoEq("A");
        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println("a.equals(b) = " + a.equals(b));

        set.add(a);
        set.add(b);
        System.out.println(set);

        MemberNohashNoEq searchValue = new MemberNohashNoEq("A");
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));
        set.add(searchValue);
        System.out.println(set);
    }
}
