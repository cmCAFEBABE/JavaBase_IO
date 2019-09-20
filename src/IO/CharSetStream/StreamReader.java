/**
 * @(#)InputStreamReader.java, 2019/9/20.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package IO.CharSetStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class StreamReader {

    public static void main(String[] args) {
        StreamReader streamReader=new StreamReader();
        streamReader.write();
        streamReader.read1();
        streamReader.read2();
    }
    private void read1(){
        String url=this.getClass().getResource("/").getPath()+"/Resource/test.txt";
        File file=new File(url);
        try(InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(file))){
            int len=-1;
            while ((len=inputStreamReader.read())!=-1){
                System.out.println((char)len);
            }
        }catch (IOException ignore){

        }
    }
    private void read2(){
        String url=this.getClass().getResource("/").getPath()+"/Resource/test.txt";
        File file=new File(url);
        try(InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(file),"utf-8")){
            char[] buffer=new char[20];
            int len=-1;
            while ((len=inputStreamReader.read(buffer))!=-1){
                System.out.println(new String(buffer,0,buffer.length));
            }
        }catch (IOException ignore){

        }
    }
    private void write(){
        String url=this.getClass().getResource("/").getPath()+"/Resource/test.txt";
        File file=new File(url);
        try(OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream(file))){
            outputStreamWriter.write(new String("我是陈敏") .toCharArray());
        }catch (IOException ignore){

        }
    }
}