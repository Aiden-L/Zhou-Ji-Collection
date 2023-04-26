package com.xzr.webdemo.dto;

public class UserHolder {
    public static ThreadLocal<String> threadLocal;

    public static void saveUser(String userID) {
        threadLocal.set(userID);
    }

    public static String getUser() {
        return threadLocal.get();
    }

    public static void removeUser() {
        threadLocal.remove();
    }
}
