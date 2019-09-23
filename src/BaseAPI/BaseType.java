/**
 * @(#)BaseType.java, 2019/9/20.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package BaseAPI;

/**
 * 使用Integer向Long型赋值的时候隐藏溢出问题
 *
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class BaseType {

    public static Long a;
    public static void main(String[] args) {
        LongDefaultValue();
    }
    public static void IntegerToLong(){
        int n=Integer.MAX_VALUE;
        System.out.println(n);
        n+=1;
        System.out.println(n);
        long nn=Integer.MAX_VALUE+1L;
        System.out.println(nn);
        long nnn=(long)(Integer.MAX_VALUE+1);
        System.out.println(nnn);
    }


    public static void LongDefaultValue(){
        System.out.println(a);
    }
}