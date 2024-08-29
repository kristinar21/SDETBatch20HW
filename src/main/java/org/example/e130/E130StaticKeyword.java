package org.example.e130;

public class E130StaticKeyword {

    public static void mystery(int[]arr){
        for (int i=0; i<arr.length;i++){
            if (arr[i]%2==0){
                arr[i]/=2;
            }else {
                arr[i]*=10;
            }
        }
    }
    public static void display(int[]arr){for (int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    }

    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        mystery(numbers);
        display(numbers);

    }
}
