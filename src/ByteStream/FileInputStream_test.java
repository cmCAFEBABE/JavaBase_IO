package ByteStream; /**
 * @(#)FileInputStream.java, 2019/9/19.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class FileInputStream_test {


    public static void main(String[] args) {
        new FileInputStream_test().test();
    }
    private void test(){
        try{
            String path=this.getClass().getResource("/").getPath();
            System.out.println(path);
            InputStream inputStream=new FileInputStream(new File(path+"/Resource/test.txt"));
            int len=-1;
            while((len=inputStream.read())!=-1){
                System.out.println((char)len);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}