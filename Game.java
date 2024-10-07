package entities;

public class Game {
    private Player player; // Instancia del jugador
    private Enemy enemy; // Instancia del enemigo

    // Constructor que inicializa el juego con un jugador y un enemigo
    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    // Método para iniciar el juego
    public void startGame() {
        System.out.println("Game started: " + player.getName() + " vs " + enemy.getName()); // Mensaje de inicio

        // Bucle que se ejecuta mientras el jugador y el enemigo estén vivos
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy); // El jugador ataca al enemigo
            if (!enemy.isAlive()) { // Si el enemigo ha sido derrotado
                System.out.println(enemy.getName() + " has been defeated!");
                break; // Sale del bucle
            }

            enemy.attack(player); // El enemigo ataca al jugador
            if (!player.isAlive()) { // Si el jugador ha sido derrotado
                System.out.println(player.getName() + " has been defeated!");
                break; // Sale del bucle
            }
        }

        System.out.println("Game over."); // Mensaje de fin del juego
    }

    // Método principal para ejecutar el juego
    public static void main(String[] args) {
        Player player = new Player("Hero"); // Crea un nuevo jugador
        Enemy enemy = new Enemy("Goblin"); // Crea un nuevo enemigo
        Game game = new Game(player, enemy); // Inicializa el juego
        game.startGame(); // Inicia el juego
    }
}

