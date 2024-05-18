#include <iostream>
using namespace std;

class myclass {
public:
    void disp() {
        cout << "myclass disp" << endl;
    }
    //Arrow overload
    myclass* operator->() {
        return this;
    }
    //Dereference operator * overload
    myclass& operator*() {
        return *this;
    }
};

int main() {
    myclass m;
    m.disp();//basic call
    m->disp();//->
    (*m).disp();//*
    return 0;
}