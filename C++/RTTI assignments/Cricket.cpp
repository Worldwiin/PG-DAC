/*
 *  **********************************************************************
 *  * Create a base class "Cricket". Declare a pure virtual function 
 *  * "void play()" in it.
 *  * Define the following sub classes for this class:
 *  * a) FiftyOver
 *  * b) Test
 *  * c) TwentyOver
 *  * The "Test" class will have one more function "daywise_summary()".
 *  * Create an array of pointers to "Cricket" class having 3 elements. 
 *  * Store child class objects into this array.
 *  * Now, using RTTI, find out where "Test" is, and call "daywise_summary()" 
 *  * along with the "play()" function.
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

//void doit(Cricket &ptr) {
//    ptr.play();
//    try {
//        Test &rf = dynamic_cast<Test &>(ptr);
//        rf.daywise_summary();
//    }
//    catch (bad_cast &bc) {
//        cout << "Error is: " << bc.what() << endl;
//    }
//}

int main() {
    Cricket *ptr[]={new FiftyOver,new Test,new TwentyOver};
    for (int i = 0; i < 3; ++i) {
        //ptr[i]->play();
        Test* rf=dynamic_cast<Test*>(ptr[i]);
                if(rf){
                    ptr[i]->play();
                    rf->daywise_summary();
                }
    }
    return 0;
}

