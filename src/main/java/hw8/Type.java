package hw8;

public enum Type {
    TREE, BUSH, ROOT
}

class TypeException extends IllegalArgumentException {
    public TypeException(String msg) {
        super(msg);
    }
}
