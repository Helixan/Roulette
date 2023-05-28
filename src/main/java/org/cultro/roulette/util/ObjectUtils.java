package org.cultro.roulette.util;


import org.cultro.roulette.lang.Validate;

import java.io.*;

public class ObjectUtils {

    public static <T extends Serializable> T deepCopy(T object) {
        T copy;
        try {
            ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
            objectStream.writeObject(object);
            objectStream.flush();
            ByteArrayInputStream inputByteStream = new ByteArrayInputStream(byteStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputByteStream);
            copy = (T) objectInputStream.readObject();
            objectStream.close();
            inputByteStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return copy;
    }

    public static <T> boolean anyEquals(T object, T... objects) {
        Validate.notNull(object, "You may not pass a null object");
        Validate.notNull(objects, "You may not pass a null list of objects");
        for (T current : objects) {
            if (object.equals(current)) {
                return true;
            }
        }
        return false;
    }
}
