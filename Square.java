public class Square extends Rectangle{

    Square(){

    }

    Square(double side){
        setSide(side);
    }
    public Square(double side,String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);

    }
    public double getSide(){
        return getWidth();
    }

    public void setSide(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();

    }
}
