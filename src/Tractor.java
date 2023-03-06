public class Tractor extends Vehicle{

    private int height;

    public Tractor(String name, int wheels, int height){
        super(name, wheels);
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void accelerate(){
        System.out.println("Vroom Vroom");
    }
}