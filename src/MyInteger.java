public class MyInteger {
   private int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public boolean isPrime() {
       return isPrime(this.value);
    }
    public boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        for (int i = 2; i < number / 2; i++)
            return false;
        return true;
    }
    public boolean isPrime(MyInteger b){
        return isPrime(b.getValue());
    }
    public boolean isEven() {
        return isEven(this.value);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isEven(MyInteger o){
            return isEven(o.getValue());
        }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public static boolean isOdd(int n) {
        return n%2!=0;
    }
    public static boolean isOdd(MyInteger s){
        return  isOdd(s.getValue());
    }
    public boolean equals(int annumber){
        return this.value == annumber;
    }
   public boolean equals(MyInteger o){
        return this.value == o.getValue();
   }
   public static int selInt(char[] numbers){
     int result =0;
     for(int i =0; i<numbers.length; ++i){
         result =result*10+(numbers[i]-48);
     }
         return result;
   }
   public static int parseInt(String s){
        int result =0;
        for(int i=0;i<s.length();++i){
            result = result *10+(s.charAt(i)-48);
        }
        return result;
   }







    }
