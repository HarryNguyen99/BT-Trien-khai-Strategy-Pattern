
public class MySQLStorage implements UserStorage {
    @Override
    public void store() {
        System.out.println("Store user into database mysql");
    }
}