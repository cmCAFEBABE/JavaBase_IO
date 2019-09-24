/**
 * @(#)LocalClassTest.java, 2019/9/21.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package LocalClass;

import java.util.Locale;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class LocalClassTest {
    public static void main(String[] args) {
        String str="asdf中文Google";
        String str2="ASDF中文GOOGLE";
        System.out.println(str.toUpperCase(Locale.US).equals(str2));
        System.out.println(str.toUpperCase(Locale.CHINA).equals(str2));
        System.out.println(str.toUpperCase(Locale.CANADA).equals(str2));
        System.out.println(str.toUpperCase(new Locale("tr")).equals(str2));
        System.out.println("谷歌Google".toLowerCase(new Locale("tr")).equals("谷歌google"));

    }
}