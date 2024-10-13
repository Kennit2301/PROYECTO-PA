package items;

// Ejemplo de ítem misceláneo: Poción de vida
public class HealthPotion extends Miscellaneous {
    public HealthPotion() {
        super("Health Potion", "Restores 50 HP.");
    }
}

// Ejemplo de ítem misceláneo: Antídoto
public class Antidote extends Miscellaneous {
    public Antidote() {
        super("Antidote", "Cures poison.");
    }
}

// Ejemplo de ítem misceláneo: Gemas
public class Gem extends Miscellaneous {
    public Gem() {
        super("Gem", "A precious gem.");
    }
}

// Ejemplo de ítem misceláneo: Llave dorada
public class GoldenKey extends Miscellaneous {
    public GoldenKey() {
        super("Golden Key", "Opens a golden chest.");
    }

// Ejemplo de ítem misceláneo: Mapa del tesoro
public class TreasureMap extends Miscellaneous {
    public TreasureMap() {
        super("Treasure Map", "Shows the location of a hidden treasure.");
    }
}
