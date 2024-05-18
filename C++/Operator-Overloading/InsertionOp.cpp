#include <fstream>
#include <iostream>
#include <cstring>
using namespace std;

class Person {
private:
    char name[20];
    int age;

public:
    Person(const char* name, int age) {
        strcpy_s(this->name, strlen(name) + 1, name);
        this->age = age;
    }

    Person() {
        strcpy_s(this->name, 2, "");
        this->age = 0;
    }

    void setName(const char* name) {
        strcpy_s(this->name, strlen(name) + 1, name);
    }

    char* getName() {
        return name;
    }

    void setAge(int age) {
        this->age = age;
    }

    int getAge() const {
        return age;
    }

    friend ostream& operator<<(ostream&, const Person&);
};

ostream& operator<<(ostream& o, const Person& ref) {
    o << ref.name << "\t" << ref.age << endl;
    return o;
}

int main() {
    Person p1("Eren Yeager", 22);
    cout << p1 << endl;// Internal representation: operator<<(cout, p1);
    return 0;
}