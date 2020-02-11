package be.bastienhousiaux.quizz.utils.mapping;

public interface Mapper<In, Out> {
    Out map(In toMap);
}
