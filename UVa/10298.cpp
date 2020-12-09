#include <bits/stdc++.h>
#define load ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
using namespace std;
#define ll long long
#define ull unsigned long long
#define srt(v) sort(v.begin(), v.end())
#define MOD 1000000007
const int INF = 1e9;
const double PI = 3.14159265358979323846;
ll gcd(ll a, ll b) {
    return b != 0 ? gcd(b, a % b) : a;
}
ll lcm(ll a, ll b) {
    return (a * b) / gcd(a, b);
}
ll spow(ll a, ll b, ll m){
	ll res = 1;
	while(b){
		if (b&1) res = res*a%m;
		a = a*a%m;
		b /= 2;
	}
	return res;
}
ll divide(ll a, ll b){
	return a * spow(b, MOD-2, MOD) % MOD;
}
template<typename T> void print(const T &x){cout<<x<<endl;}
template<typename T=int> vector<T> read(size_t n){
  vector<T> arr(n);
  for(size_t i=0;i<n;i++) cin>>arr[i];
  return arr;
}


void solve(){
	string s;
	while(true){
		cin >> s;
		if (s == ".") return;
		int n = s.size();
		set<int> div;
		for(int i=1; i<=sqrt(n); i++){
			if (n % i == 0){
				div.insert(i);
				div.insert(n/i);
			}
		}
		for(int x : div){
			string temp = "";
			string tm = s.substr(0,x);
			for(int i=0; i<n/x; i++) temp += tm;
			if (temp == s){
				print(n/x);
				break;
			}
		}
		
	}
	
}

int main(){
	load;
	int t = 1;
	//int t;
	//cin >> t;
	while(t--){
		// cout << "Case #" << i << ": ";
		solve();
	}
	return 0;

}

