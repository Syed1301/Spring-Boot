package pack.Spring.Service;

import java.util.List;

import pack.Spring.Model.Empmodel;

public interface Empservice {

	
	public void savedata(Empmodel emp);
 
	public List<Empmodel> getdata();
	
	public void delete(int id);
	
	public void bulksave(List<Empmodel> emp);
	
	
	public List<Empmodel> Empascdata();
}
