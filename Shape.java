public class Shape {
    private String color;
    private boolean filled;
    Shape(){

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        if(filled == true) {
            return "This color Shape is :" + this.color + " and filled ";
        }else{
            return "This color Shape is :" + this.color + " and Not filled ";

        }
    }
}
