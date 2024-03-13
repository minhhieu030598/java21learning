package org.minhhieu.service;

import org.minhhieu.service.model.Car;

import java.util.ArrayDeque;
import java.util.List;

public class UnnamedFeature {

    public static void main(String[] args) {

    }

    private static void unnamedInLoop() {
        var persons = List.of("A", "B", "C");
        for (var _ : persons) {
            System.out.println("Hallo");
        }

        persons.forEach(_ -> {
            System.out.println("Hallo");
        });

    }

    private static void tryCatch() {
        try {
            System.out.println("Expect that the error happens");
        } catch (NullPointerException _) {
            System.out.println("I don't want use the exception variable");
        } catch (UnsupportedOperationException _) {
            System.out.println("I also don't want use the exception variable");
        }
    }

    private static String removeOfQueue(ArrayDeque<String> queue) {
        var result = queue.poll();
        var _ = queue.poll();
        var _ = queue.poll();
        return result;
    }

    static String getObjectsColorWithUnnamedPattern(Object object) {
        var car = new Car("audi", "white", 1000L);
        if (car instanceof Car _) {

        }

        if (object instanceof Car(_, String color, _)) {
            return color;
        }
        return "No color!";
    }



}
