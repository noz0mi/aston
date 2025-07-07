package example.homework4;

public class Task {

    private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public synchronized void print() {
        if (flag) {
            System.out.println("1");
            flag = false;
        } else {
            System.out.println("2");
            flag = true;
        }
    }
}
