public class Image extends Media{
    private int resolution;  // in "PPP"

    public Image(String name, double size, int resolution){
        super(name, size);
        this.resolution = resolution;
    }

    public int getResolution(){
        return resolution;
    }

    @Override
    public String toString(){
        return "media name : " + super.getName() + "  size : " + this.getSize() + " resolution : " + this.resolution + " PPP";
    }
}
