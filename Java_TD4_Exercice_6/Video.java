public class Video extends Media implements Playable{
    private double duration;  // in minutes
    private boolean isPlaying;
    public Video(String name, double size, int duration){
        super(name, size);
        this.duration = duration;
    }

    public double getDuration(){
        return duration;
    }

    public void play(){
        System.out.println("the video " + getName() + " is playing");
        isPlaying = true;
    }

    public void pause(){
        System.out.println("the video " + getName() + " is is in pause");
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
        return "media name : " + super.getName() + "  size : " + this.getSize() + " duration : " + this.duration + " minutes";
    }
}
