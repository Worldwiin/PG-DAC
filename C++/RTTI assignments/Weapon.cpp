/*
 *  **********************************************************************
 *  * Create a base class "Weapon". Declare a pure virtual function 
 *  * "void attack()" in it.
 *  * Define the following sub classes for this class:
 *  * a) Gun
 *  * b) Sword
 *  * c) Rifle
 *  * The "Rifle" class will have one more function "Chambering()".
 *  * Create an array of pointers to Weapon having 3 elements.
 *  * In this array, store the instances of child classes.
 *  * Traverse the array, find out where exactly "Rifle" is stored using 
 *  * RTTI (dynamic_cast), and invoke the "Chambering()" function along 
 *  * with the "attack()" function.
 *  **********************************************************************
 */

#include <iostream>

using namespace std;

class Weapon {
public:
    virtual void attack()=0;
};

class Gun : public Weapon {
public:
    void attack() {
        cout << "This is a Gun attack" << endl;
    }
};

class Sword : public Weapon {
public:
    void attack() {
        cout << "This is a Sword attack" << endl;
    }
};

class Rifle : public Weapon {
public:
    void attack() {
        cout << "Rifle attack" << endl;
    }

    void chambering() {
        cout << "Riffle getting chambered" << endl;
    }
};

int main() {
    Weapon *ptr[] = {new Gun, new Sword, new Rifle};
    for (int i = 0; i < 3; ++i) {
       // ptr[i]->attack();
        Rifle *rf = dynamic_cast<Rifle *>(ptr[i]);
        if (rf) {
            rf->chambering();
            ptr[i]->attack();
        }

    }
    return 0;
}

