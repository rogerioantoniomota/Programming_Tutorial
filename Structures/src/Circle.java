public class Circle {


public static void main(String[] args) {

// TODO Auto-generated method stub


CircleDetails cd = new CircleDetails(5.0);


//Calculate the area of the circle

double area = cd.area();

double circumference = cd.circumference();

System.out.println("A=pi*r² = " + area);

System.out.println("C=2*pi*r = " + circumference);





}


}