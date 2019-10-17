#include "dynarr.h"
#include<iostream>
using namespace std;

dynarr::dynarr()

{
    data = NULL;
    r=0,c=0;
}
dynarr::dynarr(int s,int p)
{
    data = new int*[s];
    for(int i=0;i<s;i++){
        for(int j=0;j<p;j++){
                data[i]=new int[c];


        }

    }
}
dynarr::~dynarr()
{
    delete [] data;
}

void dynarr::setvalue(int i, int j ,int v )
{
    data[i][j] = v;
    //ctor
}
int dynarr::getvalue(int r,int c){
  return data[r][c];

}
void dynarr::allocate (int r,int c)
{
    data= new int*[r];
    for(int i=0;i<r;i++){
        data[i]=new int[c];
    }

    // data= new int[p];

}







