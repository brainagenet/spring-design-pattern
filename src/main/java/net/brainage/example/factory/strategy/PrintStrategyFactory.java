package net.brainage.example.factory.strategy;

public interface PrintStrategyFactory {

    PrintStrategy getPrintStrategy(String strategyName);

}
