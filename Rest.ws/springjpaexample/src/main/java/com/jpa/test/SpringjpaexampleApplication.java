package com.jpa.test;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext  con=SpringApplication.run(SpringjpaexampleApplication.class, args);
	UserRepository UserRepository = con.getBean(UserRepository.class);
	// this for insert 
	//User user = new User();
	//user.setName("rupesh");
    //user.setCity("mumbai");
	//user.setStatus("rupesh is gym tranier");
	
	//this for display user
	//User displayuser = UserRepository.save(user);
	//System.out.println(displayuser);
	
	
	// this is for update
	
	//Optional<User> op = UserRepository.findById(1);
	
	//User user = op.get();
	//System.out.println(user);
	
	//user.setName("sanket");
	//User result = UserRepository.save(user);
	//		System.out.println(result);
	
	Iterable<User> itr = UserRepository.findAll();
	
	//for display method 1
	//Iterator<User> iterator = itr.iterator();
	//while(iterator.hasNext()) {
	//	User user=iterator.next();
	//	System.out.println(user);
	//}
	//for display method 2
		//itr.forEach(new Consumer<User>() {

		//	@Override
		//	public void accept(User t) {
				// TODO Auto-generated method stub
			//	System.out.println(t);
			//}
		//});
	
	// for display method method 3 or easy method
	
	//itr.forEach(user->{System.out.println(user);});
	
	// this for delete
	//UserRepository.deleteById(1);
	
	}

}
