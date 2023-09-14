public class DownloadFile extends Thread{

    private int threadNumber;

    // constructor function has the same name as the class
    public DownloadFile(int inputThreadNumber){
        this.threadNumber = inputThreadNumber;
    }

    public void run(){
        System.out.println("File " + threadNumber + " Downloaded");
    }
}