//หาข้อมูลผ่านgoogleบ้างค่ะ
import java.util.Scanner;

public class AirPurifier {
    String model;
    String serialNo;
    //Timer time;
    boolean power;
    double PM;
    double fanSpeed;
    double weight;

    static int numAirpurifiersBuilt = 0;


    AirPurifier(String model, String serialNo, boolean power, double PM, double fanSpeed, double weight) {
        this.model = model;
        this.serialNo = serialNo;
        this.power = power;
        this.PM = PM;
        this.fanSpeed = fanSpeed;
        this.weight = weight;

        numAirpurifiersBuilt++;
    }

    public void turnOn() {
        power = true;
        System.out.println("AirPurifier status : turn on");
    }

    public void turnOff(){
        power = false;
        System.out.println("AirPurifier status : turn off");
    }


    public void  showValue(){
        System.out.println("Model : "+ model);
        System.out.println("SerialNo : "+ serialNo);
        System.out.println("Weight: "+weight+" kg");
        System.out.println("fan speed: "+fanSpeed);
        System.out.println("PM: "+PM +" ไมโครกรัมต่อลูกบาศก์เมตร ");
    }

    public static void showAirNo() {
        System.out.println("Number of Airpurifiers Built : " + numAirpurifiersBuilt);
    }

    public static void main(String[] args) {
        AirPurifier A1 = new AirPurifier("123", "555555", false, 31, 3.0, 5.0);
        AirPurifier A2 = new AirPurifier("123", "666666", false, 13, 2.0, 5.0);
        AirPurifier A3 = new AirPurifier("123", "777777", false, 25, 3.0, 5.0);

        Scanner s = new Scanner(System.in);
        System.out.print("Choose an airpurifier A1/A2/A3 : " );
        String noAirpurifier = s.next();

        if(noAirpurifier.equals("A1")){
            if(A1.PM>= 30){
                A1.turnOn();
            }else {
                A1.turnOff();
            }
            A1.showValue();

        } else if (noAirpurifier.equals("A2")) {
            if(A2.PM>= 30){
                A2.turnOn();
            }else {
                A2.turnOff();
            }
            A2.showValue();
        } else if (noAirpurifier.equals("A3")) {
            if(A3.PM>= 30){
                A3.turnOn();
            }else {
                A3.turnOff();
            }
            A3.showValue();
        }else {
            System.out.println("Can't find the airpurifier");
            return;
        }

        //AirPurifier.showAirNo();

    }


}