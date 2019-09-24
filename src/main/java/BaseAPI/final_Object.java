/**
 * @(#)final_Object.java, 2019/9/24.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package BaseAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class final_Object {
    public static final String[] str={"123","4325"};
    public static final String[] str2= {"123","4325"};
    public static final List<String> list= Collections.unmodifiableList(Arrays.asList("123","456")) ;
    public static final List<String> list2= Arrays.asList("123","456") ;
    public static final List<String> list3= new ArrayList<>(Arrays.asList("123","456") );
    public static final List<String> list4=Collections.unmodifiableList( new ArrayList<>(Arrays.asList("123","456") )) ;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(str));
        str[1]="321231";
        System.out.println(Arrays.toString(str));
        System.out.println("--------------------------------");
        list2.set(0,"123123");
        System.out.println(list2);
        //下面加了就会抛不支持操作异常
        //list2.add("123");
        list3.add("123");
        System.out.println("----------------------------------");
        System.out.println(list3);
        System.out.println("------------------------");
        System.out.println(list4);
        list4.add("123");
        System.out.println(list4);
    }
}