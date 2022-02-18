package sec06_example01_filed_declaration;

public class CarExample {
    public static void main(String[] args) {
        car myCar = new car();  // Car 클래스를 mycar로 객채생성
                                // Mycar 가 car 클래스를 참조할 수 있음

        System.out.println(myCar.color); // myCar가 car에 있는 필드를 도트연산자로 읽어옴

        myCar.speed = 60; //참조한 스피드의 값을 변경해줄수도 있다!




    }
}
