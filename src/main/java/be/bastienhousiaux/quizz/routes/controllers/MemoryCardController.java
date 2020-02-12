package be.bastienhousiaux.quizz.routes.controllers;


import be.bastienhousiaux.quizz.businesslogic.services.routers_services.MemoryCardService;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/memorycards")
public class MemoryCardController {

    @Autowired
    private MemoryCardService memoryCardService;


    @GetMapping("")
    public List<MemoryCardPresentable> getAll(){
        return this.memoryCardService.getAll();
    }

    @GetMapping("/{id}")
    public MemoryCardPresentable getById(@PathVariable("id") long id){
        return this.memoryCardService.getById(id);
    }

    @PostMapping("")
    public MemoryCardPresentable create(){
        return this.memoryCardService.create();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        this.memoryCardService.deleteById(id);
    }
}
