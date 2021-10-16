package com.renanbueno.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renanbueno.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User renan = new User("1", "Renan Bueno", "renanbueno@gmail.com");
		User fernanda = new User("1", "Fernanda Marie", "fernandamaria@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(renan, fernanda));
		return ResponseEntity.ok().body(list);
	}
}
