package items;

// Clase que representa un ítem misceláneo (objetos varios)
public class Miscellaneous extends Item {

    // Constructor que inicializa el ítem misceláneo
    public Miscellaneous(String name, String description) {
        super(name, description);
    }

    // Método que indica que no es equipable
    @Override
    public boolean isEquipable() {
        return false;
    }
}
