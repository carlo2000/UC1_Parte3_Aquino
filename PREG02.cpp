#include<iostream>
using namespace std ;
float array [1];
float N=0, suma=0;
int main(){
	
	
	cout<<"INGRESA DE N \t";
	cin >> N;
	cout<<"lA SUMA DE LOS N PRIMEROS NUMEROS NATURALES ES   ";
	for(int i = 1;i<=N;i++){
		suma +=i;
		
	}
	cout<<suma;
	
	return 0;
}
