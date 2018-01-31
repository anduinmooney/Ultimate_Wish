package Dao;

import models.Word;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/31/18.
 */
public class Sql2oWordDaoTest {
    private Connection connection;
    private Sql2oWordDao wordDao;

    @Before
    public void setUp() throws Exception {
        String connectionString  = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        wordDao = new Sql2oWordDao(sql2o);
        connection = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        connection.close();
    }


    public Word setUpNewWord() {
        return new Word("Poop");
    }

    public Word setUpNewWord1() {
        return new Word("Pee");
    }

    public Word setUpNewWord2() {
        return new Word("fart");
    }

    @Test
    public void add() throws Exception {
        Word word = setUpNewWord();
        int originalId = word.getId();
        wordDao.add(word);
        assertNotEquals(originalId, word.getId());
    }

    @Test
    public void createRandomWord() throws Exception {
        wordDao.createRandomWord();
        wordDao.createRandomWord();
        assertNotEquals(wordDao.findById(1).getName(), wordDao.findById(2).getName());
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void getAll() throws Exception {
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