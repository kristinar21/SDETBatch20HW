package org.example.e138;
public class E138AccessModifiers {
       private String privateMethod() {
              return "private";
       }
       String defaultMethod() {
              return "default";
       }
       protected String protectedMethod() {
              return "protected";
       }
       public String publicMethod() {
              return "public";
       }
       public static void main(String[] args) {

              E138AccessModifiers another=new E138AccessModifiers();
              System.out.println(another.defaultMethod());
              System.out.println(another.protectedMethod());
              System.out.println(another.publicMethod());
       }
}
