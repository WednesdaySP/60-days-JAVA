package ConditionalLoops;

public class Volume {
    public static void main(String[] args) {
        
    }
    //q14: volume of cone
    static double volCone(double radius, double height){
        return (1/3)*Math.PI*radius*radius*height;
    }

    //q15: volume of prism
    static double volPrism(double height, double base){
        return base*height;
    }

    //q16: volume of cyclinder
    static double volCylinder(double radius, double height){
        return Math.PI*radius*radius*height;
    }

    //q17: volume of sphere
    static double volSphere(double radius){
        return (4/3)*Math.PI*radius*radius*radius;
    }

    //q18: volume of pyramid
    static double volPyramid(double base, double height){
        return (1/3)*base*height;
    }
}
