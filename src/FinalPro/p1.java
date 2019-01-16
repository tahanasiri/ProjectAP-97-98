package FinalPro;

import java.util.Scanner;

class Person{
    Scanner p=new Scanner(System.in);
    String Username;
    String Email;
    String Name;
    String FamilyName;
    String Password;
    boolean flag1=true;
    boolean flag2=true;
    void Check(){
        while (true){
            flag1=true;
            System.out.println("Enter Username: ");
            Username=p.next();
            for (int i = 0; i <Username.length() ; i++) {
                for (int j = 32; j <65 ; j++) {
                    if ((Username.charAt(i))==(char)j){
                        System.out.println("Not(1)valid");
                        flag1=false;
                        break;
                    }
                }
                if (flag1==false){
                    break;
                }

                for (int j = 91; j <97 ; j++) {
                    if (Username.charAt(i)==(char)j){
                        System.out.println("Not(2)valid");
                        flag1=false;
                        break;
                    }
                }
                if (flag1==false){
                    break;
                }
                for (int j = 123; j <127 ; j++) {
                    if (Username.charAt(i)==(char)j){
                        System.out.println("Not(3)valid");
                        flag1=false;
                        break;
                    }
                }
                if (flag1==false){
                    break;
                }
            }
            if (flag1==true){
                break;
            }
        }
    }
    String getUsername(){
        return Username;
    }
}
public class p1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean flag=true;

        Person[] p1=new Person[3];
        for (int i = 0; i <p1.length ; i++) {
            System.out.println("For i= "+i+" we have: ");
            p1[i]=new Person();
            p1[i].Check();
            if (i!=0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (p1[i].getUsername().compareTo(p1[j].getUsername())==0) {
                        System.out.println("Username is tekrari");
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    flag = true;
                    i--;
                    continue;
                }
            }
            System.out.println("---------------------------------------");
        }



    }
}
