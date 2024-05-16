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

