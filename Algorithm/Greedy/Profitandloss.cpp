#include <iostream>

using namespace std;

int solve(int s, int d)
{
 if(4*s-d<0)
  return 10*s-2*d;
 if(3*s-2*d<0)
  return 8*s-4*d;
 if(2*s-3*d)
  return 6*s-6*d;
 if(s-4*d<0)
  return 3*s-9*d;
 return -1;
}

int main()
{
 int s, d;
 while(cin>>s>>d)
 {
  int sum = solve(s,d);
  if(sum<0)
   cout<<"Deficit"<<endl;
  else
   cout<<sum<<endl;
 }
 return 0;
}
