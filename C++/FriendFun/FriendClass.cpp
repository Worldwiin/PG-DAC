#include <iostream>
using namespace std;

class Second; // Forward declaration

class First {
private:
    int a = 98;

public:
    friend class Second;
};

class Second {
public:
    void fun1(First* f) {
        cout << "Accessing member of class First in class Second fun1(): " << f->a << endl; //invoke using ->
    }

    void fun2(First& f) {
        cout << "Accessing member of class First in class Second fun2(): " << f.a << endl;
    }

    void fun3(First& f) {
        cout << "Accessing member of class First in class Second fun3(): " << f.a << endl;
    }
};

int main() {
    First f;
    Second s;
    s.fun1(&f); // Using pointer
    s.fun2(f);  // Using reference
    s.fun3(f);
    return 0;
}
