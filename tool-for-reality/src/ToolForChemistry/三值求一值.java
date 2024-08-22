package ToolForChemistry;

import InputManage.InputManage;

import java.util.Scanner;

public class 三值求一值 {
    private static double 质量分数=0, 密度=0, 摩尔质量=0, 物质的量浓度=0;
    public static void main(String[] args) {
        //Scanner in= new Scanner(System.in);
        System.out.println("输入溶质三个属性的值，所要求的属性的值输入0代替");

        double numerator=0,denominator=100;
        System.out.println("\n输入质量分数(先输入分子再输入分母):");
        numerator=(double) InputManage.input(()->new Scanner(System.in).nextDouble());
        denominator=(double) InputManage.input(()->new Scanner(System.in).nextDouble());
        质量分数 =numerator/denominator;
        System.out.println(质量分数);

        System.out.println("输入密度(单位为克每立方厘米):");
        密度 =1000*(double) InputManage.input(()->new Scanner(System.in).nextDouble());

        System.out.println("输入摩尔质量(单位为克每摩尔):");
        摩尔质量 = (double) InputManage.input(()->new Scanner(System.in).nextDouble());

        System.out.println("输入物质的量浓度(单位为摩尔每升):");
        物质的量浓度 = (double) InputManage.input(()->new Scanner(System.in).nextDouble());

        if(物质的量浓度==0) {
            物质的量浓度 = 密度 * 质量分数 / 摩尔质量;
            System.out.println("\n物质的量浓度为" + 物质的量浓度 + "摩尔每升");
        }
        if(摩尔质量==0) {
            摩尔质量 = 密度 * 质量分数 / 物质的量浓度;
            System.out.println("\n摩尔质量为" + 摩尔质量 + "克每摩尔");
        }
        if(密度==0) {
            密度 = 物质的量浓度 * 摩尔质量 / 质量分数 / 1000;
            System.out.println("\n密度为" + 密度 + "克每立方厘米");
        }
        if(质量分数==0) {
            质量分数 = 物质的量浓度 * 摩尔质量 / 密度;
            System.out.println("\n质量分数为" + 质量分数);
        }
        else System.out.println("错误输入");
    }
}
