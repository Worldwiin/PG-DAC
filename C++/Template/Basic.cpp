#include <iostream>

using namespace std;

class Demo {
public:
    template<class V>
    void display(V a, V b) {
        cout << "Character name is: " << a << " " << b << endl;
    }
};

int main() {
    Demo d;
    string a = "Tanjiro";
    string b = "Kamado";
    d.display(a, b);
    return 0;
}
