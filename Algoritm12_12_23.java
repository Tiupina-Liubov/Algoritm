package PACKAGE_NAME;

public class Algoritm12_12_23 {
    public static void main(String[] args) {
        int[]numbers={40, 250, 80, 88, 240, 12, 148};
    }
 public static int min(int[] numbers){
        int i=0;
        int temp=0;
     if(numbers[i]>numbers[i+1]) {
        temp=numbers[i];
        numbers[i]=numbers[i+1];
        numbers[i+1]=temp;
     }
     return temp;
 }


}
