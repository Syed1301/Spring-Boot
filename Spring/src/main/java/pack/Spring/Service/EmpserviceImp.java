package pack.Spring.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.Spring.Model.Empmodel;
import pack.Spring.Repository.Emprepository;

@Service
public class EmpserviceImp implements Empservice{
	
	@Autowired
	Emprepository emprepo;

	public void savedata(Empmodel emp) {
		// TODO Auto-generated method stub
		emprepo.save(emp);
		
	}

	public List<Empmodel> getdata() {
		List<Empmodel> obj = new ArrayList<Empmodel>();
		emprepo.findAll().forEach(emp ->obj.add(emp));
		return obj;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);
		
	}

	public void bulksave(List<Empmodel> emp) {
		// TODO Auto-generated method stub
		emprepo.saveAll(emp);
		
	}

	public List<Empmodel> Empascdata() {
		// TODO Auto-generated method stub
		
		List<Empmodel> obj =emprepo.Ascending();
		return obj;
	}

	

	

	/*
	 * public List<Empmodel> EmpAscending(List<Empmodel> emp) {
	 * 
	 * List<Empmodel> obj =
	 * emp.stream().sorted(Comparator.comparing(Empmodel::getUsername)).collect(
	 * Collectors.toList());
	 * 
	 * return obj;
	 * 
	 * }
	 */
	

}
