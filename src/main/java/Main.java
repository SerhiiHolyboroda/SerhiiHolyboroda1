

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Resource(name = "Get", description = "Me" , lookup = "!")
public class Main {
    public static void main(String[] args) throws Exception {

        for (Annotation annotation : Main.class.getAnnotations()) {
            Class<? extends Annotation> type = annotation.annotationType();
            System.out.print(type.getName());

            for (Method method : type.getDeclaredMethods()) {
                Object value = method.invoke(annotation, (Object[])null);
               
                System.out.print(method.getName()  + value );
            }
        }

    }
}
