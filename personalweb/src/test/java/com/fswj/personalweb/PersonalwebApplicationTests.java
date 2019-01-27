package com.fswj.personalweb;

import com.fswj.personalweb.entity.TravelLog;
import com.fswj.personalweb.mapper.TravelLogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonalwebApplicationTests {
	@Autowired
	private TravelLogMapper travelLogMapper;
	@Test
	public void contextLoads() {

	}

}

