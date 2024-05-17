/*
 *  **********************************************************************
 *  * Create a base class “StorageDevice”. Declare a pure virtual function
 *  * “void store()” in it.
 *  * Define the following subclasses for this class:
 *  * a) HardDisk
 *  * b) CD
 *  * c) PenDrive.
 *  * Define “store()” in these classes.
 *  *
 *  * Now, write a global function "perform()" which will accept a "StorageDevice"
 *  * class reference as an argument. In this function, using RTTI, invoke the
 *  * "store()" method of only “PenDrive”. Handle the bad_cast exception.
 *  *
 *  * From the main function, try to call the “perform()” function by passing
 *  * various child classes.
 *  **********************************************************************
 */
#include <iostream>

using namespace std;

class StorageDevice {
public:
    virtual void store() = 0;

};

class HardDisk : public StorageDevice {
public:
    void store() {
        cout << "Data stored using HardDisk" << endl;

    }
};

class CD : public StorageDevice {
public:
    void store() {
        cout << "Data stored using CD" << endl;

    }
};

class PenDrive : public StorageDevice {
public:
    void store() {
        cout << "Data stored using PenDrive" << endl;

    }
};

void perform(StorageDevice &ref) {
    try {
        PenDrive &pf = dynamic_cast<PenDrive &>(ref);
        pf.store();
    }
    catch (bad_cast &bc) {
        cout << "Error is: " << bc.what() << endl;

    }
}

int main() {
    HardDisk hd;
    CD cd;
    PenDrive pd;
    perform(hd);
    perform(cd);
    perform(pd);

    return 0;
}
