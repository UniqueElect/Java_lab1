package Task10;
public class Day {
    Weather weather;
    String dow; //day of week

    Day (String dow,Weather w){
        this.dow = dow;
        this.weather = w;
    }

    public String toString(){
        String a = "";

        if(weather.temperature > 0){
        a += String.valueOf(weather.temperature);
        return (dow + ": " + weather.city + " " + weather.weathertype + " " + "+" + a);}
        else
        a += String.valueOf(weather.temperature);{
            return (dow + ": " + weather.city + " " + weather.weathertype + " " +  a);}
        }
    }

