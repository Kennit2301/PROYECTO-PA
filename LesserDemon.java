package entities;

public class LesserDemon extends Enemy {
    // Constructor que inicializa el demonio menor
    public LesserDemon() {
        super("Lesser Demon");
    }

    // Implementación de inicialización de estadísticas
    @Override
    protected void initializeStats() {
        stats.put(Stats.HP, 70);
        stats.put(Stats.MAX_HP, 70);
        stats.put(Stats.ATTACK, 15);
        stats.put(Stats.DEFENSE, 8);
        // Otras estadísticas...
    }
}
