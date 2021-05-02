package com.it.huihui;

import com.alibaba.fastjson.JSONObject;
import com.it.huihui.bean.User;
import javafx.scene.input.DataFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: workBefor
 * @description: mongoDB数据库测试
 * @author: Mr.Yuan
 * @create: 2021-05-03 03:52
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MongoTest.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void mongoTest(){
        /*List<User> users = new ArrayList<>();
        //int id, String name, String phone, int sex, int state, String desc, Long createTime, Long updateTime
        users.add(new User(1,"huihui1","13213589090",1,1,"", 16257675677L,16257675677L));
        users.add(new User(2,"huihui2","13213589090",1,1,"", 16257675677L,16257675677L));
        users.add(new User(3,"huihui3","13213589090",1,1,"", 16257675677L,16257675677L));
        mongoTemplate.insert(users,"myUser");*/
        List<User> all = mongoTemplate.findAll(User.class,"myUser");
        LOGGER.warn(JSONObject.toJSONString(all));

    }
}
