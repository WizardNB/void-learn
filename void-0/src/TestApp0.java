import InputManage.InputManage;

import java.util.Scanner;

public class TestApp0 {
    public static void main(String[] args) {
        //System.out.println(int.class.getName());
        int a = (int) InputManage.Input1(()->new Scanner(System.in).nextInt());
        System.out.println(a+a);
    }
}
