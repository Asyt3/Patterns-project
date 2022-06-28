public class StandUp implements Command{

    private UpCheck upCheck;

    public StandUp(UpCheck upCheck) {
        this.upCheck = upCheck;
    }

    @Override
    public void execute() {
        this.upCheck.Ex1();
    }
}