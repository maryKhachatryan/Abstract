package org.example;

class OuterClass {
    private int outerNumber;
    private String outerString;

    public OuterClass(int outerNumber, String outerString){
        this.outerNumber = outerNumber;
        this.outerString = outerString;
    }
    class InnerClass{
        void display(){
            System.out.println("InnerClass: outerNumber = " + outerNumber + " , outerString = " + outerString);
        }
    }
    static class StaticNestedClass{
        static void staticDisplay(){
            System.out.println("StaticNestedClass: This is Sparta");
        }
    }
    public void testLocalClass(){
        class LocalClass{
            void localDicplay(){
                System.out.println("LocalClass: This is a local class");
            }
        }
        LocalClass local = new LocalClass();
        local.localDicplay();
    }
}
