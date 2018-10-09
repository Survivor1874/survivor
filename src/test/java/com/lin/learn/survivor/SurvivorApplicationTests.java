package com.lin.learn.survivor;

import com.alibaba.fastjson.JSON;
import com.lin.learn.survivor.common.entity.User;
import com.lin.learn.survivor.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SurvivorApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		List<User> users = userMapper.selectList(null);
		System.out.println(JSON.toJSONString(users));
	}

}
