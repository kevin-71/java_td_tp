public class Audio extends Media implements Playable {
    private String format;
    private boolean isPlaying;

    public Audio(String name, double size, String format){
        super(name, size);
        this.format = format;
    }

    public String getFormat(){
        return format;
    }

    public void play(){
        System.out.println("the video " + getName() + " is playing");
        isPlaying = true;
    }


    public void pause(){
        System.out.println("the video " + getName() + " is in pause");
        isPlaying = false;
    }

    public void stop(){
        System.out.println("the video " + getName() + " is stopped");
        isPlaying = false;
    }

    public boolean getisPlaying(){
        return this.isPlaying;
    }

    @Override
    public String toString(){
        return "media name : " + super.getName() + "  size : " + this.getSize() + " format is : " + this.format;
    }
}
