/*
 *  **********************************************************************
 *  * Create a base class "Animal". Declare a pure virtual function 
 *  * "void makeSound()" in it.
 *  * Define the following sub classes for this class:
 *  * a) Dog
 *  * b) Cat
 *  * c) Tiger
 *  * The "Tiger" class will have one more function "hunting()".
 *  * Create a global function "void perform()" which accepts a pointer 
 *  * of type Animal so that it can invoke the "makeSound()" function 
 *  * polymorphically. Inside this function, find out where exactly 
 *  * "Tiger" is stored using RTTI (dynamic_cast), and invoke the 
 *  * "hunting()" function along with the "makeSound()" function.
 *  **********************************************************************
 */

#include <iostream>

using namespace std;

class Animal {
public:
    virtual void Makesound()=0;
};

class Dog : public Animal {
public:
    void Makesound() {
        cout << "Dog barks" << endl;
    }
};

class Cat : public Animal {
public:
    void Makesound() {
        cout << "Cat meows" << endl;
    }
};

class Tiger : public Animal {
public:
    void Makesound() {
        cout << "Tiger roars" << endl;
    }

    void hunting() {
        cout << "Tiger getting hunted" << endl;
    }
};

void perform(Animal *ptr) {
    Tiger *rf = dynamic_cast<Tiger *>(ptr);
    if (rf) {
        rf->Makesound();
        rf->hunting();
    }
}

int main() {
    perform(new Dog);
    perform(new Cat);
    perform(new Tiger);
    return 0;
}
