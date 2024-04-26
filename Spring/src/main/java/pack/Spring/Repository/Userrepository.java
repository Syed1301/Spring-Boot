package pack.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pack.Spring.Model.Usermodel;

public interface Userrepository  extends JpaRepository<Usermodel, Integer> {
	
	
	@Query(value="select*from userdetails u where u.username=:name and u.Password=:pass",nativeQuery=true)
	public Usermodel checkuser(String name,String pass);
	
	

}
