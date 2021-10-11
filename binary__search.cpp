# include <iostream>
# include <bits\stdc++.h>

using namespace std;


void bubble_short(int a[], int s){
    int temp;
    for(int i=0; i<s; i++){
        for(int j=0; j<s-1; j++){
            if(a[j] > a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }

    for(int i=0; i<s; i++){
        cout<<a[i]<<"\t";
    }
}

int binary__search(int a[], int ub, int item){
    int lb = 0, mid;

    while (lb<=ub){
        mid = (lb + ub)/2;
        if (item>a[mid])
            lb = mid + 1;
        else if (item < a[mid])
            ub = mid - 1;
        else
            return mid;
    }

    return -1;
}



int main(){
    int s, a[100],f,loc;
    
    cout<<"Enter the size of array: ";
    cin>>s;
    cout<<"Enter the element: \n";
    for(int i=0; i<s; i++){
        cout<<"a["<<i<<"] = ";
        cin>>a[i];
    }

    bubble_short(a,s);
    cout<<endl<<"What number you find : ";
    cin>>f;
    loc = binary__search(a,s,f);
    if(loc==-1)
        cout<<"Number does not found \n";
    else
        cout<<f<<" Number found at position "<<(loc+1);

}