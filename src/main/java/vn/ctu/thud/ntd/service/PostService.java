package vn.ctu.thud.ntd.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import vn.ctu.thud.ntd.entity.PostEntity;

@Service
public class PostService {
	
	private List<PostEntity> posts = new ArrayList<>(Arrays.asList(
		new PostEntity(1,"Spring Boot","Statert","Lession One"),
		new PostEntity(2,"Spring MVC","Statert","Lession One")
	));

	public List<PostEntity> getPosts() {
		return posts;
	}

	public PostEntity getPost(long id) {
		return posts.stream().filter(t->t.getId()==id).findFirst().get();
	}

	public void addPost(PostEntity post) {
		posts.add(post);
	}

	public void updatePost(long id, PostEntity post) {
		for(int i=0; i<posts.size(); i++) {
			PostEntity p =  posts.get(i);
			if(p.getId()==id) {
				posts.set(i,post);	
				return;
			}
		}
	}		
}
