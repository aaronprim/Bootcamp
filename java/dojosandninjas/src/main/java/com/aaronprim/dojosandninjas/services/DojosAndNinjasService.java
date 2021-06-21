package com.aaronprim.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aaronprim.dojosandninjas.models.Dojo;
import com.aaronprim.dojosandninjas.models.Ninja;
import com.aaronprim.dojosandninjas.repositories.DojoRepo;
import com.aaronprim.dojosandninjas.repositories.NinjaRepo;

public class DojosAndNinjasService {
	private final DojoRepo dojoRepo;
	private final NinjaRepo ninjaRepo;
	
	public DojosAndNinjasService(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojos() {
		return dojoRepo.findAll();
	}
	
	public Dojo singleDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
}
