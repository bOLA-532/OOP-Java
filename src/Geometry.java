public class Geometry extends Maths{

    float areaOfCircle(float radius){
        return pi*radius*radius;
    }

    float areaOfTriangle(float base, float height){
        return 1/2f*multiply(base, height);
    }
}
