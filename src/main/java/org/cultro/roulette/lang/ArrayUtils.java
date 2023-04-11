package org.cultro.roulette.lang;

import java.lang.reflect.Array;

public class ArrayUtils {

    public static final boolean[] EMPTY_BOOLEAN_ARRAY = {};
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = {};
    public static final byte[] EMPTY_BYTE_ARRAY = {};
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = {};
    public static final char[] EMPTY_CHAR_ARRAY = {};
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = {};
    public static final Class<?>[] EMPTY_CLASS_ARRAY = {};
    public static final double[] EMPTY_DOUBLE_ARRAY = {};
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = {};
    public static final float[] EMPTY_FLOAT_ARRAY = {};
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = {};
    public static final int[] EMPTY_INT_ARRAY = {};
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = {};
    public static final long[] EMPTY_LONG_ARRAY = {};
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = {};
    public static final Object[] EMPTY_OBJECT_ARRAY = {};
    public static final short[] EMPTY_SHORT_ARRAY = {};
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = {};
    public static final String[] EMPTY_STRING_ARRAY = {};
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * The constructor for this class should never be called.
     * <p>
     * This constructor is only public in the case that a tool requires
     * a JavaBean instance to run.
     * </p>
     */
    public ArrayUtils() {
    }

    public static <T> T[] clone(final T[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static boolean[] clone(final boolean[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static byte[] clone(final byte[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static char[] clone(final char[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static double[] clone(final double[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static float[] clone(final float[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static int[] clone(final int[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static long[] clone(final long[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static short[] clone(final short[] arrayToClone) {
        return arrayToClone == null ? null : arrayToClone.clone();
    }

    public static <T> boolean containsOneNonNullElement(final T[] array) {
        if (array == null) {
            return false;
        }
        for (T type : array) {
            if (type != null) {
                return true;
            }
        }
        return false;
    }

    public static <T> int firstNotNullElementIndex(final T[] array) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static <T> int lengthOfAllArraysCombined(final T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            if (array != null) {
                length += array.length;
            }
        }
        return length;
    }

    @SuppressWarnings("unchecked")
    public static <T> Class<T> getComponentType(final T[] array) {
        if (array == null) {
            return null;
        }
        return (Class<T>) array.getClass().getComponentType();
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] newArrayInstance(final Class<T> type, final int length) {
        return (T[]) Array.newInstance(type, length);
    }

    public static <T> T[] mergeArrays(final T[]... arraysToMerge) {
        final int firstNotNullIndex = firstNotNullElementIndex(arraysToMerge);
        if (firstNotNullIndex == INDEX_NOT_FOUND) {
            return null;
        }
        final Class<T> componentType = getComponentType(arraysToMerge[firstNotNullIndex]);
        final T[] newArray = newArrayInstance(componentType, lengthOfAllArraysCombined(arraysToMerge));
        int currentMergeLocation = 0;
        for (T[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static boolean[] mergeArrays(final boolean[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final boolean[] newArray = new boolean[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (boolean[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static byte[] mergeArrays(final byte[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final byte[] newArray = new byte[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (byte[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static char[] mergeArrays(final char[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final char[] newArray = new char[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (char[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static double[] mergeArrays(final double[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final double[] newArray = new double[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (double[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static float[] mergeArrays(final float[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final float[] newArray = new float[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (float[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static int[] mergeArrays(final int[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final int[] newArray = new int[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (int[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static long[] mergeArrays(final long[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final long[] newArray = new long[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (long[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static short[] mergeArrays(final short[]... arraysToMerge) {
        if (arraysToMerge == null) {
            return null;
        }
        if (firstNotNullElementIndex(arraysToMerge) == INDEX_NOT_FOUND) {
            return null;
        }
        final short[] newArray = new short[lengthOfAllArraysCombined(arraysToMerge)];
        int currentMergeLocation = 0;
        for (short[] array : arraysToMerge) {
            if (array != null) {
                System.arraycopy(array, 0, newArray, currentMergeLocation, array.length);
                currentMergeLocation += array.length;
            }
        }
        return newArray;
    }

    public static <T> T[] addAll(final T[] array, final T... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final Class<T> componentType = getComponentType(array);
        final T[] newArray = newArrayInstance(componentType, array.length + elementsToAdd.length);
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static boolean[] addAll(final boolean[] array, final boolean... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final boolean[] newArray = new boolean[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static byte[] addAll(final byte[] array, final byte... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final byte[] newArray = new byte[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static char[] addAll(final char[] array, final char... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final char[] newArray = new char[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static double[] addAll(final double[] array, final double... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final double[] newArray = new double[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static float[] addAll(final float[] array, final float... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final float[] newArray = new float[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static int[] addAll(final int[] array, final int... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final int[] newArray = new int[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static long[] addAll(final long[] array, final long... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final long[] newArray = new long[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static short[] addAll(final short[] array, final short... elementsToAdd) {
        if (elementsToAdd == null) {
            return clone(array);
        }
        if (array == null) {
            return clone(elementsToAdd);
        }
        final short[] newArray = new short[array.length + elementsToAdd.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(elementsToAdd, 0, newArray, array.length, elementsToAdd.length);
        return newArray;
    }

    public static <T> void reverse(final T[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        T temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static <T> void reverse(final T[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final boolean[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        boolean temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final boolean[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final byte[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        byte temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final byte[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final char[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        char temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final char[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final double[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        double temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final double[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final float[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        float temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final float[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final int[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final int[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final long[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        long temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final long[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(final short[] array, final int firstBoundInclusive, final int secondBoundInclusive) {
        if (array == null) {
            return;
        }

        int start = MathUtils.max(MathUtils.min(firstBoundInclusive, secondBoundInclusive), 0);
        int end = MathUtils.min(MathUtils.max(firstBoundInclusive, secondBoundInclusive), array.length - 1);

        short temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(final short[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static <T> T[] remove(final T[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final Class<T> componentType = getComponentType(array);
        final T[] newArray = newArrayInstance(componentType, array.length - 1);
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static boolean[] remove(final boolean[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final boolean[] newArray = new boolean[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static byte[] remove(final byte[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final byte[] newArray = new byte[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static char[] remove(final char[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final char[] newArray = new char[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static double[] remove(final double[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final double[] newArray = new double[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static float[] remove(final float[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final float[] newArray = new float[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static int[] remove(final int[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static long[] remove(final long[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final long[] newArray = new long[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }

    public static short[] remove(final short[] array, final int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Array index " + index + " is out of bounds on array sized " + array.length);
        }
        final short[] newArray = new short[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        }
        return newArray;
    }
}
