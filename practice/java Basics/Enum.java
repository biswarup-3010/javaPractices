class Enum{
    enum status{
        Running, Stopped, Started,Done;
    }
    public static void main(String a[]){
        status s = status.Started;
        switch(s){
            case Running:
                System.out.println("Running");
                break;
            case Stopped:
                System.out.println("Has been stopped");
                break;
            case Started:
                System.out.println("Started");
                break;
            default:
                System.out.println("Successfully done");
                break;
        }
    }
}
