public class Box {
    double h,w,d;

     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    Box obj = new Box(1.5,70.3,90.3);
    System.out.println(obj.volume());

    }

}

