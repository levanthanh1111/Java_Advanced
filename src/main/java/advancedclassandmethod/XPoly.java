package advancedclassandmethod;


final public class XPoly {

    public static double sum(double...x){
        double s =0;
        for(double a : x){
            s += a;
        }
        return s;
    }

    public static double min(double...x){
        double min = x[0];
        for(int i = 1; i < x.length; i++){
            if (x[i] < min){
                min = x[i];
            }
        }
        return min;
    }

    public static void toUpperFirstChar(String s){
        // chuyển s thành 1 mảng kiểu char
       char[] charArray = s.toCharArray();
       boolean foundSpace = true;
       // duyệt các phần tử trong mảng char đấy
       for(int i = 0; i < charArray.length;i++){
           // nếu phần tử trong mảng là 1 chữ cái
           if(Character.isLetter(charArray[i])){
               // kiểm tra khoảng trắng có trước chữ cái
               if(foundSpace){
                   charArray[i] = Character.toUpperCase(charArray[i]);
                   foundSpace = false;
               }
           }
           else {
               foundSpace = true;
           }
       }
       s = String.valueOf(charArray);
       System.out.println(s);

    }
    public static void main (String ...args) {
        double s1 = sum(2,5.4,4);
        System.out.println(s1);
        double s2 = min(2,5.4,4);
        System.out.println(s2);
        String s = "le van thanh";
        toUpperFirstChar(s);
        System.out.println("hoc git");
        System.out.println("hoc pull");
    }
}
