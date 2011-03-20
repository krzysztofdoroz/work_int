/* 
 * File:   main.c
 * Author: krzysztof
 *
 * Created on March 16, 2011, 12:36 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

#define printi(arg) printf("%u ",arg);
#define println printf("\n");
#define prints(arg) printf("%s\n",arg);

typedef struct elemT{
    int data;
    struct elemT* next;
}element;

void traverse_the_list(element* head){

    element* current_node = head;

    while(current_node != NULL){
        printi(current_node->data);
        current_node = current_node->next;
    }
    println

}

int insert_new_node(element** head, int value)
{
    element* newElem = (element*)malloc(sizeof(element));

    if(newElem == NULL){
        return 0;
    }

    newElem->data = value;
    newElem->next = *head;

    *head = newElem;

    return 1;
}

foo(int x)
   {   if(x>0)
          foo(--x);
       printf("%d",x);
   }


//interprets underlying memory as ints
void interpret_memory(void* start, int size){
    int i;
    int* val;
    val = (int*)start;

    for(i = 0; i < size / 4 ; i++){
        printi(*val)

        val++;
    }

}

int find_elem_in_list(element* head, int searchedValue)
{
    while(head){

        if(head->data == searchedValue){
            return 1;
        }

        head = head->next;
    }

    return 0;
}


/*
 * 
 */
int main(int argc, char** argv) {

    /*
      element a,b,c;
    a.next = &b;
    a.data = 1;

    b.next = &c;
    b.data = 2;
    
    c.next = NULL;
    c.data = 3;
*/
    element* head = NULL;
    
    insert_new_node(&head,1);
    insert_new_node(&head,4);

    traverse_the_list(head);

    if (find_elem_in_list(head, 4)){
        prints("element found!")
    } else {
        prints("element not found!")
    }

    interpret_memory(head,sizeof(element));

    println

    foo(5);

    println

    int a[2];

    printi(sizeof(a))

    return (EXIT_SUCCESS);
}

