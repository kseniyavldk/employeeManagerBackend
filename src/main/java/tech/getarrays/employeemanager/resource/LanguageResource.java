package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.Language;
import tech.getarrays.employeemanager.service.LanguageService;

import java.util.List;

@RestController
@RequestMapping("/language")
public class LanguageResource {
    private final LanguageService languageService;

    public LanguageResource(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Language>> getAllLanguage () {
        List<Language> language = languageService.findAllLanguage();
        return new ResponseEntity<>(language, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Language> getLanguageById (@PathVariable("id") Long id) {
        Language language = (Language) languageService.findLanguageById(id);
        return new ResponseEntity<>(language, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Language> addLanguage(@RequestBody Language language) {
        Language newLanguage = languageService.addLanguage(language);
        return new ResponseEntity<>(newLanguage, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Language> updateLanguage(@RequestBody Language language) {
        Language updateLanguage = languageService.updateLanguage(language);
        return new ResponseEntity<>(updateLanguage, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLanguage(@PathVariable("id") Long id) {
        languageService.deleteLanguageById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/allKeyValue")
    public ResponseEntity<List<DropDown>> getAllLanguages () {
        List<DropDown> user = languageService.findAllLanguages();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
