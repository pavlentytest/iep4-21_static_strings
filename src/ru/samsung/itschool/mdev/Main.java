package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        Table wood_table = new Table();
        wood_table.legs = 3;
        wood_table.doMove();

        Table metal_table = new Table();
        System.out.println(metal_table.legs); // 3
        metal_table.doMove();

        Table.doMove();
        Table.legs = 4;
      // Table.PI = 123123;

        System.out.println();

        // Класс - System
        // Метод - println() метод класса PrintStream
        // out - статичное поле класса System



        String str1 = new String("Hello");
        String str2 = new String("Hello");
        // System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2));// true

        // литеральное задание строк
        String a1 = "Moscow";
        String a2 = "Moscow";
        // System.out.println(a1 == a2); // true

        // Переменная типа String - неизменяемая (immutable)
        String b1 = "School";
        System.out.println(b1.hashCode());
        b1 += "12312312";

        System.out.println(b1.hashCode());

        // Класс для работы с измен. строками (mutable)
        // StringBuilder, StringBuffer

        StringBuilder strb = new StringBuilder("sdklfgadl");
        System.out.println(strb.hashCode());
        strb.append("sdfgsdfg");
        System.out.println(strb.hashCode());

        String str_ = strb.toString(); // "sdklfgadlsdfgsdfg"

        char ch = 'A';



    }
}
