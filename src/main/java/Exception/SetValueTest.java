/**
 * @(#)SetValueTest.java, 2019/9/23.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package Exception;

import java.io.IOException;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class SetValueTest {
    public static void main(String[] args) {
        SetValueTest setValueTest=new SetValueTest();
        System.out.println(setValueTest.download());
    }
    private byte[] download(){
        byte[] response=null;
        try{
            response=downloadBefore();
        }catch (Exception e){

        }
        return response;
    }

    private byte[] downloadBefore() throws Exception{
        byte[] arr=null;
            throw  new IOException();

//        return new byte[0];
    }

    private byte[] downloadBefore2() {
        byte[] arr=null;
        throw  new RuntimeException();
//        return new byte[0];
    }


}