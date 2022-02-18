package CodingTest;

import java.util.Locale;
import java.util.Random;


//사용된 약속어
/*
* toLowerCase, toUpperCase => 문자열을 소문자 , 대문자로 치환
* StringBulider => append기능을 사용할 수 있다 이는 문자열을 합쳐주는 기능을 함
* toCharArray ===> String 문자열을 Char 문자로 바꿔준다
* toString()  ===> 객체가 갖고 있는 정보나 값을 문자열로 만들어 리턴
* replace     ===> 바꾸고싶은 문자를 치환 ex) replace("기존문자", "바꿀문자")
* charAt      ===> String문자열로 저장된 문자열중 하나를 char형 으로 변환을 시킴
* */

class Project {
   public String solution(String new_id){
       String step1 =  new_id.toLowerCase();

      // 2단계 - new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거

       char[] arr = step1.toCharArray();
       StringBuilder step2 = new StringBuilder();
       for(char c : arr) {
           if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
               step2.append(c);
           }
       }
       // 3단계 - new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환

       String step3 = step2.toString().replace("..",".");
       while (step3.contains("..")){
           step3 = step3.replace("..",".");
       }

      // 4단계 - new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거

       String step4 = step3;
       if (step4.length() > 0) {
           if (step4.charAt(0) == '.') {
               step4 = step4.substring(1, step4.length());
           }
       } if (step4.length() > 0) {
           if (step4.charAt(step4.length() - 1) == '.') {
               step4 = step4.substring(0, step4.length() - 1);
           }
       }
      // 5단계 - new_id가 빈 문자열이라면, new_id에 "a"를 대입

       String step5 = step4;
       if(step5.equals("")){
           step5 ="a";
       }
      // 6단계 - new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
       // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거

       String step6 = step5;
       if(step6.length()>=16){
           step6 = step6.substring(0,15);
           if(step6.charAt(step6.length()-1) == '.'){
               step6 = step6.substring(0,step6.length()-1);
           }
       }
     //  7단계 - new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임

       StringBuilder step7 = new StringBuilder(step6);
       if(step7.length() <= 2){
           char lastchar = step7.charAt(step7.length()-1);
           while(step7.length() < 3){ step7.append(lastchar); }
       }
       String answer = String.valueOf(step7);
       return answer;
   }


    // 랜덤문자열 생성(소문자)
    Random rndString = new Random();
    String randomStr = String.valueOf((char) ((int) (rndString.nextInt(26)) + 16));

    // 랜덤 숫자열 생성
    Random rndNum = new Random();
    String randomNum = String.valueOf(rndNum.nextInt(10));


    void setReCommandId() {
        for (int i = 1; i <= 15; i++) {
          if(rndString.nextBoolean()){
              this.randomStr = randomStr;
          }else{
              this.randomNum = randomNum;
          }
        }

    }
}