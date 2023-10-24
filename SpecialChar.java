// count special charachter ? and sort them together -> input : *???*  Output: **??? *=2,?=3 
public class SpecialChar {
    public static void main(String[] args) {
        String str = "*???*";
        int star = 0, quesMark = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                star++;
            } else if (str.charAt(i) == '?') {
                quesMark++;
            } else {
                continue;
            }
        }
        if (star <= quesMark) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= quesMark; j++) {
                System.out.print("?");
            }
        } else if (star > quesMark) {
            for (int j = 1; j <= quesMark; j++) {
                System.out.print("?");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.println("Number of * = " + star + " Number of ? = " + quesMark);
    }
}
