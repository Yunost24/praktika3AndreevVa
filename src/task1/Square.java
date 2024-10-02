package task1;

public class Square extends Rectangle {

   public Square  (){

   }

    public Square (double side){

        this.width = side;
        this.length = side;

    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide (){
        return super.getWidth();
    }

    public void setSide (double side){
       this.width = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String
    toString() {
        return "Квадрат {" +
                "ширина= " + width +
                ", длина= " + length +
                ", цвет= '" + color + '\'' +
                ", заполнен = " + filled +
                '}';
    }
}