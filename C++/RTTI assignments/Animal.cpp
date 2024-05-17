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
