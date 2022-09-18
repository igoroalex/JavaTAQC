package hw8;

public class Plant {
    private int size;

    private Color color;

    private Type type;

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Plant(int size, String colorName, String typeName) {
        this.size = size;
        setColorByName(colorName);
        setTypeByName(typeName);
    }

    public Plant(int size, Color color, Type type) {
        this.size = size;
        setColor(color);
        setType(type);
    }

    private void setTypeByName(String typeName) throws TypeException {
        try {
            Type type = Type.valueOf(typeName.toUpperCase());
            setType(type);
        } catch (IllegalArgumentException e) {
            throw new TypeException("No type " + typeName);
        }
    }

    private void setColorByName(String colorName) throws ColorException {
        try {
            Color color = Color.valueOf(colorName.toUpperCase());
            setColor(color);
        } catch (IllegalArgumentException e) {
            throw new ColorException("No color " + colorName);
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
