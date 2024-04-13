package edu.sullivb.assign06;

import edu.sullivb.assign04.GameBoard;

import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable {

    private final int mapRows = 12;
    private final int mapCols = 30;
    private final char mapChar = '.';
    private GameBoard baseMap = new GameBoard(mapRows, mapCols, mapChar);

    private ArrayList<Loadable> loadables = new ArrayList<Loadable>();
    public Loadable createLoadable(String typeName) throws GameFileException {
        if (Objects.equals(typeName, "Rat")) {
            return new Rat();
        } else if (Objects.equals(typeName, "Skeleton")) {
            return new Skeleton();
        } else if (Objects.equals(typeName, "Item")) {
            return new Item();
        } else if (Objects.equals(typeName, "Tome")) {
            return new Tome();
        } else {
            throw new GameFileException("Unknown type: " + typeName);
        }
    }
    public void load(Scanner input) throws GameFileException {
        loadables.clear();
        baseMap = new GameBoard(mapRows, mapCols, mapChar);
        int linesInFile = input.nextInt();
        for (int i = 0; i < linesInFile; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input); // set pos of loadable
            loadables.add(m);
            if (m instanceof Drawable) {
                ((Drawable) m).draw(baseMap);
            }
        }
    }
    public void save(String fileName) throws GameFileException {
        try(PrintWriter output = new PrintWriter(fileName)) {
            output.print(this.toString());
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
    public String toString() {
        StringBuilder creatures = new StringBuilder();
        StringBuilder inventory = new StringBuilder();

        creatures.append("CREATURES:\n");
        inventory.append("INVENTORY:\n");
        for (Loadable obj : loadables) {
            if (obj instanceof Creature) {
                creatures.append("* ").append(obj).append("\n");
            } else if (obj instanceof Item) {
                inventory.append("* ").append(obj).append("\n");
            }
        }
        return "MAP:\n" + baseMap.getBoardString() + "\n" +  creatures + inventory;
    }
}
