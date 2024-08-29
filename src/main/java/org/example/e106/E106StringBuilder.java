package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Hello");
        stringBuffer.append(" World");

        String result = stringBuffer.toString().toUpperCase();
        System.out.println(result);


    }
}
