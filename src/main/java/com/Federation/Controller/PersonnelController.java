package com.Federation.Controller;


import com.Federation.Personnel.CrewMember;
import com.Federation.Repository.PersonnelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonnelController {
    private final PersonnelRepository repository;

    public PersonnelController(PersonnelRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/crew")
    private Iterable<CrewMember> getAllCrewMembersFromDB(){
        return this.repository.findAll();
    }

    @PostMapping("/crew")
    private void addCrewmembersToDB(@RequestBody CrewMember crewMember ){
        this.repository.save(crewMember);
    }
}
