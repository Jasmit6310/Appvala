ll binary_exp(ll a,ll n)
{
    ll i=1;
    while(n>0)
    {
        if(n%2==1)
            i=(i*a)%MOD;
        a=(a*a)%MOD;
        n/=2;
    }
    return i;
}
