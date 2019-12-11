package co.simplon.apidemo.controller;

import co.simplon.apidemo.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private List<Person> personList;

    public PersonController() {
        personList = new ArrayList<>();
        personList.add(new Person("Grand", "Jules", "1890257",LocalDate.of(1989, 2, 6)));
        personList.add(new Person("Hugueney", "Bernard", "1800675", LocalDate.of(1980, 6, 15)));
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(personList);
    }

    @PostMapping
    public void create(@RequestBody Person personToCreate) {
        personList.add(personToCreate);
        System.out.println(personToCreate);
    }

    @GetMapping("/{paramDeRecherche}")
    public ResponseEntity<Person> getOne(@PathVariable String paramDeRecherche) {
        for (Person person : personList) {
            if (person.getSecuSociale().equalsIgnoreCase(paramDeRecherche)) {
                return ResponseEntity.ok(person);
            }
        }

        return ResponseEntity.notFound().build();
    }
}
