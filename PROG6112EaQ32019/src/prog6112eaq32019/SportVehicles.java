package prog6112eaq32019;

/**
 *
 * @author linde
 */
public class SportVehicles {
    private String name;
    private String price;
    private String speed;
    private String engineSize;
    
    
    public SportVehicles(String name, String price, String speed, String engineSize){
      this.name = name;
      this.price = price;
      this.speed = speed;
      this.engineSize = engineSize;
    }
    
    public String getName(){
        return this.name;
    }
    
     public String getPrice(){
        return this.price;
    }
     
      public String getSpeed(){
        return this.speed;
    }
      
       public String getEngineSize(){
        return this.engineSize;
    }
       
       public String toString(){
            return  this.name + "\n" +
                 "PRICE: "    + this.price + "\n"  +
                 "0-100: " + this.speed + "\n" +
                 "Engine " + " R "+ this.engineSize + "\n";
       }
}
