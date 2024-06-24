package Ensyu;

import java.util.ArrayList;

public class Ensyu06_01b {
  public static void main(String[] args){
    ArrayList<String> studentList = new ArrayList();

    studentList.add("佐藤");
    studentList.add("五十嵐");
    studentList.add("南");
    studentList.add("田中");
    studentList.add("佐々木");
    studentList.add("渡邉");
    studentList.add("山本");
    studentList.add("大久保");
    studentList.add("林");
    studentList.add("加藤");

    for (String name : studentList){
      if (name.length()>=3) {
        System.out.println(name);
      }
    }
  }

}
