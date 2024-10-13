package items;

// Clase base para todos los ítems
public abstract class Item {
    protected String name; // Nombre del ítem
    protected String description; // Descripción del ítem

    // Constructor que inicializa el nombre y la descripción del ítem
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Método para obtener el nombre del ítem
    public String getName() {
        return name;
    }

    // Método para obtener la descripción del ítem
    public String getDescription() {
        return description;
    }

    // Método abstracto que indica si el ítem es equipable o no
    public abstract boolean isEquipable();

    @Override
    public String toString() {
        return name + ": " + description;
    }
}
