import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonDP s1 = SingletonDP.getInstance();
        SingletonDP s2 = SingletonDP.getInstance();
        SingletonDP s3 = SingletonDP.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        Constructor<SingletonDP> constructor = SingletonDP.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonDP s4 = constructor.newInstance();
        System.out.println(s4.hashCode());

    }
}
