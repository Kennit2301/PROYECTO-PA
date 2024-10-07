package entities;

public class Orc extends Enemy {
    // Constructor que inicializa el orco
    public Orc() {
        super("Orc");
    }

    // Implementación de inicialización de estadísticas
    @Override
    protected void initializeStats() {
        stats.put(Stats.HP, 80);
        stats.put(Stats.MAX_HP, 80);
        stats.put(Stats.ATTACK, 18);
        stats.put(Stats.DEFENSE, 10);
        // Otras estadísticas...
    }
}
