package items;

// Clase base para todos los ítems de arma
public abstract class Weapon extends Item {
    protected int attackPower; // Poder de ataque del arma

    // Constructor que inicializa el arma
    public Weapon(String name, String description, int attackPower) {
        super(name, description);
        this.attackPower = attackPower;
    }

    // Método que indica que el arma es equipable
    @Override
    public boolean isEquipable() {
        return true;
    }

    // Método para obtener el valor de ataque
    public int getAttackPower() {
        return attackPower;
    }
}
