package lang.object.equals;

import java.util.Objects;

public class Member2 {
    private String id;

    public Member2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member2 member2 = (Member2) o;
        return Objects.equals(id, member2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
