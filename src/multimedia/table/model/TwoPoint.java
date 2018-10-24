package table.model;

public class TwoPoint {

    private double xBegin;

    private double yBegin;

    private double xCurrent;

    private double yCurrent;

    public double getXBegin() {
        return xBegin;
    }

    public void setXBegin(double xBegin) {
        this.xBegin = xBegin;
    }

    public double getXCurrent() {
        return xCurrent;
    }

    public void setXCurrent(double xCurrent) {
        this.xCurrent = xCurrent;
    }

    public double getYBegin() {
        return yBegin;
    }

    public void setYBegin(double yBegin) {
        this.yBegin = yBegin;
    }

    public double getYCurrent() {
        return yCurrent;
    }

    public void setYCurrent(double yCurrent) {
        this.yCurrent = yCurrent;
    }

    public TwoPoint() {
        this.xBegin = 0d;
        this.yBegin = 0d;
        this.xCurrent = 0d;
        this.yCurrent = 0d;
    }
}
