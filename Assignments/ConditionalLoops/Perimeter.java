package ConditionalLoops;

public class Perimeter {
    public static void main(String[] args) {
        
    }
     //q8: Perimeter Of Circle
     static double circlePerimeter(double radius){
        return 2*Math.PI*radius;
    }

    // Perimeter of triangle
    static int trianglePerimeter(int a, int b, int c){
        return (a+b+c);
    }

//  q9:   Perimeter Of Equilateral Triangle
static double equilTrianglePerimeter(double side){
    return 3*side;
}

//q10: Perimeter Of Parallelogram
static double parallelogramPerimeter(double base, double height){
    return 2*(base+height);
}

//q11: Perimeter Of Rectangle
static double rectanglePerimeter(double length, double breath){
    return 2*(length+breath);
}

//q12: Perimeter Of Square
static double sqrPerimeter(double side){
    return 4*side;
}
//q13: Perimeter Of Rhombus
static double rhombusPerimeter(double side){
    return 4*side;
}
    
}
