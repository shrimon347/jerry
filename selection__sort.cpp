# include <iostream>
# include <bits\stdc++.h>

using namespace std;

int main(){
    
    int n;
    cout<<"Enter the length of array : ";
    cin>>n;
    
    //input the array
    int arr[n];
    cout<<"Enter the elements : "<<endl;
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    //displaying the arry
    cout<<"Inputing arry element are : ";
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }

    //sort the array.
    int low, temp,j;
    for(int i=0; i<n-1; i++){
        low = i;
        for(int j=i+1; j<n; j++){
            if(arr[j] < arr[low]){
                low = j;
            }
        }

        temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;
    }

    //sorted array are displaying
    cout<<"\n Sorted array elemnets are : ";
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}