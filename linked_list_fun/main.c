/* 
 * File:   main.c
 * Author: krzysztof
 *
 * Created on March 16, 2011, 12:36 AM
 */

#include <stdio.h>
#include <stdlib.h>

#define printi(arg) printf("%u ",arg);
#define println printf("\n");

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

//interprets underlying memory as ints
void interpret_memory(void* start, int size){
    char* beg = (char*)start;
    int i;
    int* val;
    val = (int*)start;

    for(i = 0; i < size / 4 ; i++){
        printi(*val)

        val++;
    }

}

/*
 * 
 */
int main(int argc, char** argv) {
    element a,b,c;
    a.next = &b;
    a.data = 1;

    b.next = &c;
    b.data = 2;
    
    c.next = NULL;
    c.data = 3;

    traverse_the_list(&a);

    
    printi(&a)
    println
    interpret_memory(&a,sizeof(element));
    println
    printi(&b)
    println
    interpret_memory(&b,sizeof(element));
    println
    printi(&c)
    interpret_memory(&c,sizeof(element));

    println

    return (EXIT_SUCCESS);
}

