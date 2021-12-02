package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClassDescription {

    private final  Class<?> Classtest;

    public TestClassDescription(Class<?> myClass){

       Classtest =myClass;


    }

    public List<Method> listTestMethods(){
        //Class<SomeLernejoTests> testClass = SomeLernejoTests.class;

       Method[] tab = Classtest.getDeclaredMethods();
       List<Method> list1 = null;

       for(int i= 0; tab.length > i ;i++){

           if(){

           }
       }
        Modifier.isStatic(Classtest.getModifiers());

       return list1;
    }
}
