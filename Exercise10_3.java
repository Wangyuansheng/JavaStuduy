public class Exercise10_3 {
    public static void main(String[] args) {
        char a[] = {'1','2'};
        System.out.println(MyInteger.parseInt(a));
        MyInteger myInteger = new MyInteger(10);
        System.out.println(myInteger.equals(11));
    }
}

class MyInteger {
    private int value;

    MyInteger() {

    }

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 == 0 && value != 0) return true;
        return false;
    }

    public boolean isOdd() {
        if (value % 2 != 0) return true;
        return false;
    }

    public boolean isPrime() {
        if (value == 2) return true;    //2特殊处理
        if (value < 2 || value % 2 == 0) return false;  //识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) {   //识别被奇数整除
                return false;
            }
        }
        return true;
    }

    public boolean isEven(int value) {
        if (value % 2 == 0 && value != 0) return true;
        return false;
    }

    public boolean isOdd(int value) {
        if (value % 2 != 0) return true;
        return false;
    }

    public boolean isPrime(int value) {
        if (value == 2) return true;    //2特殊处理
        if (value < 2 || value % 2 == 0) return false;  //识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) {   //识别被奇数整除
                return false;
            }
        }
        return true;
    }

    public boolean isEven(MyInteger myInteger) {
        if (myInteger.getValue() % 2 == 0 && myInteger.getValue() != 0) return true;
        return false;
    }

    public boolean isOdd(MyInteger myInteger) {
        if (myInteger.getValue() % 2 != 0) return true;
        return false;
    }

    public boolean isPrime(MyInteger myInteger) {
        if (myInteger.getValue() == 2) return true;    //2特殊处理
        if (myInteger.getValue() < 2 || myInteger.getValue() % 2 == 0) return false;  //识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(myInteger.getValue()); i += 2) {
            if (myInteger.getValue() % i == 0) {   //识别被奇数整除
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value) {
        if (value == this.value) return true;
        return false;
    }

    public boolean equals(MyInteger myInteger) {
        if (myInteger.getValue() == this.value) return true;
        return false;
    }

    public static int parseInt(char[] array) {
        return Integer.parseInt(String.valueOf(array));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}