package Singleton;

import java.lang.reflect.Constructor;

import static Singleton.singleObject.obj;

public class singleObjImpl {
    public static void main(String[] args) {
        singleObject singleObj = obj.create();
        System.out.println(singleObj);
        singleObject singleObj2 = obj.create();
        System.out.println(singleObj.equals(singleObj2));
        System.out.println(singleObj == singleObj2);
        System.out.println(singleObj.hashCode() == singleObj.hashCode());
        // breaking of single ton design pattern by reflection constructor
        try{
            Constructor<?> constructors = singleObject.class.getDeclaredConstructor();
            for(Constructor<?>  constructor :  singleObject.class.getDeclaredConstructors()) {
                constructor.setAccessible(true);
                singleObj2 = (singleObject)constructor.newInstance();
                break;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(singleObj.equals(singleObj2));  // false
        System.out.println(singleObj == singleObj2);  // false
        System.out.println(singleObj.hashCode() == singleObj.hashCode()); // true

    }

}
