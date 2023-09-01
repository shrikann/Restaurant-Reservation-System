package com.example.demo.modelservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.modelproject.ModelSeat;
import com.example.demo.modelrepository.ModelRepository;

@Service
public class ModelService {
	@Autowired
	ModelRepository mr;
	
	//1.post details
	//postDetail for single Data Enter-----postDetails
	public ModelSeat postDetails(ModelSeat ms) {
		return mr.save(ms);
	}
	//postDetail for multi-Data Enter------post (n)number of Details
	public List<ModelSeat> postnDetails(List<ModelSeat> ms){
		return (List<ModelSeat>)mr.saveAll(ms);
	}
	//1.end of post details
	
	
	//2.update details
	public ModelSeat putDetails(ModelSeat ms) {
		return mr.saveAndFlush(ms);
	}
	public String changeinfobyid(int id,ModelSeat ms) {
		if(mr.existsById(id)) {
			mr.saveAndFlush(ms);
			return "updated";
		}
		return "invalid";
	}
	//3.delete----1
	public void deleteDetails(ModelSeat ms) {
		 mr.delete(ms);
	}
	//-----2
	public void deletebyId(int id) {
		mr.deleteById(id);
	}
	public List<ModelSeat> getDetails(){
		return mr.findAll();
	}
	//Sorting
			public List<ModelSeat> sortinginfo(String s){
				return mr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
			}
		//pagination
			public List<ModelSeat> getbypage(int pagno,int pgsize){
				Page<ModelSeat> p=mr.findAll(PageRequest.of(pagno, pgsize));
				return p.getContent();
			}
			//select jpql
			public List<ModelSeat>getinfos(int s){
				return mr.getstudentinfor(s);
			}
			//delete jpql
		     public int DeleteByQuery(int bookingid){
		    	 return mr.deleteBookById(bookingid);
		     }
		     //update jpql
		     public int UpdateByQuery(int newid,int oldid) {
		    	 return mr.updateBookById(newid,oldid);
		     }
			
			
}
