package cz.osu.student.R19584;

public class IDSingleton {
    static private IDSingleton instance = null;
    static private int idCounter;

    private IDSingleton() {
        idCounter = 0;
    }

    static public IDSingleton getInstance() {
        if (instance == null)
            instance = new IDSingleton();

        return instance;
    }

    public int getId() {
        idCounter += 1;
        return idCounter;
    }
}