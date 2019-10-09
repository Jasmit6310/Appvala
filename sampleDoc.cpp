#include <bits/stdc++.h>
#include<string>
	
using namespace std;
	        
	#define ll long long
	#define do long double
    #define ff first
    #define ss second
    #define FOR(a,n) for(ll ii=0;ii<n;ii++){    cin>>a[ii];}
    #define pb push_back
    #define mp make_pair
    #define inf LONG_LONG_MAX
    #define mod 1000000007
    #define FAST ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    #define N 2000010    

ll d,x,y;
void extendedEuclid(ll A, ll B) 
{
    if(B == 0) 
    {
         d = A;
         x = 1;
         y = 0;
    }
    else 
    {
        extendedEuclid(B, A%B);
        int temp = x;
        x = y;
        y = temp - (A/B)*y;
    }
}

ll power(ll x,ll y, ll p) 
{ 
    ll res = 1; 
    x = x % p;
    while (y > 0) 
    {  // If y is odd, multiply x with result 
        if (y & 1) 
            res = (res*x) % p;
                    
        y = y>>1; 
        x = (x*x) % p;   
    } 
    return res; 
} 

ll IsPrime(ll n)
{
    if(n==0||n==1)
        return n;
    if(n%2==0)
        return (ll)2;
    if(n%3==0)
        return (ll)3;
    else
    {
        for(ll i=5;i*i<=n;i+=6)
        {
            if(n%i==0)
                return i;
            if(n%(i+2)==0)
                return (i+2);
        }
        return n;
    }
}
vector<ll> rt(N+10);
ll connect;

void ini(ll n)
{
	for(ll i=0;i<n+10;i++)
		rt[i]=i;

}

ll root(ll x)
{
	while(rt[x]!=x)
		{
			rt[x]=rt[rt[x]];
			x=rt[x];
		}

	return x;
}

void uni(ll a,ll b)
{
	ll x=root(a),y=root(b);
	rt[y]=x;
	//cout<<"C"<<connect<<"C";
	connect--;
}



int main()
{
	  cout<<"HelloWorld";
}
