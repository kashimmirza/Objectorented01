#include <iostream>
#include "dynarr.h"
#include "dynarr.cpp"

using namespace std;



 int main() {

    double  input, size;
    cin>>size;

    dynarr<double> di(size);



    for (int i = 0; i < size; i++) {

        cin >> input;

        di.setvalue(i, input);

    }

    for (int i = 0; i < size; i++) {

        cout << di.getvalue(i) << " ";

    }
}
