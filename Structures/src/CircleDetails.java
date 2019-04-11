public class CircleDetails {

private double r;

public CircleDetails() {

this.r = 0.0;

}

public CircleDetails (double r){

this.r = r;

}

public double area(){

double a = 0.0;
a = this.r*this.r*Math.PI;
return a;

}

public double circumference (){

double c = 0.0;
c = 2*this.r*Math.PI;
return c;

}

}
