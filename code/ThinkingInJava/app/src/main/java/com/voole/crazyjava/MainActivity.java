package com.voole.crazyjava;


public class MainActivity {
    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        User user = new User();
//        user.
        int age = 1;
        mainActivity.test(age);
        System.out.println(age);
    }

    private void test(int user) {
        user = 12;
    }
}

class User {
    public int age;
}
