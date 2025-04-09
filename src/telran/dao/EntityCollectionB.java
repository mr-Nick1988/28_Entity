package telran.dao;

import telran.model.Entity;

import java.util.TreeSet;

public class EntityCollectionB implements EntityCollection {
  private final TreeSet<Entity> entities = new TreeSet<>((a,b)-> b.compareTo(a));

    //O(log n)
    @Override
    public boolean add(Entity entity) {
       return entities.add(entity);
    }

    //O(log n)
    @Override
    public Entity removeMaxValue() {
        return entities.pollFirst();
    }
}
