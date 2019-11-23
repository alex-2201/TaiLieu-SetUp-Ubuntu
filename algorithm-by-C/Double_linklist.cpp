#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int data;
	struct Node* next;
	struct Node* prev;
}Node;

Node* InsertNode(Node** head, int index, int x) {
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = x;
	
	if (index < 0) return NULL;

  if (index == 0) { // chen vao vi tri 0
		newNode->next = *head;
		newNode->prev = NULL;
		*head = newNode;
    if(newNode->next != NULL)
      (newNode->next)->prev = newNode; 
		return newNode;
	}

  int currIndex = 1; // vi tri 0 - head
  Node* currNode = *head;

  while (currNode->next && index >= currIndex) { 
    currNode = currNode->next;
    currIndex++;
  }

  if(currNode->next == NULL){
    if (index > currIndex) { // chi so vuot qua cho phep
      return NULL;
    }
    if (index == currIndex) { // them vao cuoi
      newNode->next = NULL;
      newNode->prev = currNode;
      currNode->next = newNode;
      return newNode;
    }
  }

    // them vao giua
		newNode->next = currNode;
		newNode->prev = currNode->prev;
		currNode->prev = newNode;
		(newNode->prev)->next = newNode;

	return newNode;
}

void Display(Node* head){
  while(head!=NULL) {
    printf("%d ", head->data);
    head = head->next;
  }
}

int main(){
	Node* dblink1 = NULL;
  	InsertNode(&dblink1, 0, 100);
  	InsertNode(&dblink1, 0, 200);
    InsertNode(&dblink1, 1, 600);
    InsertNode(&dblink1, 3, 188);
  	Display(dblink1);
	return 0;
}
