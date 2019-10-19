#include "dynarr.h"
#include<iostream>
using namespace std;
template<class t>
dynarr<t>::dynarr(int s)
{
    data = new t[s];
    size = s;
    //ctor
}
template<class t>
dynarr<t>::~dynarr()
{
    delete[]data;
}
template<class t>
t dynarr<t>:: getvalue(int dex)
{
    return data[dex];
}
template<class t>
void dynarr<t>::setvalue(int k,t value){
    data[k]=value;
}


