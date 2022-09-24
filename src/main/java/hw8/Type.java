package hw8;

import java.util.Comparator;

public enum Type {
    TREE, BUSH, ROOT;
    public static class TypeComparator implements Comparator<Type> {
        @Override
        public int compare(Type o1, Type o2) {
            return o1.name().compareTo(o2.name());
        }
    }

}

class TypeException extends IllegalArgumentException {
    public TypeException(String msg) {
        super(msg);
    }
}
