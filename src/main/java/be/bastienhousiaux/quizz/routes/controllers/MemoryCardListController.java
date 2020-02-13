package be.bastienhousiaux.quizz.routes.controllers;
import be.bastienhousiaux.quizz.businesslogic.services.routers_services.MemoryCardListService;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/lists")
public class MemoryCardListController {

    @Autowired
    private MemoryCardListService memoryCardListService;

    @GetMapping("")
    public List<MemoryCardListPresentable> getAll(){
        return this.memoryCardListService.getAll();
    }

    @GetMapping("/{id}")
    public MemoryCardListPresentable getById(@PathVariable("id") long id){
        return this.memoryCardListService.getById(id);
    }

    @PostMapping("")
    public MemoryCardListPresentable create(){
        return this.memoryCardListService.create();
    }

    @PostMapping("/cards")
    public MemoryCardPresentable createCardInQuizz(@RequestParam("idQuizz") long idQuizz){
        return memoryCardListService.addCardToQuizz(idQuizz);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        this.memoryCardListService.deleteById(id);
    }
}
