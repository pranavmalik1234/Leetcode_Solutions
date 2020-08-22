TreeNode* findminright(TreeNode* A){
if(A==NULL)
return NULL;
while(A->left!=NULL){
A=A->left;
}
return A;
}

TreeNode* Solution::getSuccessor(TreeNode* A, int B) {
TreeNode* temp=A;
TreeNode* ancestor=NULL;
if(temp==NULL)
return NULL;
while(temp!=NULL){
if(temp->val>B){
ancestor = temp;
temp = temp->left;
}
else if(temp->val<B){
temp = temp->right;
}
else{
if(temp->right!=NULL){
return findminright(temp->right);
}
else{
return ancestor;
}
}
}
return temp;

}