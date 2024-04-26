package pack.Spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.Spring.Model.Usermodel;

import pack.Spring.Repository.Userrepository;


@Service
public class UserserviceImp implements Userservice {

	@Autowired
	Userrepository userrepo;
    
	//requset all the data from database 
	public List<Usermodel> getAlluser() {
		// TODO Auto-generated method stub
		List<Usermodel> obj = new ArrayList<Usermodel>();
		userrepo.findAll().forEach(user1 ->obj.add(user1));
		
		return obj;
	}
   
	//to get the id from database 
	public Usermodel getEmpid(int uid) {
		
		return userrepo.findById((uid)).get();
	}

	//save the method in database
	public void savedata(Usermodel user) {
	
		userrepo.save(user);
	}
    //this method bulk save using for loop 
	public void savebulk(List<Usermodel> user) {
		// TODO Auto-generated method stub
		for(int i=0;i<user.size();i++) {
			userrepo.save(user.get(i));
		}
		
	}

	public Usermodel checkuser(Usermodel user) {
		// TODO Auto-generated method stub
		Usermodel obj = userrepo.checkuser(user.getUsername(), user.getPassword());
		return obj;
	}
	
	

}
