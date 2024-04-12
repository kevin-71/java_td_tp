public abstract class Media {
    private String name;
    private double size;

    public Media(String name, double size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public double getSize(){
        return size;
    }

    public String toString(){
        return "media name : " + this.name + "  size : " + this.size;
    }
}
