package telran.dao;

import telran.model.Entity;

import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class EntityCollectionC implements EntityCollection {
    private final LinkedList<Entity> entities = new LinkedList<>();

    //O(n)
    @Override
    public boolean add(Entity entity) {
        int index = 0;
        while (index < entities.size() && entity.compareTo(entities.get(index)) < 0) {
            index++;
        }
        entities.add(index, entity);
        return true;
    }

    //O(1)
    @Override
    public Entity removeMaxValue() {
        return entities.isEmpty() ? null : entities.removeFirst();
    }
}
