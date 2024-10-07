package entities;

import java.util.HashMap;

public class Player {
    private String name; // Nombre del jugador
    private HashMap<Stats, Integer> stats; // Mapa que almacena las estadísticas del jugador

    // Constructor que inicializa el jugador con un nombre
    public Player(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats(); // Inicializa las estadísticas
    }

    // Método para obtener el nombre del jugador
    public String getName() {
        return name;
    }

    // Método para atacar a un enemigo
    public void attack(Enemy enemy) {
        int attackPower = stats.get(Stats.ATTACK); // Obtiene el poder de ataque del jugador
        System.out.println(name + " attacks " + enemy.getName() + " with " + attackPower + " attack power.");
        enemy.takeDamage(attackPower); // El enemigo recibe daño
    }

    // Método para inicializar las estadísticas del jugador
    private void initializeStats() {
        stats.put(Stats.HP, 100); // Vida actual
        stats.put(Stats.MAX_HP, 100); // Vida máxima
        stats.put(Stats.ATTACK, 20); // Poder de ataque
        stats.put(Stats.DEFENSE, 10); // Defensa
        // Inicializa más estadísticas según sea necesario
    }

    // Método para comprobar si el jugador está vivo
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0; // Retorna true si la vida es mayor que 0
    }

    // Método para que el jugador reciba daño
    public void takeDamage(int damage) {
        int currentHP = stats.get(Stats.HP); // Obtiene la vida actual
        stats.put(Stats.HP, Math.max(0, currentHP - damage)); // Resta el daño y asegura que no baje de 0
        System.out.println(name + " now has " + stats.get(Stats.HP) + " HP."); // Muestra la vida restante
    }
}
