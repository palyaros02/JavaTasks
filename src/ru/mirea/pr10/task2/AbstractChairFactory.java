package ru.mirea.pr10.task2;

public interface AbstractChairFactory {
    public VictorianChair createVictrorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
