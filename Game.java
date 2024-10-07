package entities;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player player; // Instancia del jugador
    private List<Enemy> enemies; // Lista de enemigos

    // Constructor que inicializa el juego con un jugador y una lista de enemigos
    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>(); // Inicializa la lista de enemigos
    }

    // Método para agregar enemigos al juego
    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    // Método para iniciar el juego
    public void startGame() {
        System.out.println("Game started: " + player.getName());

        // Bucle que se ejecuta mientras el jugador esté vivo y haya enemigos
        while (player.isAlive() && !enemies.isEmpty()) {
            for (int i = 0; i < enemies.size(); i++) {
                Enemy enemy = enemies.get(i);
                if (enemy.isAlive()) {
                    player.attack(enemy); // El jugador ataca al enemigo
                    if (!enemy.isAlive()) { // Si el enemigo ha sido derrotado
                        System.out.println(enemy.getName() + " has been defeated!");
                        enemies.remove(i); // Remueve al enemigo derrotado
                        i--; // Ajusta el índice
                    }
                }

                if (!player.isAlive()) { // Si el jugador ha sido derrotado
                    System.out.println(player.getName() + " has been defeated!");
                    break; // Sale del bucle
                }
            }
        }

        System.out.println("Game over."); // Mensaje de fin del juego
    }

    // Método principal para ejecutar el juego
    public static void main(String[] args) {
        Player player = new Player("Hero"); // Crea un nuevo jugador
        Game game = new Game(player); // Inicializa el juego

        // Agrega diferentes tipos de enemigos al juego
        game.addEnemy(new Wolf());
        game.addEnemy(new Skeleton());
        game.addEnemy(new Orc());
        game.addEnemy(new LesserDemon());
        game.addEnemy(new Wizard());

        game.startGame(); // Inicia el juego
    }
}
