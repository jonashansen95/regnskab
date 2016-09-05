package model;

import java.sql.Timestamp;

/**
 * Created by jonas on 05-09-2016.
 */
public class Expense extends Transaction {
    public Expense(long amount, Timestamp date, String description) {
        super(amount, date, description);
    }
}
