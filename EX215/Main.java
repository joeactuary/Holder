package EX215;

public class Main {
    public static void main(String[] args) {
        String s = "()(())";
        System.out.println(isBalanced(s));

    }






        public static boolean isBalanced(String s) {
            int open = 0;
            int close = 0;
            System.out.println("Length " + s.length());
            for (int i =0; i< s.length(); i++) {
                if (s.charAt(i) == '(') open++;
                if (s.charAt(i) == ')') close++;
            }
            return (open == close);


        }
    }

