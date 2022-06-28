public class Trainer {

    private Command command;

    public Command getExercise() {
        return command;
    }

    public void setExercise(Command command) {
        this.command = command;
    }

    public void chooseExercise() {
        if(this.command == null) {
            System.out.println("No command set");
            return;
        }
        this.command.execute();
    }
}
