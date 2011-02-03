/* 
 * File:   main.c
 * Author: krzysztof
 *
 * Created on February 2, 2011, 4:00 PM
 */

#include <stdio.h>
#include <stdlib.h>


int three_n_1(int n){

    int result = 1;

    while (n != 1){

        if (n % 2 == 1)
            n = 3* n + 1;
        else
            n = n / 2;

        result++;
    }

    return result;
}

/*
 * 
 */

int main(int argc, char** argv) {

    int i;

    int a,b;
    int cycle_len = 0;
    int tmp;
    int down,up;

    while (scanf("%i %i\n",&a,&b) != EOF){

        int max = 0;

        if (a > b){
            down = b;
            up = a;
        } else {
            down = a;
            up = b;
        }

        for(i = down; i <= up; i++){

            cycle_len = three_n_1(i);

            if (cycle_len > max)
                max = cycle_len;
        }

        printf("%i %i %i\n", a,b,max);
    }

    return 0;
}

