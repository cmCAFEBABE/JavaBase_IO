package IO.ByteStream; /**
 * @(#)FileInputStream.java, 2019/9/19.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class FileStream {


    public static void main(String[] args) {
        FileStream fileStream=new FileStream();
        fileStream.write();
        fileStream.read();
        System.out.println();
        fileStream.read2();
    }
    private void read(){
        String path=this.getClass().getResource("/").getPath();
        try(FileInputStream inputStream=new FileInputStream(new File(path+"/Resource/test.txt"))){
            System.out.println(path);
            int len=-1;
            while((len=inputStream.read())!=-1){
                System.out.print((char)len+" ");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    private void read2(){
        String path=this.getClass().getResource("/").getPath();
        try(FileInputStream inputStream=new FileInputStream(new File(path+"/Resource/test.txt"))){
            byte[] buffer=new byte[2];
            int len=-1;
            while((len=inputStream.read(buffer))!=-1){
                System.out.print(new String(buffer,0,len)+" ");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private void write(){
        String path=this.getClass().getResource("/").getPath();
        File file=new File(path+"/Resource/test.txt");
        try(OutputStream outputStream=new FileOutputStream(file);
            OutputStream outputStream2=new FileOutputStream(file,true)){
            outputStream.write("CHENMIN".getBytes());
            //追加换行符
            outputStream2.write("\r\n".getBytes());
            outputStream2.write("chenmin123123".getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}