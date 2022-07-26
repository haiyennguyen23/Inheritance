package Geometricobjects;

public class MovablePoint extends Point{
    float Speedx = 0f;
    float Speedy = 0f;

    public MovablePoint() {
    }

    public MovablePoint(float speedx, float speedy) {
        Speedx = speedx;
        Speedy = speedy;
    }

    public MovablePoint(float x, float y, float speedx, float speedy) {
        super(x, y);
        Speedx = speedx;
        Speedy = speedy;
    }

    public float getSpeedx() {
        return Speedx;
    }

    public void setSpeedx(float speedx) {
        Speedx = speedx;
    }

    public float getSpeedy() {
        return Speedy;
    }

    public void setSpeedy(float speedy) {
        Speedy = speedy;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "Speedy=" + Speedy +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
