package com.example.demo;

import com.example.demo.entity.DemoInfo;
import com.example.demo.mapper.DemoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@MapperScan("com.example.demo.mapper")
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DemoMapper demoMapper;

	@Test
	public void insert() {
		DemoInfo info = new DemoInfo();
		info.setId(2);
		info.setName("小明");
		demoMapper.insert(info);
	}
	@Test
	public void getAll() {

		List<DemoInfo> all = demoMapper.getAll();
		System.out.println();
	}
}
