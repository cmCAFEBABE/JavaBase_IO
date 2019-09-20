/**
 * @(#)BufferInPutSteam.java, 2019/9/20.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package IO.ByteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class BufferSteam {
    public static void main(String[] args) {
        BufferSteam bufferSteam=new BufferSteam();
        bufferSteam.write();
        bufferSteam.read();
    }
    private void read (){
        String path=this.getClass().getResource("/").getPath()+"/Resource/test.txt";
        File file=new File(path);
        try(BufferedInputStream bufferInPutSteam=new BufferedInputStream(new FileInputStream(file) )){
            byte[] buffer=new byte[20];
            int len=-1;
            while ((len=bufferInPutSteam.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len)+" ");
            }
        }catch (IOException ignore){

        }
    }
    private void write(){
        String path=this.getClass().getResource("/").getPath()+"/Resource/test.txt";
        File file=new File(path);
        try(BufferedOutputStream bufferedOutPutSteam=new BufferedOutputStream(new FileOutputStream(file) )){
            bufferedOutPutSteam.write("chenmin1995".getBytes());
        }catch (IOException ignore){

        }
    }
}