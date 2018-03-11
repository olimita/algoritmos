#include <iostream>

int main() {
  char n;
  std::cin >> n;
  char arreglo[n];
  arreglo[0] = 0;
  arreglo[1] = 1;
  for(int i = 2; i <= n; i++){
    arreglo[i] = arreglo[i-1]+arreglo[i-2];
  }
  std::cout << arreglo[n];
}
