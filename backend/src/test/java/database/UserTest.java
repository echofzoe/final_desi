package database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ryj.yuyue.service.UserService;

/**
 * 和会员卡有关的所有测试
 * @author Thor
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserTest {

	private static final Logger logger = 
			LoggerFactory.getLogger(UserTest.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void getUserTest() throws Exception {
		logger.info("getUserTest: {}", 
				userService.getUser(
						null,
						null,
						null));
	}
}
