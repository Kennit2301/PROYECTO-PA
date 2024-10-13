package items;

// Clase base para todos los ítems de armadura
public abstract class Armor extends Item {
    protected int defense; // Defensa que ofrece la armadura

    // Constructor que inicializa la armadura
    public Armor(String name, String description, int defense) {
        super(name, description);
        this.defense = defense;
    }

    // Método que indica que la armadura es equipable
    @Override
    public boolean isEquipable() {
        return true;
    }

    // Método para obtener el valor de defensa
    public int getDefense() {
        return defense;
    }
}
