package Session1;

public class Car {

    private String carType;
    private String brandName;
    private Integer noOfSeat;

   public Car(String carType, String brandName, Integer noOfSeat)
   {
       this.carType=carType;
       this.brandName=brandName;
       this.noOfSeat=noOfSeat;
   }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setNoOfSeat(Integer noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public String getCarType() {
        return carType;
    }

    public String getBrandName() {
        return brandName;
    }

    public Integer getNoOfSeat() {
        return noOfSeat;
    }


    @Override
   public String toString()
    {
        return carType+brandName+noOfSeat;
    }
}
