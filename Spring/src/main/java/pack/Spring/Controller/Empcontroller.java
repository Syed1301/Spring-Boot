package pack.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pack.Spring.Model.Empmodel;
import pack.Spring.Service.EmpserviceImp;

@RestController
public class Empcontroller {
	
	@Autowired
	EmpserviceImp service;
	
	
	//update or save in database insert
	@PostMapping("/emp")
	private int empsave(@RequestBody Empmodel emp) {
		service.savedata(emp);
		return emp.getId();
	}

	
	//update or insert data 
	@PutMapping("/empupdate")
	private Empmodel update(@RequestBody Empmodel emp) {
		service.savedata(emp);
		return emp;
		
	}
	
	//get all the value in database
	@GetMapping("/empdata")
	private List<Empmodel> data(){
		
		return service.getdata();
	}
	
	
	//delete value 
	@DeleteMapping("/empdelete/{id}")
	private String empdelete(@PathVariable int id) {
		
		service.delete(id);
		
		return "Delete value";
		
	}
	
	   //bulk user api 
		@PostMapping("/empbulk")
		private String bulk(@RequestBody List<Empmodel> emp) {
			service.bulksave(emp);
			return "save success";
			
		}
	
	//ascending order 
	/*
	 * @GetMapping("empasc") private List<Empmodel> ascending(@RequestBody
	 * List<Empmodel> emp) {
	 * 
	 * service.EmpAscending(emp);
	 * 
	 * return emp;
	 * 
	 * }
	 */
		@GetMapping("empAsc")
		private List<Empmodel> Asce() {
			List<Empmodel> obj1 = service.Empascdata();
			return obj1;
		}
		
	
	
}
