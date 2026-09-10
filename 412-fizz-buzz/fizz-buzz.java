class Solution {

    public List<String> bruteForce(int n) {
        List<String> result= new ArrayList<>();
        for(int num = 1; num<= n; num++) {
            if(num % 3 == 0 && num %5 ==0) {
                result.add("FizzBuzz");
            } else if(num % 5 == 0) {
                result.add("Buzz");
            } else if(num % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(num));
            }
        }

        return result;
        
        // TC: O(n)
        // SC: O(n)
    }

    public List<String> bitReadAble(int n) {
        List<String> result= new ArrayList<>();
        for(int num = 1; num<= n; num++) {
            String temp = num % 3 ==0 && num % 5 == 0 ? "FizzBuzz" :
                          num % 3 ==0 ? "Fizz":
                          num % 5 ==0 ? "Buzz":
                          String.valueOf(num);
            result.add(temp);
        }

        return result;
        
        // TC: O(n)
        // SC: O(n)
    }


    
    public List<String> fizzBuzz(int n) {
        // return bruteForce(n);
        return bitReadAble(n);
    }
}