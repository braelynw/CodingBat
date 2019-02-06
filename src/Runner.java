public class Runner {

    //Warm-up 1
    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        }
        if (temp2 < 0 && temp1 > 100) {
            return true;
        }
        return false;
    }

    //Warm-up 1
    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        }
        if (b >= 13 && b <= 19) {
            return true;
        }
        if (c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }

    //Warm-up 2
    public static String stringYak(String str) {
        String y = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 1).equals("y") && str.substring(i + 2, i + 3).equals("k")) {
                i = i + 2;
            } else {
                y += str.substring(i, i + 1);
            }
        }
        return y;
    }

    //Logic-1: fizzString
    public String fizzString(String str) {
        String b = "";
        if (str.startsWith("f")) {
            b += "Fizz";
        }
        if (str.endsWith("b")) {
            b += "Buzz";
        }
        if (!str.startsWith("f") && !str.endsWith("b")) {
            return str;
        }
        return b;
    }

    //String 1: hasBad
    public boolean hasBad(String str) {
        if ((str.indexOf("b") == 0 || str.indexOf("b") == 1) && (str.indexOf("a") == 1 || str.indexOf("a") == 2) && (str.indexOf("d") == 2 || str.indexOf("d") == 3)) {
            return true;
        } else {
            return false;
        }
    }

    //String 2: countHi
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 1).equals("h") && str.substring(i + 1, i + 2).equals("i")) {
                count += 1;
            }
        }
        return count;
    }

    //String 3: gHappy
    public boolean gHappy(String str) {
        int leng = str.length();
        boolean happy = true;

        for (int i = 0; i < leng; i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    happy = true;
                } else if (i < (leng - 1) && str.charAt(i + 1) == 'g') {
                    happy = true;
                } else {
                    happy = false;
                }

            }
        }
        return happy;
    }


    //Array 1: double23
    public boolean double23(int[] nums) {
        if (nums.length != 1 && nums.length != 0) {
            return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
        } else {
            return false;
        }
    }


    //Array 2: sum13
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                if (nums[i] == 13 && i < (nums.length - 1)) {
                    nums[i] = 0;
                    nums[i + 1] = 0;
                }
            }
        }
        return sum;

    }


    //Array3: canBalance
    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            for (int p = i; p < nums.length; p++) {
                sum -= nums[p];
            }
            if (sum == 0) {
                return true;
            }
        }
        return false;
    }

}


