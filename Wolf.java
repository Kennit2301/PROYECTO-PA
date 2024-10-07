package entities;

public class Wolf extends Enemy {
    // Constructor que inicializa el lobo
    public Wolf() {
        super("Wolf"); // Llama al constructor de la clase base
    }

    // Implementación de inicialización de estadísticas
    @Override
    protected void initializeStats() {
        stats.put(Stats.HP, 50);
        stats.put(Stats.MAX_HP, 50);
        stats.put(Stats.ATTACK, 10);
        stats.put(Stats.DEFENSE, 5);
        // Otras estadísticas...
    }
}
