package pack.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pack.Spring.Model.Usermodel;
import pack.Spring.Service.UserserviceImp;

@RestController
public class Usercontroller {
	
	@Autowired
	UserserviceImp service;
	
	//this api for get all the from database value
	@GetMapping("/usergetdata")
	private List<Usermodel> getAllusers(){
		return service.getAlluser();
	}
	
	//this api for value get from url then get from database return value // get the value from the database
	@GetMapping("/usergetid{uid}")
	private Usermodel getuser(@PathVariable("uid") int uid ) {
		return service.getEmpid(uid);
	}
	
	//this api use to insert value into database 
	@PostMapping("/usersave")
	private int saveorupdate(@RequestBody Usermodel user) {
		service.savedata(user);
		return user.getId();
	}
	
	//this api will work on the update data from database // put was update the data or database
	@PutMapping("/Userupdate")
	private Usermodel update(@RequestBody Usermodel user) {
		service.savedata(user);
		return user;
		
	}
	
	//this api work on bulk user save in database //post this save the data 
	@PostMapping("/bulksave")
    private List<Usermodel> bulksave(@RequestBody List<Usermodel> user){
		service.savebulk(user);
		return user;	
	}
	
	@PostMapping("/usercheck")
	private int check(@RequestBody Usermodel user) {
		Usermodel userobj = service.checkuser(user);
		return userobj.getId();
	}
	
}
