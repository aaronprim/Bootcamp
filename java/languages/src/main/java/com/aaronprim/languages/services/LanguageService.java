package com.aaronprim.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aaronprim.languages.models.Language;
import com.aaronprim.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	public Language findLang(Long id) {
		Optional<Language> optionalLanguage = langRepo.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}
		else {
			return null;
		}
		
	} 
	
	public Language addLang(Language lang) {
		return langRepo.save(lang);
	}
	
	public void deleteLang(Long id) {
		langRepo.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
