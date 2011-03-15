/* 
 * File:   main.cpp
 * Author: krzysztof
 *
 * Created on March 14, 2011, 10:45 PM
 */

#include <cstdlib>
#include <vector>
#include <iostream>

using namespace std;


void gen(int N, vector<int>* sol, int max) {

    if (N == 0) {
        vector<int>::iterator iter = (*sol).begin();
        for (; iter < (*sol).end(); iter++) {
            cout << " " << *iter;
        }
        cout << endl;

        return;
    } else if (N < 0 ) {
        return;
    }

    for (int i = N; i > 0; i--) {
        (*sol).push_back(i);
        gen(N - i, sol, i);
        (*sol).pop_back();
    }

}

/*
 * 
 */
int main(int argc, char** argv) {

    vector<int> solution;

    gen(4, &solution, 1);

    return 0;
}

