package Car;

public class Wheels {
    private Byte radius;
    private Tyre tyre;
    private String nameTyre;

    public Wheels(Byte radius, Tyre tyre, String nameTyre) {
        this.radius = radius;
        this.tyre = tyre;
        this.nameTyre =nameTyre;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Byte getRadius() {
        return radius;
    }

    public void setRadius(Byte radius) {
        this.radius = radius;
    }

    public String getNameTyre() {
        return nameTyre;
    }

    public void setNameTyre(String nameTyre) {
        this.nameTyre = nameTyre;
    }
public String wheelsInfo(){
        return "Наименование: " + getNameTyre() + ";" + Tyre.TS() + ";" + " Радиус: " + getRadius() + ";";

}

    }


