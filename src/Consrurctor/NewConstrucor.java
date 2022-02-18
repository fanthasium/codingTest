package Consrurctor;

import java.io.CharArrayReader;

public class NewConstrucor {

    //생성자를 생성해주면 실행블럭{  } 을 꼭 써줘야함
//    NewConstrucor(String color, int cc) {
//    }
    // ex) Newconst cl = new Newconst();
    // 이렇게 하면은 생성자가 자동으로 생성되서 따로 괄호안에 안 넣어줘도 되지만 저렇게 위에처럼 생성하면
    // 괄호안에 값을 기재해줘여한다

    //필드

    String nation = "korea";
    String name;
    String ssn;

    //필드 선언한 값 초기화 하기
    public NewConstrucor(String n, String s) {

        //this 는 객채 자신의 참조를 가능케 해줌
        // this 안쓰고 매개변수 필드명을 같게하면 매개변수가 우선순위를 가져 안되데여..
       this.name = name;
       this.ssn = ssn;
    }



}
