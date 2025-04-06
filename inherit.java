package oopsinjava;

public class inherit extends oop3 {
    double weight;

    public inherit(){
        this.weight=-7;
    }

    inherit (inherit other){
        super(other);
        weight=other.weight;

    }

    public inherit(double l,double h,double w,double weight){
        super(l,h,w);
        // this is parent class constructor
        
        this.weight=weight;
    }

    
}
