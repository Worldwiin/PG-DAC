#include <iostream>
#include <cstring> // Include <cstring> for strcat

using namespace std;

// Forward declarations to declare the existence of classes before defining them
class Second; 

class First {
    char str1[20] = "Quentin";

    // Friend function declaration
    friend void concatDisp(First &, Second &);
};

class Second {
    char str2[20] = "Tarantino";

    // Friend function declaration
    friend void concatDisp(First &, Second &);
};

// Function to concatenate and display strings
void concatDisp(First &f, Second &s) {
    //strcat_s(f.str1, sizeof(f.str1), s.str2); 
    strcat(f.str1, s.str2); // Using strcat instead of strcat_s
    cout << "The concatenated name is: " << f.str1 << endl;
}

int main() {
    First f;
    Second s;
    concatDisp(f, s);

    return 0;
}
