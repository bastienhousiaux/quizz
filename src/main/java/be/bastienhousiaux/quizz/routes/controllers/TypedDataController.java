package be.bastienhousiaux.quizz.routes.controllers;

import be.bastienhousiaux.quizz.businesslogic.services.routers_services.TypedDataService;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/datas")
public class TypedDataController {
    @Autowired
    private TypedDataService typedDataService;

    @DeleteMapping("/{id}")
    public void deleteDataChunkById(@PathVariable("id") long id){
        this.typedDataService.deleteTypedDataById(id);
    }

    @PatchMapping("/{id}/type")
    public void changeDataChunkType(@PathVariable("id") long id,@RequestParam("type") String type){
        this.typedDataService.changeTypedDataType(id,type);
    }

    @PatchMapping("/{id}/data")
    public void changeDataChunkData(@PathVariable("id") long id,@RequestParam("data") String data){
        this.typedDataService.changeTypedDataData(id,data);
    }
}
