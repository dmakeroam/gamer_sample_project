package th.in.gamer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import th.in.gamer.user.response.UserStatusResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ReactGamerApplication.class, webEnvironment=WebEnvironment.RANDOM_PORT)
public class ReactGamerApplicationTests {
	
	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void contextLoads() {
	}
	
//	@Test
//	public void testUserFindById(){
//		int id = 1;
//		User user = testRestTemplate.getForObject("http://localhost:8080/api/v1/user/"+id, User.class);
//		assertEquals(user.getId(), 1);
//		assertEquals(user.getUserName(), "Test");
//	}
	
	@Test
	public void testUserDeleteById(){
		int id = 2;
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		HttpEntity<Integer> requestDelete = new HttpEntity<>(null, headers);
		
		ResponseEntity<UserStatusResponse> response = testRestTemplate.exchange("http://localhost:8080/api/v1/user/delete/"+id, HttpMethod.DELETE, requestDelete, UserStatusResponse.class);
		
		UserStatusResponse responseObject = response.getBody();
		
		assertEquals(responseObject.isStatus(), true);
		assertEquals(responseObject.getActionType(), "delete");
	}

}
