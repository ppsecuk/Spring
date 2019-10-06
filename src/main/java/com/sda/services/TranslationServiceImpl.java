package com.sda.services;

public class TranslationServiceImpl implements TranslationService {
    @Override
    public String translate(String word, String language) {
        switch (language){
            case "fr":
                return "Salut";
            case "es":
                return "Hola";
            case "de":
                return "Tschuss";
            default:
                return "Hello";
        }
    }
}
