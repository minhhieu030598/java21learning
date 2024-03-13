package org.minhhieu.service;

public class ImprovedStringHandler {
    public static void main(String[] args) {
        System.out.println(passedParamBySTR("hieu"));
        System.out.println(passedParamMultiLineBySTR("hieu"));
        System.out.println(passedParamExpressionBySTR("hieu"));
    }

    private static String passedParamBySTR(String name) {
        return STR."Hello \{ name }";
    }
    private static String passedParamMultiLineBySTR(String name) {
        return STR."""
                Hallo \{name}
                Welcome you come to here
                """;
    }
    private static String passedParamExpressionBySTR(String name) {
        return STR."""
                \{passedParamBySTR(name)}
                Welcome you come to here
                """;
    }

//    private static String passedParamByFMT(String name, String score) {
//        return FMT. """
//      {
//        "name": "\{ name }",
//        "temperature": "%2.2f\{ score }"
//      }
//      """;
//    }
}
