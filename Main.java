public class Main {
    public static void Main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        // make minutes 10-14 avaliable
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        // make minutes 30-44 avaliable
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        // make minutes 50-59 avaliable
        for(int i = 50; i < 60; i++) schedule[1][i] = true;
    }
}
