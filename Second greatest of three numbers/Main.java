#include<stdio.h>
int main()
{
int a,b,c,t;
  scanf("%d%d%d",&a,&b,&c);
  l1:
  if(a<b)
  {
    t=a;
    a=b;
    b=t;
  }
  if(b<c)
  {
    t=b;
    b=c;
    c=t;
    goto l1;
  }
  printf("%d",b);
}