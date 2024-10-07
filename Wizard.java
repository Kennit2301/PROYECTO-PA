package entities;

public class Wizard extends Enemy {
    // Constructor que inicializa el hechicero
    public Wizard() {
        super("Wizard");
    }

    // Implementación de inicialización de estadísticas
    @Override
    protected void initializeStats() {
        stats.put(Stats.HP, 60);
        stats.put(Stats.MAX_HP, 60);
        stats.put(Stats.ATTACK, 25); // Poder de ataque mágico
        stats.put(Stats.DEFENSE, 4);
        // Otras estadísticas...
    }
}
