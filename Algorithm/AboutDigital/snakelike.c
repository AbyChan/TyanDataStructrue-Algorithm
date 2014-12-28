#include<stdio.h>

void snakelike(int n){
  int k = 1, mi = 1;
  for(int i=1; i<=n; i++){
    for(int j=i+1; j<=n+1; j++){
      printf("%d", mi);
      if(j!=n+1)
	printf("\t");
      mi += j;
    }
    printf("\n");
    k = k+i;
    mi = k;
  }
}

int main(){
  int n;
  scanf("%d", &n);
  snakelike(n);
  return 0;
}
