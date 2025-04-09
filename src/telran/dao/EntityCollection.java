package telran.dao;
import telran.model.Entity;



public interface EntityCollection {

    boolean add(Entity entity);

    Entity removeMaxValue();
}
