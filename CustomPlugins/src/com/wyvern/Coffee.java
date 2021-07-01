package com.wyvern;

public interface Coffee {
    public void crushBeans(String coffeeName) throws InterruptedException;
    public void brew(String coffeeName) throws InterruptedException;
    public void serve(String coffeeName);
}
