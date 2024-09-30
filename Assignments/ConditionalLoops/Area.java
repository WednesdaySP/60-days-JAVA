package ConditionalLoops;

public class Area {

    //q1:  Area of Circle.
    public static void main(String[] args) {
        double radius=5.0;
        double area=3.14*(radius*radius);
        System.out.println("Area of Cicle: "+ area);


    }
    //q2: Area of Triangle: 1/2*b*h
    static int TraingleArea(int base, int height){
        return (base*height)/2;

    }

    //q3: area of rect
    static int areaRect(int length, int breath){
        return length*breath;
    }

    //q4: area of isoceles traingle
    static int areaIsoceles(int base, int height){
        return (height*base)/2;
    }

    //q5: area of parallelogram
    static int areaParallogram(int base, int height){
        return base* height;
    }

    //q6: area of rhombus
    static int areaRhombus(int diagonal1, int diagonal2){
        return (diagonal1*diagonal2)/2;
    }

    //q7: area of equilateral triangle
    static double equilTriangle(double side){
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        return area;

    }

    //q19 curved surface area of cylinder
    static double curvedSurfaceArea(double radius, double height){
        return 2*Math.PI*radius*height;
    }

    //q20: total surface area of cube
    static double totalSurfaceArea(double side){
        return 6*side*side;
    }

    //Curved Surface Area (CSA) or Lateral Surface Area (LSA) of a cube
    static double curvedSurfaceAreaCube(double side){
        return 4*side*side;
    }

   

    
}
