#include <bits/stdc++.h>
 
using namespace std;
 
void solve() {
    int total_points = 0;
    for(int i = 0; i < 10; ++i){
        string row;
        cin >> row;
        for(int j = 0; j < 10; ++j){
            if(row[j] == 'X'){
                int min_dist = min({i, 9 - i, j, 9 - j});
                total_points += (min_dist + 1);
            }
        }
    }
    
    cout << total_points << "
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    if(cin >> t){
        while(t--){
            solve();
        }
    }
    return 0;
}