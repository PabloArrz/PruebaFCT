public class Ejemplo{
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for(int i=0; i<=10; i++){
            System.out.println(i);
            numeros[i] = i;
        }
        getBiggest(numeros);
    }

    public static void getBiggest(int[] arr) {
        int biggest = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        System.out.println("El mayor número es: " + biggest);
    }
}
