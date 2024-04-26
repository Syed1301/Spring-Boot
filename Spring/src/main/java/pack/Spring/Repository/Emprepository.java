package pack.Spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pack.Spring.Model.Empmodel;

public interface Emprepository extends JpaRepository<Empmodel, Integer>{
	

	@Query(value="select * from Empdata e order by e.username",nativeQuery=true)
	public List<Empmodel> Ascending();
	

}
