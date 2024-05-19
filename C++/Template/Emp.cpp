#include <iostream>

using namespace std;

class Emp {
private:
    int data = 100;
public:
    template<class V>
    void display(V s) {
        cout << "The value passed is: " << s << endl;
    }

    friend ostream &operator<<(ostream &, Emp &);
};

ostream &operator<<(ostream &os, Emp &em) {
    os << em.data;
    return os;
}

int main() {
    Emp e;
    e.display(98);
    e.display(e);//will give 100
    return 0;
}
