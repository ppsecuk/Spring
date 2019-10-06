package com.sda;

import com.sda.services.TranslationService;

public class Greeter {

    private final TranslationService translationService;
    private String language;

    public Greeter(TranslationService translationService) {
        this.translationService = translationService;
    }


    public String sayHello (String name){

        final String hello = translationService.translate("Hello", language);

        return hello + ", " + name + "!!!";
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage(){
        return language;
    }
}
