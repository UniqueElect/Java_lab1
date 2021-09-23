package Task11;

public class Driver {

    protected String name;
    protected boolean ready;

    public Driver(String name, Boolean ready){
        this.name = name;
        this.ready = ready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        return name != null ? name.equals(driver.name) : driver.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
