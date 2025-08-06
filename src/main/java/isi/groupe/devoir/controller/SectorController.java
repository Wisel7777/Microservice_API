package isi.groupe.devoir.controller;

import isi.groupe.devoir.model.Sector;
import isi.groupe.devoir.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sectors")
public class SectorController {
    @Autowired
    private SectorRepository sectorRepo;

    @GetMapping
    public List<Sector> getAll() {
        return sectorRepo.findAll();
    }

    @PostMapping
    public Sector create(@RequestBody Sector sector) {
        return sectorRepo.save(sector);
    }
}
