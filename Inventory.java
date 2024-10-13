package entities;

import items.Item;
import java.util.ArrayList;
import java.util.List;

// Clase que representa el inventario del jugador
public class Inventory {
    private List<Item> items; // Lista de ítems en el inventario

    // Constructor que inicializa el inventario vacío
    public Inventory() {
        items = new ArrayList<>();
    }

    // Método para agregar un ítem al inventario
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    // Método para remover un ítem del inventario
    public void removeItem(Item item) {
        items.remove(item);
        System.out.println(item.getName() + " removed from inventory.");
    }

    // Método para listar todos los ítems en el inventario
    public void showInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    // Método para buscar un ítem en el inventario por nombre
    public Item findItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        System.out.println(name + " not found in inventory.");
        return null;
    }
}
