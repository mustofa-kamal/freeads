package com.cloudfoundary.mustofa;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.cloudfoundary.mustofa.entities.Post;
import com.cloudfoundary.mustofa.entities.User;
import com.cloudfoundary.mustofa.repositories.PostRepository;
import com.cloudfoundary.mustofa.repositories.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class AddDataTest {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PostRepository postRepository;

	@Test
	@Transactional
	public void testAddData() {
		User user = new User();
		user.setName("Tahira Nipa");
		user.setDateOfBirth(new GregorianCalendar(1973, 16, 7));
		user.setEmail("nipa@gmail.com");
		user.setGender('F');
		userRepository.save(user);

		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("First Post6");
		post.setUser(user);
		postRepository.save(post);

		Post post1 = new Post();
		post1.setPostDate(new Date());
		post1.setTitle("First Post7");
		post1.setUser(user);
		postRepository.save(post1);

		Post post2 = new Post();
		post2.setPostDate(new Date());
		post2.setTitle("First Post8");
		post2.setUser(user);
		postRepository.save(post2);

	}

	@Test
	@Transactional
	public void loadUser() {
		List<User> users = userRepository.findAll();
		for (User user : users) {
			List<Post> posts = (List<Post>)user.getPosts();
			for (Post post : posts) {
				System.out.println(post.getTitle());
			}
		}
	}
}
