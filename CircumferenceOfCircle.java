class Circle{
        double x,y;
        double r;
        double Circumference(){
            return 2*3.14*r;
        }
        double area(){
            return (22/7)*r*r;
        }
    }
 public class CircumferenceOfCircle {
        public static void main(String args[]){
            Circle c1 = new Circle();
            Circle c2 = new Circle();
            c1.x = 0.0;
            c1.y = 0.0;
            c1.r = 5.0;
            c2.x = 10.0;
            c2.y = 9.0;
            c2.r = 10.0;
            System.out.println("Circumference "+ c1.Circumference());
            System.out.println("Area " + c1.area());  
            System.out.println("Circumference "+ c2.Circumference());
            System.out.println("Area " + c2.area());  
        }
    }
