package be.bastienhousiaux.quizz.utils.mapping;


public interface Mapper<Source, Distant> {
    Source toSource(Distant distant);
    Distant toDistant(Source source);
}
