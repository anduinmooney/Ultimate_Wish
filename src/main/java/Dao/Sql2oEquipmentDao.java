package Dao;

import models.Equipment;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oEquipmentDao implements EquipmentDao {
    private final Sql2o sql2o;

    public Sql2oEquipmentDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Equipment equipment) {
        String sql = "INSERT INTO equipment (name, description, strength, magic, dexterity, defense, magicDefense) VALUES (:name, :description, :strength, :magic, :dexterity, :defense, :magicDefense)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .bind(equipment)
                    .executeUpdate()
                    .getKey();
            equipment.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public Equipment findById(int id) {
        String sql = "SELECT * FROM equipment WHERE id = :id";
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Equipment.class);
        }
    }

    @Override
    public List<Equipment> getAll() {
        return null;
    }

    @Override
    public void update(int id, String name, String description, int strength, int magic, int dexterity, int defense, int magicDefense) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
