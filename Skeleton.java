package entities;

public class Skeleton extends Enemy {
    // Constructor que inicializa el esqueleto
    public Skeleton() {
        super("Skeleton");
    }

    // Implementación de inicialización de estadísticas
    @Override
    protected void initializeStats() {
        stats.put(Stats.HP, 40);
        stats.put(Stats.MAX_HP, 40);
        stats.put(Stats.ATTACK, 12);
        stats.put(Stats.DEFENSE, 3);
        // Otras estadísticas...
    }
}
