package Task11;

public class Car {

    Driver driver;
    protected String brand;
    protected int numberplate;
    protected String colour;

    public Car(String brand, int numberplate,String colour ){
        this.brand = brand;
        this.numberplate = numberplate;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (numberplate != car.numberplate) return false;
        if (driver != null ? !driver.equals(car.driver) : car.driver != null) return false;
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = driver != null ? driver.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + numberplate;
        return result;
    }
}
