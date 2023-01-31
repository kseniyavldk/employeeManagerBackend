package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.Language;
import tech.getarrays.employeemanager.repo.LanguageRepo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LanguageService {
    private final LanguageRepo languageRepo;

    @Autowired
    public LanguageService(LanguageRepo languageRepo) {
        this.languageRepo = languageRepo;
    }
    public Language addLanguage(Language language){
        language.setLanguageCode (UUID.randomUUID().toString());
        return languageRepo.save(language);
    }

    public List<Language> findAllLanguage() {
        return languageRepo.findAll();
    }

    public Language updateLanguage(Language language) {
        return languageRepo.save(language);
    }

    public Object findLanguageById(Long id) {
        return languageRepo.findLanguageById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found") );

    }
    public void deleteLanguageById(Long id){
        languageRepo.deleteById(id);
    }

    public List<DropDown> findAllLanguages() {
        return languageRepo.findAll().stream()
                .map(o -> new DropDown(o.getId(),o.getName()))
                .collect(Collectors.toList());
    }
}
