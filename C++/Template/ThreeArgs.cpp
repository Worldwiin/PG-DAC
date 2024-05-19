#include <iostream>

using namespace std;

template<class V1, class V2, class V3>
class Demo {
private:
    V1 p;
    V2 q;
    V3 r;
public:
    Demo(V1 p, V2 q, V3 r) {
        this->p = p;
        this->q = q;
        this->r = r;
    }

    void display() {
        cout << "Number: " << p << endl << "Name: " << q << endl << "Double value: " << r << endl;
    }

};

int main() {
    Demo<int, string, double> s(98, "Walter White", 3.14);
    s.display();
    return 0;
}
