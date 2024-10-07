package entities;

public class Game {
    private Player player;
    private Enemy enemy;

    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void startGame() {
        System.out.println("Game started: " + player.getName() + " vs " + enemy.getName());

        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " has been defeated!");
                break;
            }

            enemy.attack(player);
            if (!player.isAlive()) {
                System.out.println(player.getName() + " has been defeated!");
                break;
            }
        }

        System.out.println("Game over.");
    }

    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");
        Game game = new Game(player, enemy);
        game.startGame();
    }
}
