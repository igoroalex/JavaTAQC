package hw8;

public enum Color {
    GREEN, BLUE, YELLOW
}

class ColorException extends IllegalArgumentException {
    public ColorException(String msg) {
        super(msg);
    }
}
