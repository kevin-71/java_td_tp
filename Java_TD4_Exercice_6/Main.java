public class Main {
    public static void main(String[] args){

        Image image = new Image("myImage.jpg", 1024, 30);
        System.out.println(image.toString());

        Video video = new Video("myVideo.mp4", 500, 12);
        System.out.println(video.toString());
        video.play();
        video.pause();
        video.stop();

        Audio audio = new Audio("myAudio.mp3", 10, "MP3");
        System.out.println(audio.toString());
        audio.play();
        audio.pause();
        audio.stop();
    }
}
