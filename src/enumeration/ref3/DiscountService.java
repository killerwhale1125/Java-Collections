package enumeration.ref3;

/**
 * grade가 가지고있는 discountPercent의 값을 꺼내서 사용한다
 * 즉 자신의 데이터를 외부에 노출하는 것
 * Grade 클래스가 자신의 할인율을 어떻게 계산하는지 스스로 관리하는 것이 캡슐화 원칙에 더 알맞다
 * ( 내것을 꺼내서 밖의 계산 로직을 돌리는 것 X  Grade 내부에서 계산을 끝내자 )
 */
public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
