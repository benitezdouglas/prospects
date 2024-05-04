package online.ect.prospect.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import online.ect.prospect.model.Prospect;
import online.ect.prospect.service.ProspectService;

@RestController
@RequestMapping("api/v1/prospects")
public class ProspectController {

    @Autowired
    private ProspectService prospectService;

    @GetMapping
    public ResponseEntity<List<Prospect>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(prospectService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Prospect>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(prospectService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Prospect> create(@RequestBody Prospect prospect){
        return ResponseEntity.status(HttpStatus.CREATED).body(prospectService.save(prospect));
    }

    @PutMapping
    public ResponseEntity<Prospect> update(@RequestBody Prospect prospect){
        return ResponseEntity.status(HttpStatus.OK).body(prospectService.update(prospect));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    	prospectService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}