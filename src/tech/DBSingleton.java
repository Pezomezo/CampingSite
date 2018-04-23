package tech;

public class DBSingleton {
    private static DBFasade instance;


    public static DBFasade getInstance() throws Exception{
        if (instance == null){
            instance = new DBFasade();
        }
        return instance;
    }
}
