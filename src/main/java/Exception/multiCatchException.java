/**
 * @(#)multiCatchException.java, 2019/9/23.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package Exception;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class multiCatchException {
    public static void main(String[] args) {

        test();
    }
    private static void test(){
        try{
            throw  new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("Runing");
        }catch (Exception e){
            System.out.println("Exc");
        }
    }
}