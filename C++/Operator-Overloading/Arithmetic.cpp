/*
 *  **********************************************************************
 *  * Operator overloading:
 *  * Division (m1/m2)
 *  * Addition (m1+m2)
 *  * Subtraction (m1-m2)
 *  * Multiplication (m1*m2)
 *  * Comparison (m1>m2)
 *  **********************************************************************
 */

#include <iostream>

using namespace std;

class Myclass {
private:
    int num;
public:
    Myclass() {}

    Myclass(int k) {
        num = k;
    }

    //Division
    Myclass operator/(Myclass &ref) {
        return Myclass(num / ref.num);
    }

    //Addition
    Myclass operator+(Myclass &ref) {
        return Myclass(num + ref.num);
    }

    //Subtraction
    Myclass operator-(Myclass &ref) {
        return Myclass(num - ref.num);
    }

    //Multiplication
    Myclass operator*(Myclass &ref) {
        return Myclass(num * ref.num);
    }

    //Comparison
    bool operator>(Myclass &ref) {
        return num > ref.num;
    }

    void display() {
        cout << num << endl;

    }
};


int main() {
    Myclass m1(88), m2(8), result;

    result = m1 / m2;
    cout << "The division is: ";
    result.display();

    result = m1 + m2;
    cout << "The addition is: ";
    result.display();

    result = m1 - m2;
    cout << "The subtraction is: ";
    result.display();

    result = m1 * m2;
    cout << "The multiplication is: ";
    result.display();
    cout << endl;

    cout << "Comparison between m1 and m2: " << endl;
    if (m1 > m2) {
        cout << "m1 is greater " << endl;
    } else {
        cout << "M2 is greater" << endl;
    }

    return 0;
}
