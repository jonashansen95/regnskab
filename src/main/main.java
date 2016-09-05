package main;

import model.Income;
import model.Transaction;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by jakob on 05-09-16.
 */
public class main {
    public static void main(String[] args) {
        Transaction inc = new Income(1000, new Timestamp(new Date().getTime()), "fattig");

    }
}
