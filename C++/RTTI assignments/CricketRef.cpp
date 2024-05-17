/*
 *  **********************************************************************
 *  * Create a base class "Cricket". Declare a pure virtual function 
 *  * "void play()" in it.
 *  * Define the following sub classes for this class:
 *  * a) FiftyOver
 *  * b) Test
 *  * c) TwentyOver
 *  * The "Test" class will have one more function "daywise_summary()".
 *  * Create a global function "void doit()" which accepts a reference 
 *  * of type Cricket so that it can invoke the "play()" function 
 *  * polymorphically. Inside this function, find out where exactly 
 *  * "Test" is stored using RTTI (dynamic_cast), and invoke the 
 *  * "daywise_summary()" function along with the "play()" function.
 *  **********************************************************************
 */

#include <iostream>

using namespace std;

class Cricket {
public:
    virtual void play() = 0;
};

class FiftyOver : public Cricket {
public:
    void play() {
        cout << "Lets play FiftyOver cricket" << endl;
    }
};

class Test : public Cricket {
public:
    void play() {
        cout << "Lets play Test cricket" << endl;
    }

    void daywise_summary() {
        cout << "Test match day wise summary" << endl;
    }
};

class TwentyOver : public Cricket {
public:
    void play() {
        cout << "Lets play TwentyOver cricket" << endl;
    }

};

void doit(Cricket &ptr) {
    ptr.play();
    try {
        Test &rf = dynamic_cast<Test &>(ptr);
        rf.daywise_summary();
    }
    catch (bad_cast &bc) {
        cout << "Error is: " << bc.what() << endl;
    }
}

int main() {
    FiftyOver fo;
    Test t;
    TwentyOver to;
    doit(fo);
    doit(t);
    doit(to);
    return 0;
}

