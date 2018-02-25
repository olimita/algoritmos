import java.util.Scanner;
import java.math.BigInteger;

class Serie{
  int n;
  BigInteger arreglo[];

  public Serie(int n){
    n= n;
    arreglo = new BigInteger[n+1];
    arreglo[0]= BigInteger.ZERO;
    arreglo[1]= BigInteger.ONE;
    for(int i = 2; i<=n;i++){
      arreglo[i]= arreglo[i-1].add(arreglo[i-2]);
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Serie fibo = new Serie(n);
    System.out.println(fibo.arreglo[n]);
  }}
