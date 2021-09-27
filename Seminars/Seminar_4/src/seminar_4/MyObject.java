package seminar_4;

public
class MyObject implements Cloneable {
//    public
    protected
    Object clone() throws CloneNotSupportedException {
        // that is the instance method of MyObject class, and  this has its' type ==> MyObject
        System.out.println(this + ": clone() invoked.");
        return super.clone();
    }
}


