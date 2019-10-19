#ifndef DYNARR_H
#define DYNARR_H

template<class t>
class dynarr
{
    public:
        dynarr();
        dynarr(int);
        void setvalue(int ,t);
         t getvalue(int);
        ~dynarr();




    private:
        t*data;
        int size;
};

#endif // DYNARR_H
