package Dao;

import models.Equipment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oEquipmentDaoTest {
    private Connection connection;
    private Sql2oEquipmentDao equipmentDao;

    public Equipment setupNewEquipment() {
        return new Equipment("Sword of Awesome", "Sword", 4, 0, 0, 0, 0);
    }

    public Equipment setupNewEquipment1() {
        return new Equipment("Shield of Awesome", "Sheild", 0, 0, -1, 4, 2);
    }

    public Equipment setupNewEquipment2() {
        return new Equipment("Staff of Magic", "Staff", 2, 4, 0, 0, 1);
    }

    public Equipment setupNewEquipment3() {
        return new Equipment("Ring of Awesome", "Ring", 1, 1, 1, 1, 1);
    }

    @Before
    public void setUp() throws Exception {
        String connectionString  = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        equipmentDao = new Sql2oEquipmentDao(sql2o);
        connection = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        connection.close();
    }

    @Test
    public void addAddsEquipmentCorrectly() throws Exception {
        Equipment testEquipment = setupNewEquipment();
        int originalId = testEquipment.getId();
        equipmentDao.add(testEquipment);
        assertNotEquals(originalId, testEquipment.getId());
    }

    @Test
    public void findByIdFindsCorrectEquipment() throws Exception {
        Equipment equipment = setupNewEquipment();
        Equipment equipment1 = setupNewEquipment1();
        Equipment equipment2 = setupNewEquipment2();
        equipmentDao.add(equipment);
        equipmentDao.add(equipment1);
        equipmentDao.add(equipment2);
        assertEquals(equipment, equipmentDao.findById(equipment.getId()));
        assertEquals(equipment1, equipmentDao.findById(equipment1.getId()));
        assertEquals(equipment2, equipmentDao.findById(equipment2.getId()));
    }

    @Test
    public void getAllGetsAllEquipment() throws Exception {
        Equipment testEquipment = setupNewEquipment();
        equipmentDao.add(testEquipment);
        assertEquals(1, equipmentDao.getAll().size());
        Equipment testEquipment1 = setupNewEquipment1();
        equipmentDao.add(testEquipment1);
        assertEquals(2, equipmentDao.getAll().size());
        assertTrue(equipmentDao.getAll().contains(testEquipment));
        assertTrue(equipmentDao.getAll().contains(testEquipment1));
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void deleteById() throws Exception {
    }

    @Test
    public void deleteAll() throws Exception {
    }

}