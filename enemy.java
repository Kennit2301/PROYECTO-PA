package entities;

import java.util.HashMap;

public class Enemy {
    private String name; // Nombre del enemigo
    private HashMap<Stats, Integer> stats; // Mapa que almacena las estadísticas del enemigo

    // Constructor que inicializa el enemigo con un nombre
    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats(); // Inicializa las estadísticas
    }

    // Método para obtener el nombre del enemigo
    public String getName() {
        return name;
    }

    // Método para atacar al jugador
    public void attack(Player player) {
        int attackPower = stats.get(Stats.ATTACK); // Obtiene el poder de ataque del enemigo
        System.out.println(name + " attacks " + player.getName() + " with " + attackPower + " attack power.");
        player.takeDamage(attackPower); // El jugador recibe daño
    }

    // Método para inicializar las estadísticas del enemigo
    private void initializeStats() {
        stats.put(Stats.HP, 80); // Vida actual
        stats.put(Stats.MAX_HP, 80); // Vida máxima
        stats.put(Stats.ATTACK, 15); // Poder de ataque
        stats.put(Stats.DEFENSE, 8); // Defensa
        // Inicializa más estadísticas según sea necesario
    }

    // Método para comprobar si el enemigo está vivo
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0; // Retorna true si la vida es mayor que 0
    }

    // Método para que el enemigo reciba daño
    public void takeDamage(int damage) {
        int currentHP = stats.get(Stats.HP); // Obtiene la vida actual
        stats.put(Stats.HP, Math.max(0, currentHP - damage)); // Resta el daño y asegura que no baje de 0
        System.out.println(name + " now has " + stats.get(Stats.HP) + " HP."); // Muestra la vida restante
    }
}
