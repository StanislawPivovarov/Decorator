public abstract class Beverage {
    public enum Size {Tall, Grande, Venti};
    Size size = Size.Tall;
    String description = "Unknown Beverage";

    /*
    метод cost будем реализовывать в субклассах
     */
    public String getDescription() {
        return description;
    }

    public Size setSize(Size size){
        this.size = size;
        return size;
    }
    public Size getSize(){
        return this.size;
    }

    public abstract double cost();



}

