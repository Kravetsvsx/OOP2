public class Point {

    /**Создать класс Point, описывающий точку в двумерных координатах. Полями этого класса должны быть координаты
     * x и y. Класс должен иметь один конструктор, принимающий координаты x и y. Сделайте информацию о координатах
     * скрытой, а получить её можно только с помощью методов доступа (getById/set). Создать метод distance, принимающий
     * объект Point и определяющий расстояние до неё. */

    private    double x;
    private   double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        if (x>=0)
            this.x = x;
    }

    public void setY(double y) {
        if(x>=0)
            this.y = y;
    }
    public double distance(Point point){
        double dis= Math.sqrt((Math.pow(point.getX()-getX(),2))+((Math.pow(point.getY()-getY(),2))));
        return dis;

    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
