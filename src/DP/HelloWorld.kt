package DP


class A constructor(firstName: String ){
    val s="1"
    val a=2
    val g=firstName
}
fun main(){

    println("hello world")
    val s="1212"
    print(numDecodings(s))

}
fun sum(a:Int,b:Int):Int {

    return a+b
}
fun numDecodings(s: String): Int? {

    if (s.equals(null))return null

    val dp= arrayOfNulls<Int>(s.length)
    val chars=s.toCharArray()
    if (s.toCharArray()[0]=='0')return 0
    if (s.toCharArray()[0]>'9'||s.toCharArray()[0]<'1')
        dp[0]=0
    else
        dp[0]=1

    if (s.length>1)
    if ((chars[0]=='2'&&chars[1]<='6')||chars[0]<'2'){
        if (chars[1]>'0'&&chars[1]<='9')
        dp[1]=dp[0]?.plus(1)
        else
            dp[1]=dp[0]

    }else{
        if (chars[1]=='0')
            return 0
        else
        dp[1]=1
    }
    for (i in 2..chars.size-1){

        if ((chars[i-1]=='2'&&chars[i]>'6')||chars[i-1]>'2'){
            if (chars[i]=='0'){
                return 0
            }
            dp[i]= dp[i-1]

        }
        else {
            if (chars[i]=='0'){

                if (chars[i-1]=='1'||chars[i-1]=='2')
                    dp[i]=dp[i-2]
                else
                    return 0
            }
            else{

                if (chars[i-1]=='0')
                dp[i]=dp[i-1]
                else {

//                    dp[i]=(dp[i-1]?.minus(1))?.times(2)?.plus(1)
                dp[i]=dp[i-1]?.plus(dp[i-2]!!)
                }

            }
     }

    }

    for (i in dp){

        print(i)
        print(" ")
    }
    println()
    return dp[dp.size-1]
}
