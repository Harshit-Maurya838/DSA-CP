#include <bits/stdc++.h>
 
using namespace std;
 
void process_test_case() {
    int starting_number, target_number;
    cin >> starting_number >> target_number;
    if(starting_number % target_number == 0){
        cout << "YES
";
    }else{
        cout << "NO
";
    }
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    int total_test_cases;
    cin >> total_test_cases;
 
    while(total_test_cases > 0){
        process_test_case();
        total_test_cases--;
    }
 
    return 0;
}