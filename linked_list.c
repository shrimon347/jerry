#include <stdio.h>
#include <stdlib.h>

struct node{

    int data;
    struct node* link;

};

struct node*root = NULL;

int main()
{
        int ch;
        while(1){
        printf("\n*******************************Single Linked List Operation**************************\n");
        printf("1.Create Linked List\t2.Insertion at any position.\t3.Delete at any position.\t4.Display.\t5.Quit\n");
        printf("\nEnter your choice :");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: append();
                    break;
            case 2: insertion();
                    break;
            case 3: deletion();
                    break;
            case 4: display();
                    break;
            case 5: exit(1);
            default: printf("Invalid choice..!!!\n\n");
        }
    }

    return 0;
}

void append()
{
    struct node* temp;
    temp = (struct node*) malloc(sizeof(struct node));
    printf("\nEnter a data :");
    scanf("%d",&temp ->data);
    temp ->link = NULL;//list is empty.
    if(root==NULL){
        root=temp;
    }
    else{
        struct node* p;
        p = root;
        while(p ->link != NULL){
            p = p -> link;
        }
        p -> link = temp;

    }
}

void insertion()
{
    struct node* new_node;
    int n,i;
    new_node = (struct node*) malloc(sizeof(struct node));
    printf("\nEnter a data :");
    scanf("%d",&new_node -> data);
    new_node ->link=NULL;
    printf("Enter the positon to insert data :");
    scanf("%d",&n);
    if(n==1){
        new_node ->link = root;
        root=new_node;
    }
    else{
        struct node* temp = root;
        for(i=1;i<n-1;i++){
            temp=temp ->link;
        }
        new_node->link=temp ->link;
        temp ->link= new_node;
    }
}

void deletion()
{
    struct node* temp=root;
    int n,i;
    printf("Entea a position to delete data :");
    scanf("%d",&n);
    if(n==1){
        root=temp->link;
        free(temp);
    }
    else{
        for(i=1;i<n-2;i++){
            temp=temp->link;
        }
        struct node* temp2 = temp->link;
        temp->link=temp2->link;
        free(temp2);
    }
}

void display()
{
    struct node* temp;
    temp = root ;
    if(temp== NULL){
        printf("List is empty...!!\n\n");
    }
    else{
        while(temp != NULL){
            printf("%d-->",temp->data);
            temp = temp->link;
        }
        printf("\n\n");

    }
}

