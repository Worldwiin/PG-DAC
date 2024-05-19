#include <iostream>

using namespace std;

template<class V>
class Demo {
private:
    V s;
public:
    Demo(V s) {
        this->s = s;
    }

    void displayVal() {
        cout << "Value is: " << s << endl;
    }
    int sizeType(){
        return sizeof s;
    }


};

int main() {
    Demo<double> d(3.14);
    d.displayVal();
    cout<<"Size of data type Double is: "<<d.sizeType()<<endl;
    return 0;
}
