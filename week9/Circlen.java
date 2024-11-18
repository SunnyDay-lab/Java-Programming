public class Circlen {
    public static void main(String[] args){
        Circlen Circle1=new Circlen();
        System.out.println("The area of the circle of radius "+
                Circle1.radius +" is "+Circle1.getArea());

        Circlen Circle2=new Circlen(25);
        System.out.println("The area of the circle of radius "+
                Circle2.radius+" is "+Circle2.getArea());

        Circlen Circle3=new Circlen(75);
        System.out.println("The area of the circle of radius "+
                Circle3.radius+" is "+Circle3.getArea());

        Circle2.radius=100;
        Circle2.setRadius(100);
        System.out.println("The perimeter of the circle of radius "+
                Circle2.radius+" is "+Circle2.getPerimeter());
    }
    double radius;
    Circlen(){
        radius=1;
    }
    Circlen(double newRadius){
        radius=newRadius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }
}
