package com.it.huihui;

import com.alibaba.fastjson.JSONObject;
import com.it.huihui.mapper.UserMapper;
import com.it.huihui.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: workBefor
 * @description: mysql数据库测试
 * @author: Mr.Yuan
 * @create: 2021-05-03 03:44
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MysqlTest.class);

    @Autowired
    UserMapper userMapper;

    @Test
    public void testMysql(){
        User user = userMapper.selectByPrimaryKey(1002);
        LOGGER.warn(JSONObject.toJSONString(user));
    }

}
