package be.bastienhousiaux.quizz;

import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardListRepository;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardRepository;
import be.bastienhousiaux.quizz.dal.repositories.TypedDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);
    }


    @Autowired
    public MemoryCardListRepository memoryCardListRepository;
    @Autowired
    public MemoryCardRepository memoryCardRepository;
    @Autowired
    public TypedDataRepository typedDataRepository;


    @EventListener(ApplicationReadyEvent.class)
    private void generateData(){
        TypedDataEntity t1=new TypedDataEntity("Quel est cet animal?", DataTypeEnum.TEXT_DATA);
        TypedDataEntity t2=new TypedDataEntity("https://ds1.static.rtbf.be/article/image/370x208/6/b/e/14b9f9f80232cc66b1c3a558854f0232-1566208412.jpg",DataTypeEnum.IMAGE_URL_DATA);
        TypedDataEntity t3=new TypedDataEntity("batm...euh une chauve-souris",DataTypeEnum.TEXT_DATA);

        TypedDataEntity t4=new TypedDataEntity("What does the fox says?",DataTypeEnum.TEXT_DATA);
        TypedDataEntity t5=new TypedDataEntity("PAPAPA PAPAW",DataTypeEnum.TEXT_DATA);

        TypedDataEntity t6=new TypedDataEntity("https://upload.wikimedia.org/wikipedia/commons/9/9a/Flag_of_Bulgaria.svg",DataTypeEnum.IMAGE_URL_DATA);
        TypedDataEntity t7=new TypedDataEntity("De quel pays est ce drapeau?",DataTypeEnum.TEXT_DATA);
        TypedDataEntity t8=new TypedDataEntity("la bulgarie",DataTypeEnum.TEXT_DATA);

        MemoryCardEntity m1=new MemoryCardEntity();
        List<TypedDataEntity> m1Recto=m1.getRecto();
        List<TypedDataEntity> m1Verso=m1.getVerso();
        m1Recto.add(t1);
        m1Recto.add(t2);
        m1Verso.add(t3);

        MemoryCardEntity m2=new MemoryCardEntity();
        List<TypedDataEntity> m2Recto=m2.getRecto();
        List<TypedDataEntity> m2Verso=m2.getVerso();
        m2Recto.add(t4);
        m2Verso.add(t5);

        MemoryCardEntity m3=new MemoryCardEntity();
        List<TypedDataEntity> m3Recto=m3.getRecto();
        List<TypedDataEntity> m3Verso=m3.getVerso();
        m3Recto.add(t6);
        m3Recto.add(t7);
        m3Verso.add(t8);

        MemoryCardListEntity ml1=new MemoryCardListEntity();
        ml1.setName("Hello World Quizz");
        List<MemoryCardEntity> ml1Cards=ml1.getCards();
        ml1Cards.add(m1);
        ml1Cards.add(m2);
        ml1Cards.add(m3);

        memoryCardListRepository.save(ml1);
    }
}
