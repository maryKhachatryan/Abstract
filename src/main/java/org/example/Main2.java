package org.example;

public class Main2 {
    public static void main(String[] args){
        OuterClass outer = new OuterClass(42, "Hello");

        //Testing Regular Inner Class
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        //Testing Static Nested Class
        OuterClass.StaticNestedClass.staticDisplay();

        //Testing Local Class
        outer.testLocalClass();
    }
}
