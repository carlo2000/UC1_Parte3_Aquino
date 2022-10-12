#include<iostream>
using namespace std ;
float array [1];
int main(){
	
	cout<<"INGRESA DATO 1 \t";
	cin >> array[0];
	cout<<"INGRESA DATO 2 \t";
	cin >> array[1];
	cout<<"Mostrar datos de salida   ";
	for(int i = 1;i>=0;i--){
		cout<<"  "<<array[i];
	}
	
	
	return 0;
}
