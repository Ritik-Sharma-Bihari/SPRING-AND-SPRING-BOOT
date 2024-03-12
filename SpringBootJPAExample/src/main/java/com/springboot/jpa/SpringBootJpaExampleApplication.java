package com.springboot.jpa;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.jpa.dao.*;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

	public static void main(String[] args) {
	
		
	ApplicationContext context=	SpringApplication.run(SpringBootJpaExampleApplication.class, args);
	
	UserRepository bean = context.getBean(UserRepository.class);
	
//	User user = new User();
//	user.setName("Ritik boss");
//	user.setCity("Delhi");
//	user.setStatus("full stack mearn and java developer");
//	
//	User save = bean.save(user);
//	System.out.println(save);
//------------------CURD--------------------
//	User user1 = new User();
//	user1.setName("Ankit bhaiya");
//	user1.setCity("Jharkhand");
//	user1.setStatus("best ashthology");
//	
//	User user2 = new User();
//	user2.setName("Nitesh bhaiya");
//	user2.setCity("ushri");
//	user2.setStatus("good ashthology");
//	
//	User user3 = new User();
//	user3.setName("Rohit bhaiya");
//	user3.setCity("ushri khurd");
//	user3.setStatus("nice ashthology");
//	// to save in database
//	// to save single data into dataabase we are using the simple save() method
//	User save1 = bean.save(user1);
//	System.out.println("Saved user "+save1);
//	// to save more than one object in database
//	List<User> users = List.of(user2,user3);
//	Iterable<User> saveAll = bean.saveAll(users);
//	System.out.println(saveAll);
//	saveAll.forEach(user->{
//		System.out.println(user);
//	});
//	
	
//----------for update the data---------------------------
//	Optional<User> optional = bean.findById(4);
//	// to get the user
//	User user = optional.get();
//	// to change the name of user
//	user.setName("Abhi");
//	User changeData = bean.save(user);
//	System.out.println(changeData);
	
	
//// ------------for get data either one record or all------------------
//	// findById(id)-
//	Iterable<User> all = bean.findAll();
//	System.out.println("------by lambda--------");
//	// by lambda express
//	all.forEach(user->{
//		System.out.println(user);
//	});
//	System.out.println("--------------");
//	

//	// for delete record
//	bean.deleteById(4);
//	System.out.println("id 4: record deleted");
//	
//--------------------------------------------------------------------
	// ----for custom method-----------------
	List<User> byName = bean.findByName("Ankit bhaiya");
	List<User> byNameAndCity = bean.findByNameAndCity("Nitesh bhaiya", "ushri");
	List<User> byNameAndCity2 = bean.findByNameAndCity("Nitesh bhaiya", "delhi");
//	System.out.println("------find by name----------");
//	System.out.println(byName);
//	System.out.println("---------by name and city-----");
//	System.out.println(byNameAndCity);
//	System.out.println("---------by name or city-----");
//	System.out.println(byNameAndCity2);
	
//------------------------user Query-----------------------------------
	
	List<User> allUser = bean.getAllUser();
	System.out.println("------all users --------------");
	System.out.println(allUser);
	// by lambda express
	System.out.println("------by lambda --------------");
	allUser.forEach(user->{
		System.out.println(user);
	});
	
	System.out.println("----------------------");
	List<User> userByName = bean.getUserByName("Ritik boss");
	userByName.forEach(user->{
		System.out.println(user);
	});
	}

}






