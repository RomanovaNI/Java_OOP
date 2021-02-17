public class Ex_String_List14 {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false
        //1. Check if X exists in String
        //2. Check if Y goes after X
        //3. Method " Contains"; "IndexOf"
        //4. Method "Substring"
        String hm = "Vasiliy";
        char ch = 'a';
        int a = hm.indexOf(ch);
        System.out.println(a);
    }

    private static boolean xyBalance(String input) {
        char x = 'x';
        if (input.contains("x")) {
            return input.substring(input.indexOf(x)).contains("y");
        }
        return false;
    }
}
