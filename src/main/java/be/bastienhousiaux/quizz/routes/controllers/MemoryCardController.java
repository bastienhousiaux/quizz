package be.bastienhousiaux.quizz.routes.controllers;


import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardRepository;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/memorycards")
public class MemoryCardController {

    @Autowired
    private MemoryCardRepository memoryCardRepository;


    @GetMapping("/test")
    public MemoryCardPresentable getTest(){
        MemoryCardPresentable mem=new MemoryCardPresentable();

        val recto=new ArrayList<DataChunkPresentable>();
        val verso=new ArrayList<DataChunkPresentable>();

        recto.add(new DataChunkPresentable("text","quel est cet animal?"));
        recto.add(new DataChunkPresentable("image","https://lh3.googleusercontent.com/proxy/tYi77Im4LgBEawtT4_7iTeJKfOi0DIU39tzxIAA1nvnRnRBQcgJ8isxGg6KKdFFK4dE-YgF3DFiZsppv_EU00zNG9jWf3A3yULkwo9iS_KUxNmvRZGFHTH4PcshBssQtuW8xJ8jwMJ4"));

        verso.add(new DataChunkPresentable("text","batm...euh une chauve-souris!"));

        mem.setRecto(recto);
        mem.setVerso(verso);
        return mem;
    }

//    @GetMapping("")
//    public List<MemoryCardEntity> getAllMemoryCards(){
//        List<MemoryCardEntity> memoryCards=new ArrayList<>();
//         memoryCardRepository.findAll().forEach(memoryCards::add);
//         return memoryCards;
//    }
//
//    @PostMapping("")
//    public String createMemoryCards(String card){
//        return "hello "+card;
//    }
}
