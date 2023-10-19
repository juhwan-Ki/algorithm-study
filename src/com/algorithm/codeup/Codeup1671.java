package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1671 {
    // 바위 = 0 가위 = 1 보 = 2
    // win, tie, lose
    public String play(int user, int computer){
        if(user == 0 && computer == 1) return "win";
        else if(user == 2 && computer == 0) return "win";
        else if(user == 1 && computer == 2) return "win";
        else if (user == computer) return "tie";
        else return "lose";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();
        Codeup1671 cd = new Codeup1671();
        System.out.println(cd.play(user,computer));

    }
}
