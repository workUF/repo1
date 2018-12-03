package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
//        先获取spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //拿到代理对象
        ItemsDao bean = applicationContext.getBean(ItemsDao.class);
        Items items = bean.findById(1);
        System.out.println(items);

    }
}
