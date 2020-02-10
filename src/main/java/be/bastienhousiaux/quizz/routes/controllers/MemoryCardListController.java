package be.bastienhousiaux.quizz.routes.controllers;

import be.bastienhousiaux.quizz.businesslogic.services.MemoryCardListService;
import be.bastienhousiaux.quizz.routes.mappers.MemoryCardListPresentableMapper;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@CrossOrigin
@RequestMapping("/lists")
public class MemoryCardListController {

    @Autowired
    private MemoryCardListService memoryCardListService;
    @Autowired
    private MemoryCardListPresentableMapper memoryCardListPresentableMapper;

    @GetMapping("/{id}")
    public MemoryCardListPresentable getMemoryCardListById(@RequestParam long id){

        return memoryCardListPresentableMapper.toSource(
                memoryCardListService.getMemoryCardListById(id)
        );
    }

    @GetMapping("/test")
    public MemoryCardListPresentable createTestData(){
        MemoryCardPresentable mem=new MemoryCardPresentable();

        val recto=new ArrayList<DataChunkPresentable>();
        val verso=new ArrayList<DataChunkPresentable>();

        recto.add(new DataChunkPresentable("quel est cet animal?","text"));
        recto.add(new DataChunkPresentable("https://lh3.googleusercontent.com/proxy/tYi77Im4LgBEawtT4_7iTeJKfOi0DIU39tzxIAA1nvnRnRBQcgJ8isxGg6KKdFFK4dE-YgF3DFiZsppv_EU00zNG9jWf3A3yULkwo9iS_KUxNmvRZGFHTH4PcshBssQtuW8xJ8jwMJ4"
        ,"image"));

        verso.add(new DataChunkPresentable("batm...euh une chauve-souris!","text"));

        mem.setRecto(recto);
        mem.setVerso(verso);

        MemoryCardPresentable mem2=new MemoryCardPresentable();

        val recto2=new ArrayList<DataChunkPresentable>();
        val verso2=new ArrayList<DataChunkPresentable>();

        recto2.add(new DataChunkPresentable("quel est la capitale","text"));
        recto2.add(new DataChunkPresentable("de l'italie","text"));

        verso2.add(new DataChunkPresentable("rome","text"));
        verso2.add(new DataChunkPresentable("https://outspot-3-outspot.netdna-ssl.com/assets/gallery/5159/1_w1.jpg","image"));

        mem2.setRecto(recto);
        mem2.setVerso(verso);

        MemoryCardPresentable mem3=new MemoryCardPresentable();

        val recto3=new ArrayList<DataChunkPresentable>();
        val verso3=new ArrayList<DataChunkPresentable>();

        recto3.add(new DataChunkPresentable("comment ca va?","text"));

        verso3.add(new DataChunkPresentable("bien?","text"));
        verso3.add(new DataChunkPresentable("pas bien?","text"));

        mem3.setRecto(recto);
        mem3.setVerso(verso);

        val cards=new ArrayList<MemoryCardPresentable>();
        cards.add(mem);
        cards.add(mem2);
        cards.add(mem3);
        val list=new MemoryCardListPresentable();
        list.setCards(cards);

        return list;
    }
}
