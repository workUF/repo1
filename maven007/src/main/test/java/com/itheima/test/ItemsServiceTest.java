package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsServiceTest {
    @Test
    public void findById(){
//        先获取spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //拿到代理对象
        ItemsService bean = applicationContext.getBean(ItemsService.class);
        Items items = bean.findById(1);
        System.out.println(items);

    }
}
