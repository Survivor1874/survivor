package com.lin.learn.survivor;

import com.alibaba.fastjson.JSON;
import com.lin.learn.survivor.common.entity.User;
import com.lin.learn.survivor.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SurvivorApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
		List<User> users = userMapper.selectList(null);
		System.out.println(JSON.toJSONString(users));
	}

	@Test
	public void redisTest() {
		redisTemplate.setDefaultSerializer(new StringRedisSerializer());
		redisTemplate.opsForValue().set("a:b:c", 23407);
		Object o = redisTemplate.opsForValue().get("a:b:c");
		System.err.println(o);
	}

}
