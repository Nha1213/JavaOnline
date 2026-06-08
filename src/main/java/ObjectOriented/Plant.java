package ObjectOriented;

public class Plant {
    public String name;
    public String type;
    public int waterLevel;
    public double height;

    public static void header(){
        System.out.printf("%-10s %-20s  %-20s %-10s \n","Name","Type","WaterLevel","Height");
    }
    public void displayInfo(){
        System.out.printf("%-10s %-20s  %-20d %-10.2f \n", name, type, waterLevel,  height);
    }

    public void waterPlant(int water){
        //Increase waterLevel
        this.waterLevel += water;
        System.out.println("Water plant: " + water);
    }

    public void growPlant(double height){
        //Increase height

        this.height += height;
        System.out.println("Growing plant: " + height);
    }
}



