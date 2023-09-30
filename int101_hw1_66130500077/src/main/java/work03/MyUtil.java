package work03;

public class MyUtil {
    public static double calculateBMI(double height , double weight){
     double bmi = weight/(height * height);
     return bmi ;
        
    }
    
    public static double avg(double v1 , double v2 , double v3){
    double avg = (v1+v2+v3)/3;
    return avg;
    }
}
