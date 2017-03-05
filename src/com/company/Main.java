package com.company;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        String name = "ian";
//
//        Car toyota = new Car(4, 4, "vios", "4 cyliner", "red");
//        toyota.setDoors(1);
//        System.out.println(toyota.getDoors());
//        Car porsche = new Car("carrera");
//        System.out.println(porsche.getColor());


        Account ianAccount = new Account("14112", 2000, "ian",
                "adfa@assdas.com", "123141");

        ianAccount.deposit(3000);
        ianAccount.withdraw(3000);
    }
    

}
