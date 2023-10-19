package com.example.javaproject.codeup;

import java.util.*;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class Codeup3108 {
    private List<Student> students = new ArrayList<Student>() {};

    // Student를 생성하는 메소드
    public Student makeAStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    private void addAStudent(Student student){
        if(!isExists(student)){
            students.add(student);
        }
    }

    // private로 사용한 이유는 해당 메소드가 해당 클래스 내에서만 사용하기 떄문에 굳이 public으로 할 필요가 없다
    private boolean isExists(Student pStudent){
        // 중복 여부 체크
        for(Student st : students){
            if(pStudent.getTestId() == st.getTestId()) return true;
        }
        return false;
    }

    private void removeStudent(Student pStudent){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }

    public void printStudent(){
        for(Student student : students){
            System.out.printf("%s %s %s\n",student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(String[] sArr){
        // 정렬
        Collections.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        System.out.println(students.size());
        for (int i = 0; i < sArr.length; i++) {
            Student student = students.get(Integer.parseInt(sArr[i]) -1);
            System.out.printf("%s %s\n",student.getTestId(), student.getName());
        }
    }

    public void process(String code, int testId, String name){
        Student st = makeAStudent(code, testId, name);
        if(code.equals("I")) addAStudent(st);
        else removeStudent(st);
    }

    public static void main(String[] args) {
        Codeup3108 codeup3108 = new Codeup3108();
        Scanner sc = new Scanner(System.in);
        int inputRange = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < inputRange; i++) {
            String code = sc.next();
            int testId = sc.nextInt();
            String name = sc.next();

            codeup3108.process(code, testId, name);
        }
        sc.nextLine();
        String[] number = sc.nextLine().split(" ");
        codeup3108.printStudent();
        //codeup3108.printSpecificStudents(number);
    }
}
