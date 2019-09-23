/**
 * @(#)Main_sike.java, 2019/9/23.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package Test.bishi;

import java.util.Scanner;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class Main_sike {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String filter="<sip:10000@172.16.130.42>";
//        StringBuffer stringBuufer=new StringBuffer(str);
//        for (int i=0;i<stringBuufer.length();i++){
//            if (stringBuufer.charAt(i)=='"'){
//                stringBuufer.deleteCharAt(i);
//                break;
//            }
//        }
//        for (int i=stringBuufer.length()-1;i>0;i--){
//            if (stringBuufer.charAt(i)=='"'){
//                stringBuufer.deleteCharAt(i);
//                break;
//            }
//        }
//        stringBuufer

        String str2= str.replaceAll(filter,"").replaceAll("\"","").replaceAll(";","");
        StringBuffer stringBuffer=new StringBuffer(str2);
        for (int i=0;i<stringBuffer.length();i++){
            if(stringBuffer.charAt(i)>'z'||stringBuffer.charAt(i)<'A'){
                stringBuffer.deleteCharAt(i--);
            }else {
                break;
            }
        }
        for (int i=stringBuffer.length()-1;i>0;i--){
            if(stringBuffer.charAt(i)>'z'||stringBuffer.charAt(i)<'A'){
                stringBuffer.deleteCharAt(i++);
            }else {
                break;
            }
        }
        System.out.println(str2);
    }
}