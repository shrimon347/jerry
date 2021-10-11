#include <iostream>
#include <bits\stdc++.h>
using namespace std;

int main(){
    int n,i,temp,j;
    cout<<"Enter the range of input number : ";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements :"<<endl;
    for ( i = 0; i < n; i++){
        cin>>arr[i];
    }

    //implement the insertion sort
    for(i=1;i<n;i++){
        temp = arr[i];
        j = i - 1;
        while((temp < arr[j]) && j>=0){
            arr[j+1] = arr[j];
            j = j - 1;
        }
        arr[j+1] = temp;
    }

    cout<<"The sorted array : \n";

    for(i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }

}
