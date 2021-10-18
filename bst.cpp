#include <iostream>
#include <bits\stdc++.h>

using namespace std;

struct bst_node{
    int data;
    bst_node* left;
    bst_node* right;
};

bst_node* create(int data){
    bst_node* temp = new bst_node();
    temp->data=data;
    temp->right=temp->left=NULL;
    return temp;

}

void Insert(bst_node* &root, int data){
    if(root == NULL){
        root = create(data);
    }else if (root->data>data)
        Insert(root->left,data);
    else Insert(root->right,data);
}

void display(bst_node* root){//inorder == sorted value
    if(root!=NULL){
        display(root->left);
        cout<<root->data<<" ";
        display(root->right);
    }
}
int main(){
    bst_node* root = NULL; //creating a empty tree
    int n,num;
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>num,Insert(root,num);
    display(root);
}