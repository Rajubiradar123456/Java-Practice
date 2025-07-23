class Area{
    Area(int l){
        System.out.println("area of square"+(2*l));
    }
    Area(float r){
        System.out.println("Circle:"+3.14*r*r);
    }
   Area(float a,float b){
        System.out.println("rhombous:"+(a*b));
    }
}



class Constructor1 {
    public static void main(String[] args) {
       Area a=new Area(6);
       Area b=new Area(4f);
    }
}
