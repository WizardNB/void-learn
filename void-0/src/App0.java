import Company.Employee;
import Company.Manager;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App0 {

    public static void main(String... args) {
        //JOptionPane.showMessageDialog(null,"1-录入经理；2-录入员工");
        //Runtime.getRuntime().exec(cmd);
        App0.Company();

    }

    public static void Company() {
        Scanner in = new Scanner(System.in);
        //主要功能
        switch (in.nextInt()) {
            //录入经理
            case 1:
                var tempManagerList = new Manager[100];
                int u = 0;
                //用户输入
                for (int i = 1; i == 1; u++) {
                    System.out.println("录入经理,名称：");
                    in.nextLine();
                    String name = in.nextLine();
                    System.out.println("基础工资：");
                    var salary = in.nextInt();
                    System.out.println("奖金：");
                    var bonus = in.nextInt();
                    tempManagerList[u] = new Manager(name, salary, bonus);
                    //结束循环
                    System.out.println("是否继续录入？\n1-是，0-否");
                    i = in.nextInt();
                }
                //去除冗余元素
                var managerList = Arrays.copyOf(tempManagerList, u);
                Arrays.sort(managerList, Comparator.comparing(m->m.name));
                //打印结果
                System.out.println(Arrays.toString(managerList));
                Toolkit.getDefaultToolkit().beep();
                break;
            //录入员工
            case 2:
                var employees = new ArrayList<Employee>(10);
                for (int i = 1; i == 1; ) {
                    System.out.println("录入员工,名称：");
                    in.nextLine();
                    var name = in.nextLine();
                    System.out.println("基础工资：");
                    var salary = in.nextInt();
                    employees.add(new Employee(name, salary));
                    System.out.println("是否继续录入？\n1-是，0-否");
                    i = in.nextInt();
                }
                employees.trimToSize();
                System.out.println(employees);
                break;
            //错误处理
            default:
                System.out.println("错误输入");
        }
    }
}
