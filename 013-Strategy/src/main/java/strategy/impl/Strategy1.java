package strategy.impl;

import strategy.IStrategy;

/**
 * Created by STZHANGJK on 2016.9.28.
 */
public class Strategy1 implements IStrategy {
    @Override
    public void use() {
        System.out.println("strategy1 used!");
    }
}
