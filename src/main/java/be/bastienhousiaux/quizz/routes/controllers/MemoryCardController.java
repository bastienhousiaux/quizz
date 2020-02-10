package be.bastienhousiaux.quizz.routes.controllers;


import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardRepository;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/memorycards")
public class MemoryCardController {

    @Autowired
    private MemoryCardRepository memoryCardRepository;




//    @GetMapping("")
//    public List<MemoryCardEntity> getAllMemoryCards(){
//        List<MemoryCardEntity> memoryCards=new ArrayList<>();
//         memoryCardRepository.findAll().forEach(memoryCards::add);
//         return memoryCards;
//    }
//
    @GetMapping("/hello")
    public String createMemoryCards(){
        return "hello world";
    }
}
