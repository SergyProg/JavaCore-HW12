package com.javacore.hw12;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}