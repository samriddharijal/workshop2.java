package workshop2;



public class qs9{
 double width, height, depth;

 
 qs9 () {
     width = 10;
     height = 8;
     depth = 12;
 }

 
 qs9 (double length) {
     width = length;
     height = length;
     depth = length;
 }

 
 qs9 (double width, double height, double depth) {
     this.width = width;
     this.height = height;
     this.depth = depth;
 }

 void getVolume() {
     System.out.println("Volume: " + (width * height * depth));
 }

 public static void main(String[] args) {
     qs9 defaultBox = new qs9();        
     defaultBox.getVolume();

     qs9 cube = new qs9(5);             
     cube.getVolume();

     qs9 cuboid = new qs9(3, 4, 6);     
     cuboid.getVolume();
 }
}