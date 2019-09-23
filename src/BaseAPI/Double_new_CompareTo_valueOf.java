/**
 * @(#)Double_new_CompareTo_valueOf.java, 2019/9/23.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package BaseAPI;

/**
 * 比较Double类型new一个对象和调用静态方法valueOf
 *
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */

/**
 * 使用自动拆装箱或者valueOf方法的时候才会使用缓存机制
 */
public class Double_new_CompareTo_valueOf {
    public static void main(String[] args) {
        Paras_Number();
        System.out.println("---------------------------------------");
        Paras_String();
    }
    private static void Paras_Number(){
        int a=1;
        Integer a1=new Integer(a);
        Integer a2=new Integer(a);
        Integer a3=Integer.valueOf(a);
        Integer a4=Integer.valueOf(a);
        Integer a5=a;
        Integer a6=a;
        Integer a7=128;
        Integer a8=128;
        System.out.println(a1==a2);
        System.out.println(a1==a);
        System.out.println(a3==a4);
        System.out.println(a5==a6);
        System.out.println(a7==a8);
    }
    private static void Paras_String(){
        String a="127";
        Integer a1=new Integer(a);
        Integer a2=new Integer(a);

        Integer a3=Integer.valueOf(a);
        Integer a4=Integer.valueOf(a);

        Integer a7=128;
        Integer a8=128;
        System.out.println(a1==a2);
        System.out.println(a3==a4);
        System.out.println(a7==a8);
    }
}