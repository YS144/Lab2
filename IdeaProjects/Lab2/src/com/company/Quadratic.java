package com.company;


 class Quadratic {

 public   void two(double a, double b,double c) {
     double x1, x2;
     double g = b * b - 4 * a * c;
     if (g > 0) {
         g = Math.sqrt(g);
         x1 = (-b - g) / 2;
         x2 = (-b + g) / 2;

        System.out.println(x1 + " " + x2);
     } else if (g == 0) {
         x1 = -b / (2 * a);
         x2 = x1;
         System.out.println(x1);
     }
 }



 public void Ex(double a,double  b,double c){
     double x,y;

     x=-b/(2*a);
     y=a*x*x + b*x + c;
     if(y>0){
     System.out.println("max ="+y);
 }
     else if(y<0){
         System.out.println("min ="+y);
     }

     }

 public void interval(double a,double b,double c){
     double x,y;
     double inf =Double.POSITIVE_INFINITY;
     x=-b/(2*a);
     if (x>0){
         System.out.println("("+ x+ ";"+ inf+ ")"); System.out.println("("+ inf + ";"+ x+ "]");
     }
     else {
         System.out.println("("+ (-inf)+ ";"+ x+ ")");
     }

     }
     public Quadratic(double a,double b,double c){
     two(a,b,c);
     interval(a,b,c);
     Ex(a,b,c);

     }
 }

