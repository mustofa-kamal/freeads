package com.cloudfoundary.mustofa;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.cloudfoundary.mustofa.entities.Post;
import com.cloudfoundary.mustofa.repositories.PostRepository;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class PostRepositoryTest {

	@Autowired
	PostRepository repository;
	@Test
	public void test() {
		/*
		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("First Post4");
		repository.save(post);
		
		
		
		List<Post> dbpost= repository.findByTitle("First Post3");
		
		assertNotNull(dbpost);
		
		assertEquals(dbpost.get(0).getTitle(), "First Post3");
		
		
		System.out.println(dbpost.get(0).getPostId());
		*/
	}
	
	

}
