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

