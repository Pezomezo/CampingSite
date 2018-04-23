package tech;

public class DBSingleton {
    private static DBFacade instance;


    public static DBFacade getInstance() throws Exception{
        if (instance == null){
            instance = new DBFacade();
        }
        return instance;
    }
}
