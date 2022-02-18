package Consrurctor;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Map;

public class CarExample {
    public static void main(String[] args) {

        // 기본생성자에 아무것도 안 해줘서 에러가 날거임
       // NewConstrucor mycar = new NewConstrucor();

        //이렇게 매개값 넣어줘야함
//        NewConstrucor mycar = new NewConstrucor("검정색",3000);
//        System.out.println(mycar.color);


        NewConstrucor k1 = new NewConstrucor("박자바", "0111212");
        System.out.println(k1.name);

    }



}
