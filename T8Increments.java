package project2;

public class T8Increments {
    //Write a Java Function that increments a string, It should take the string of unknown length. Don't use regular expressions. Examples: 123 -> 124
    //53456 -> 53457 29 -> 30 Function signature: string Increment (string str)
    public static String increment(String str){
        char[] chars=str.toCharArray();
        int i= chars.length - 1;
        int carry=1;
        while(i>0&&carry>0){
            int digit=chars[i]-'0';
            int sum=digit+carry;
            carry=sum/10;
            chars[i]=(char)((sum%10)+'0');
            i--;
        }
        if(carry>0){
            char[] result=new char[chars.length+1];
            result[0]=(char) (carry+'o');
            System.arraycopy(chars,0,result,1,chars.length);
            return new String(result);
        }else{
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        System.out.println(increment("123"));
        System.out.println(increment("53456"));
        System.out.println(increment("29"));
        System.out.println(increment("999"));
    }
    }


