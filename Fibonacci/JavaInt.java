import java.util.Scanner;

class Serie{
  int n;
  int arreglo[];

  public Serie(int n){
    n= n;
    arreglo = new int[n+1];
    arreglo[0]= 0;
    arreglo[1]=1;
    for(int i = 2; i<=n;i++){
      arreglo[i]= arreglo[i-1]+arreglo[i-2];
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
