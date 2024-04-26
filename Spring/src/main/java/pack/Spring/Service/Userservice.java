package pack.Spring.Service;

import java.util.List;

import pack.Spring.Model.Usermodel;
import pack.Spring.Repository.Userrepository;

public interface Userservice {
	
	public List<Usermodel> getAlluser();
	
	public Usermodel getEmpid(int uid);
	
	public void savedata(Usermodel user);
	
	public void savebulk(List<Usermodel> user);

}
