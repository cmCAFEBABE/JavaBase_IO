/**
 * @(#)String_IndexOutOfBoundsException.java, 2019/9/23.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package Exception;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class String_IndexOutOfBoundsException {
    public static void main(String[] args) {
        System.out.println("123".substring(99));
    }
}