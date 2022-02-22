package com.javacore.hw12;

public class Worker {
    private OnTaskDoneListener callback;
    public OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
                callback.onDone("Task " + i + " is done");
        }
    }
}
