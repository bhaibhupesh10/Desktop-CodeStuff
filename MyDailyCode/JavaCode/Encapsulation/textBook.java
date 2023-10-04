package Encapsulation;

 class textBook {
     private int pageno;

     public void setPageno(int x) {
         if (x > 0) {
             pageno = x;
         } else {
             System.out.println("invalid data");

         }
     }
         public int getPageno() {
             return pageno;

     }
 }