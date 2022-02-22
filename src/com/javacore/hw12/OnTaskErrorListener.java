package com.javacore.hw12;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError() throws TaskException;
}