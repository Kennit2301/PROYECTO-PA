package entities;

import java.util.HashMap;

// Clase base que representa un enemigo
public abstract class Enemy {
    protected String name; // Nombre del enemigo
    protected HashMap<Stats, Integer> stats; // Mapa que almacena las estadísticas del enemigo

    // Constructor que inicializa el enemigo con un nombre
    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats(); // Inicializa las estadísticas específicas
    }

    // Método abstracto para inicializar estadísticas
    protected abstract void initializeStats();

    // Método para obtener el nombre del enemigo
    public String getName() {
        return name;
    }

    // Método para atacar al jugador
    public void attack(Player player) {
        int attackPower = stats.get(Stats.ATTACK); // Obtiene el poder de ataque
        System.out.println(name + " attacks " + player.getName() + " with " + attackPower + " attack power.");
        player.takeDamage(attackPower); // El jugador recibe daño
    }

    // Método para comprobar si el enemigo está vivo
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0; // Retorna true si la vida es mayor que 0
    }

    // Método para que el enemigo reciba daño
    public void takeDamage(int damage) {
        int currentHP = stats.get(Stats.HP); // Obtiene la vida actual
        stats.put(Stats.HP, Math.max(0, currentHP - damage)); // Resta el daño
        System.out.println(name + " now has " + stats.get(Stats.HP) + " HP."); // Muestra la vida restante
    }
}
