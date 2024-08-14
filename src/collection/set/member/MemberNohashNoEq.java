package collection.set.member;

import java.util.Objects;

public class MemberNohashNoEq {
    private String id;

    public MemberNohashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberNohashNoEq that = (MemberNohashNoEq) o;
        return id.equals(that.id);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    @Override
    public String toString() {
        return "MemberNohashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
