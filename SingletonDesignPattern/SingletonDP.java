public class SingletonDP {

    private static SingletonDP instance;

    private SingletonDP () {
        throw new RuntimeException("Trying to break signleton design pattern");
    }

    public static SingletonDP getInstance() {
        if (instance == null) {
            synchronized (SingletonDP.class) {
                if (instance == null)
                    instance = new SingletonDP();
            }
        }
        return instance;
    }
}
