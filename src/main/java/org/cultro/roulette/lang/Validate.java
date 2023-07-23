package org.cultro.roulette.lang;

@SuppressWarnings("unused")
public final class Validate {

    public static <T> void notNull(T object, String message) {
        if (object == null) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static <T> void notNull(T object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }
    }

    public static void finite(double value, String message) {
        if (!Double.isFinite(value)) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void finite(double value) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> void containsAtLeastOneNotNullElement(Iterable<T> iterable, String message) {
        boolean onlyNullElements = true;
        if (iterable != null) {
            while (iterable.iterator().hasNext() && onlyNullElements) {
                T temp = iterable.iterator().next();
                if (temp != null) {
                    onlyNullElements = false;
                }
            }
        }
        if (onlyNullElements) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static <T> void containsAtLeastOneNotNullElement(Iterable<T> iterable) {
        boolean onlyNullElements = true;
        if (iterable != null) {
            while (iterable.iterator().hasNext() && onlyNullElements) {
                T temp = iterable.iterator().next();
                if (temp != null) {
                    onlyNullElements = false;
                }
            }
        }
        if (onlyNullElements) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> void containsAtLeastOneNotNullElement(T[] array, String message) {
        boolean onlyNullElements = true;
        if (array != null) {
            for (T current : array) {
                if (current != null) {
                    onlyNullElements = false;
                    break;
                }
            }
        }
        if (onlyNullElements) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static <T> void containsAtLeastOneNotNullElement(T[] array) {
        boolean onlyNullElements = true;
        if (array != null) {
            for (T current : array) {
                if (current != null) {
                    onlyNullElements = false;
                    break;
                }
            }
        }
        if (onlyNullElements) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> void containsNoNullElements(Iterable<T> iterable, String message) {
        boolean nullElementFound = false;
        if (iterable != null) {
            while (iterable.iterator().hasNext() && !nullElementFound) {
                T temp = iterable.iterator().next();
                if (temp == null) {
                    nullElementFound = true;
                }
            }
        }
        if (nullElementFound) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static <T> void containsNoNullElements(Iterable<T> iterable) {
        boolean nullElementFound = false;
        if (iterable != null) {
            while (iterable.iterator().hasNext() && !nullElementFound) {
                T temp = iterable.iterator().next();
                if (temp == null) {
                    nullElementFound = true;
                }
            }
        }
        if (nullElementFound) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> void containsNoNullElements(T[] array, String message) {
        boolean nullElementFound = false;
        if (array != null) {
            for (T current : array) {
                if (current == null) {
                    nullElementFound = true;
                    break;
                }
            }
        }
        if (nullElementFound) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static <T> void containsNoNullElements(T[] array) {
        boolean nullElementFound = false;
        if (array != null) {
            for (T current : array) {
                if (current == null) {
                    nullElementFound = true;
                    break;
                }
            }
        }
        if (nullElementFound) {
            throw new IllegalArgumentException();
        }
    }

    public static <T extends Comparable<T>> void isEquivalent(T first, T second, String message) {
        if (first != null && second != null) {
            if (first.compareTo(second) == 0) {
                return;
            }
        }
        throw new IllegalArgumentException(message);
    }

    public static <T extends Comparable<T>> void isEquivalent(T first, T second) {
        if (first != null && second != null) {
            if (first.compareTo(second) == 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }


    public static void isEven(byte value, String message) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isEven(byte value) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isEven(double value, String message) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isEven(double value) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static void isEven(float value, String message) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isEven(float value) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static void isEven(int value, String message) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isEven(int value) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isEven(long value, String message) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isEven(long value) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isEven(short value, String message) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isEven(short value) {
        if (value % 2 == 0) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static <T extends Comparable<T>> void isGreaterThan(T first, T second, String message) {
        if (first != null && second != null) {
            if (first.compareTo(second) > 0) {
                return;
            }
        }
        throw new IllegalArgumentException(message);
    }

    public static <T extends Comparable<T>> void isGreaterThan(T first, T second) {
        if (first != null && second != null) {
            if (first.compareTo(second) > 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static <T extends Comparable<T>> void isGreaterThanOrEqualTo(T first, T second, String message) {
        if (first != null && second != null) {
            if (first.compareTo(second) >= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(message);
    }

    public static <T extends Comparable<T>> void isGreaterThanOrEqualTo(T first, T second) {
        if (first != null && second != null) {
            if (first.compareTo(second) >= 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static <T extends Comparable<T>> void isLessThan(T first, T second, String message) {
        if (first != null && second != null) {
            if (first.compareTo(second) < 0) {
                return;
            }
        }
        throw new IllegalArgumentException(message);
    }

    public static <T extends Comparable<T>> void isLessThan(T first, T second) {
        if (first != null && second != null) {
            if (first.compareTo(second) < 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static <T extends Comparable<T>> void isLessThanOrEqualTo(T first, T second, String message) {
        if (first != null && second != null) {
            if (first.compareTo(second) <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(message);
    }

    public static <T extends Comparable<T>> void isLessThanOrEqualTo(T first, T second) {
        if (first != null && second != null) {
            if (first.compareTo(second) <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void isNegative(byte number, String message) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNegative(byte number) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNegative(double number, String message) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNegative(double number) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNegative(float number, String message) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNegative(float number) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNegative(int number, String message) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNegative(int number) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNegative(long number, String message) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNegative(long number) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNegative(short number, String message) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNegative(short number) {
        if (number < 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotNegative(byte number, String message) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotNegative(byte number) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotNegative(double number, String message) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotNegative(double number) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotNegative(float number, String message) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotNegative(float number) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotNegative(int number, String message) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotNegative(int number) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotNegative(long number, String message) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotNegative(long number) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotNegative(short number, String message) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotNegative(short number) {
        if (number >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotPositive(byte number, String message) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotPositive(byte number) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotPositive(double number, String message) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotPositive(double number) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotPositive(float number, String message) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotPositive(float number) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotPositive(int number, String message) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotPositive(int number) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotPositive(long number, String message) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotPositive(long number) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isNotPositive(short number, String message) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isNotPositive(short number) {
        if (number <= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static void isOdd(byte value, String message) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isOdd(byte value) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isOdd(double value, String message) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isOdd(double value) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static void isOdd(float value, String message) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isOdd(float value) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static void isOdd(int value, String message) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isOdd(int value) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isOdd(long value, String message) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isOdd(long value) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isOdd(short value, String message) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException(message);
    }


    public static void isOdd(short value) {
        if (value % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException();
    }


    public static void isPositive(byte number, String message) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isPositive(byte number) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isPositive(double number, String message) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isPositive(double number) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isPositive(float number, String message) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isPositive(float number) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isPositive(int number, String message) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isPositive(int number) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isPositive(long number, String message) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isPositive(long number) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isPositive(short number, String message) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

    public static void isPositive(short number) {
        if (number > 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void isValidIndex(int index, String message) {
        if (index < 0) {
            if (message != null) {
                throw new IllegalArgumentException(message);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void isValidIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
    }
}
