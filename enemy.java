package entities;

import java.util.HashMap;

public class Enemy {
    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initializeStats();
    }

    public String getName() {
        return name;
    }

    public void attack(Player player) {
        int attackPower = stats.get(Stats.ATTACK);
        System.out.println(name + " attacks " + player.getName() + " with " + attackPower + " attack power.");
        player.takeDamage(attackPower);
    }

    private void initializeStats() {
        stats.put(Stats.HP, 80);
        stats.put(Stats.MAX_HP, 80);
        stats.put(Stats.ATTACK, 15);
        stats.put(Stats.DEFENSE, 8);
        // Inicializa más estadísticas según sea necesario
    }

    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }

    public void takeDamage(int damage) {
        int currentHP = stats.get(Stats.HP);
        stats.put(Stats.HP, Math.max(0, currentHP - damage));
        System.out.println(name + " now has " + stats.get(Stats.HP) + " HP.");
    }
}
