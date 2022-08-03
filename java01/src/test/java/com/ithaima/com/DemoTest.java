package com.ithaima.com;

import com.itheima.com.Demo1;
import junit.framework.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testsay(){
        Demo1 d = new Demo1();
        String ret = d.say("itheima");
        Assert.assertEquals("helloitheima",ret);

    }
}
