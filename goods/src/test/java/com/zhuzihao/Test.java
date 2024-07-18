package com.zhuzihao;

import com.zhuzihao.config.YmlConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    YmlConfig ymlConfig;

    @org.junit.Test
    public void test(){
        String name = ymlConfig.getName();
        Integer age = ymlConfig.getAge();
        System.out.println("name:"+name+"= age:"+age);
    }
}
