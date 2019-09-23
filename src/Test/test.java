/**
 * @(#)test.java, 2019/9/21.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package Test;

import java.util.Arrays;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new byte[0]) );
    }

    private Integer ID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}