package ru.mirea.pr10.task2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictrorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
