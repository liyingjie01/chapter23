package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Lyj
 */
public class Homework2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> file = Class.forName("java.io.File");
        Constructor<?>[] filec = file.getDeclaredConstructors();
        for (Constructor<?> constructor : filec) {
            System.out.println("构造器" + constructor);
        }
        Constructor<?> file2 = file.getDeclaredConstructor(String.class);
        String path = "e:\\a.txt";
        Object o = file2.newInstance(path);
        Method createNewFile = file.getMethod("createNewFile");
        createNewFile.invoke(o);
        System.out.println("创建成功");


    }
}