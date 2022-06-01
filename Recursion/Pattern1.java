package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        p(4, 0);
    }

    static void p(int r, int c){
        if( r == 0){
            return;
        }

//        if( r == c ){
//            System.out.println();
//             p(r-1, 0);
//        }

        if( c < r ){
            p(r, c+1);
            System.out.print("*" + " ");
        }else{
            p(r-1, 0);
            System.out.println();
        }
    }

//    static void p(int r, int c){
//        if( r == 0){
//            return;
//        }
//
////        if( r == c ){
////            System.out.println();
////             p(r-1, 0);
////        }
//
//        if( c < r ){
//            System.out.print("*" + " ");
//            p(r, c+1);
//        }else{
//            System.out.println();
//            p(r-1, 0);
//        }
//    }


}
