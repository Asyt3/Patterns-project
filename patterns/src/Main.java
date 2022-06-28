import java.util.Random;

public class Main {
    public static void main(String[] args) {



        Topic topic = new Topic();
        Observer viewer1 = new TopicSubscriber("Viewer 01");
        Observer viewer2 = new TopicSubscriber("Viewer 02");
        Observer viewer3 = new TopicSubscriber("Viewer 03");

        topic.subscribe(viewer1);
        topic.subscribe(viewer2);
        topic.subscribe(viewer3);



        UpCheck upCheck = new UpCheck();
        Command lightsOnCommand = new StandUp(upCheck);
        Command lightsOffCommand = new LayDown(upCheck);

        Trainer remote = new Trainer();

        Random random = new Random();
        int number = random.nextInt(1000);
        for (int i = 0; i<10; i++)
        {
            if (number % 2 == 0){
                remote.setExercise(lightsOnCommand);
                remote.chooseExercise();


            }
            else {

                remote.setExercise(lightsOffCommand);
                remote.chooseExercise();

            }
            if (remote.getExercise().equals(lightsOnCommand)){
                topic.setTopic("The exercise is: Lay Down");
            }
            else if (remote.getExercise().equals(lightsOffCommand)){
            topic.setTopic("The exercise is: Stand Up");
        }
            number = random.nextInt(1000);
        }

    }
}