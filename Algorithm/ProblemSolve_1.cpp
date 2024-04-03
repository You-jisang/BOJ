#include <iostream>

using namespace std;

int main() {


    int num = 0;

    cin >> num;

    int count = 0;
    while (num > 0) {
        count += num & 1;
        num >>= 1;
    }

    cout << count << endl;
    
    return 0;
}
