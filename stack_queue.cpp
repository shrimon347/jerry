# include <iostream>
# include <bits\stdc++.h>

using namespace std;

int main(){
    int data[50], top = -1, case_no=0, item,font=-1,rear=-1;

    while (case_no !=6){
        cout<<"\n #############################################################"<<endl;
        cout<<"-----------------Stack & Queue Operation in one array------------------"<<endl;
        cout<<"1:PUSH \n2:POP \n3:Insertion \n4:Deletion \n5:DISPLAY ELEMENT \n6:EXIT"<<endl;

        cout<<"Enter your choice : ";
        cin>>case_no;

        switch (case_no)
        {
        case 1:
            if(top==49)
                cout<<endl<<"Array is FULL"<<endl;
            else{
                if(font==-1){
                    font=0;
                }
                cout<<"Enter the DATA: ";
                cin>>item;
                top = top + 1;
                data[top] = item;
            }
            break;
        
        case 2:
            if(top==-1)
                cout<<endl<<"Array is EMPTY"<<endl;
            else{
                cout<<"POP ELEMENT: "<<data[top];
                top--;
            }
            break;
        
        case 3:
            if(rear==49) cout<<"\n\nArray is FULL!!!";
            else{
                if(font==-1){
                    font=0;
                }
                cout<<"\n\nEnter the data : ";
                cin>>item;

                top =top+1;
                data[top] = item;
            }
            break;

        case 4:
            if(font==-1 || font>top) cout<<"\n\nArray is empty.";
            else{
                cout<<"\n\nDeleation the element:"<<data[font];
                font++;                
            }
            break;
        
        case 5:
            if(top==-1 || font==-1)
                cout<<endl<<"Array is EMPTY"<<endl;
            else{
                cout<<"DISPLAY ELEMENT On Array: ";
                for(int i=font; i<=top; i++){
                    cout<<data[i]<<"\t";
                }
            }
            break;
        
        default: 
            cout<<endl<<"Not a good choice...............!";
        }
    }

    return 0;
}