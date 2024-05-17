/*
 *  **********************************************************************
 *  * Create a base class “Subject”.Declare pure virtual function “void maxmarks()” in it.
 *  * Define following sub classes for this class:
 *  * a) Maths
 *  * b) History
 *  * c) English.
 *  * Define “maxmarks” in these classes.
 *  * In main function, create array of pointer to Subject,
 *  * which will contain objects of these three sub classes.
 *  * Using RTTI, find out where is “History” and call its maxmarks() method.
 *  **********************************************************************
 */


#include <iostream>

using namespace std;

class Subject {
public:
    virtual void maxmarks() = 0;
};

class Math : public Subject {
public:
    void maxmarks() {
        cout << "Max marks for Maths: 100" << endl;
    }
};

class History : public Subject {
public:
    void maxmarks() {
        cout << "Max marks for History: 100" << endl;
    }

};

class English : public Subject {
public:
    void maxmarks() {
        cout << "Max marks for English: 100" << endl;
    }

};

int main() {
    Subject *ptr[] = {new Math, new History, new English};
//    for (int i = 0; i < 3; ++i) {
//        History *rf = dynamic_cast<History *>(ptr[i]);
//        if (rf) {
//            ptr[i]->maxmarks();
//        }
//    }
    for (int i = 0; i < 3; ++i) {
        if (typeid(*ptr[i]) == typeid(History)) {
            ptr[i]->maxmarks();
        }
    }
    return 0;
}

