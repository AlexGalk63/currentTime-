//package basket;
//
//public class KomandaShablon {
//    public static void main(String[] args) {
//        Comp comp = new Comp();
//        User u = new User(new StartCommand(comp),new StopCommand(comp), new RestartCommand(comp));
//
//        u.startComputer();
//        u.stopComputer();
//        u.restartComputer();
//
//    }
//}
//interface Command{
//    void execute();
//}
//class Comp{
//    void Start(){
//        System.out.println("Start");
//    }
//    void Stop(){
//        System.out.println("Stop");
//    }
//    void ReStart(){
//        System.out.println("ReStart");
//    }
//}
//class StartCommand implements Command{
//    Comp computer;
//
//    public StartCommand(Comp computer) {this.computer = computer;}
//
//      @Override
//    public void execute() {
//        computer.Start();
//
//    }
//}
//class StopCommand implements Command {
//    Comp computer;
//
//    public StopCommand(Comp computer) {
//        this.computer = computer;
//    }
//
//    public void execute() {
//        computer.Stop();
//    }
//}
//    class RestartCommand implements Command {
//        Comp computer;
//
//        public RestartCommand(Comp computer) {
//            this.computer = computer;
//        }
//
//        public void execute() {
//            computer.ReStart();
//        }
//    }
//
//    class User {
//        Command start;
//        Command stop;
//        Command restart;
//
//        public User(Command start, Command stop, Command restart) {
//            this.start = start;
//            this.stop = stop;
//            this.restart = restart;
//        }
//
//        void startComputer() {
//            start.execute();
//        }
//
//        void stopComputer() {
//            stop.execute();
//        }
//
//        void restartComputer() {
//            restart.execute();
//        }
//
//    }


