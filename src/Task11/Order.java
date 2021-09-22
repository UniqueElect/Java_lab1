package Task11;

public class Order {

    Car car;

    final private double costkm = 50;
    private double price;
    private double way;

    public void getprice(){

        price = costkm * way;
    }

    public void order (Car car ){

            if (car.driver.ready == true){
                System.out.println("Order started!\n" +"Price = " + price +"\n" + "Your driver is "  + car.driver.name +"." +
                   " Wait for " + car.colour +" "+ car.brand + " with numberplate: " + car.numberplate + ".\n");
                car.driver.ready = false;
            }
             else
                 System.out.println("This driver is busy!\n" + "choose another or wait if all busy.\n");

    }
       public void endorder (Car car){

            if (car.driver.ready == false) {
                car.driver.ready = true;
                System.out.println("Order canseled!\n");
            }

        }


    public static void main(String[] args) {

    Car car1 = new Car("Mazda", 4321 ,"red");
    Car car2 = new Car("Ford",3252, "white");
    Car car3 = new Car("Subaru",7890,"lightblue");

    Driver d1 = new Driver("John",true);
    Driver d2 = new Driver("Steve",true);
    Driver d3 = new Driver("Juzo",true);

    car1.driver = d1;
    car2.driver = d3;

    Order o1 = new Order();
    Order o2 = new Order();

    o1.way = 20;
    o1.getprice();
    o1.order(car1);
    o2.way = 30;
    o2.getprice();
    o2.order(car1);
    o1.endorder(car1);
    car1.driver = d2;
    o2.way = 15;
    o2.getprice();
    o2.order(car1);
    o1.way = 12;
    o1.getprice();
    o1.order(car2);


    }
}