public class Shrimp{
    private String name;
    private int legs;
    private boolean isAlive;


    public Shrimp (String n, int l, boolean a){
        this.name = n;
        this.legs = l; //i am now realizing i do not know how many legs a shrimp has
        this.isAlive = a;
    }

    String getName(){
        return name;
    }

    int getLegs(){
        return legs;
    }

    boolean getAlive(){
        return isAlive;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void throwShrimp(){
        System.out.println("Shrimp thrown.");
    }

    @Override
    public String toString() {
        return name;
    }
}