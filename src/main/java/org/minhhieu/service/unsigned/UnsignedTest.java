package org.minhhieu.service.unsigned;

public class UnsignedTest {


    public static void main(String[] args) {
        Long number = Long.MAX_VALUE + 10;
        System.out.println(number);
        Long number1 = Long.parseUnsignedLong("12345678901234567890");
        System.out.println(Long.toUnsignedString(number1));
    }
}
