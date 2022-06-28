public class LayDown implements Command {
    private UpCheck upCheck;


    public LayDown(UpCheck upCheck) {
        this.upCheck = upCheck;
    }

    @Override
    public void execute() {
        this.upCheck.Ex2();
    }
}
