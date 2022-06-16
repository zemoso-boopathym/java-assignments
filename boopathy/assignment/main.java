package boopathy.assignment;

import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {

        // data Class
        data firstClass = new data();
        firstClass.printClassVariables();
        firstClass.printLocalVariables();

        // singleton Class
        singleton singleton = new singleton();
        singleton.printRetObject();
    }
}
