package com.config;

public final class ConfigFactory {
    //adding final keyword to avoid extending this class Because some can extend this class in Driver class But there is no proper IS A relationship between Driver class and ConfigFactory class that's why we avoiding it by adding final keyword

    private ConfigFactory(){}
    //By making constructor private we are restricting the creation of object for this class i.e. No one can create an object for this class from outside of the class
    //We are not allowing to create object for this class is because there are no non-static methods present in this class
    public static FrameworkConfig getConfig(){

        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
