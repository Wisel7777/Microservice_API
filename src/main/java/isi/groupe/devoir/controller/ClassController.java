package isi.groupe.devoir.controller;

import isi.groupe.devoir.model.ClassEntity;
import isi.groupe.devoir.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    private ClassRepository classRepo;

    @GetMapping
    public List<ClassEntity> getAll() {
        return classRepo.findAll();
    }

    @PostMapping
    public ClassEntity create(@RequestBody ClassEntity cl) {
        return classRepo.save(cl);
    }
}
