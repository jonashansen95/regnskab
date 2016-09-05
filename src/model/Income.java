package model;

import java.sql.Timestamp;

/**
 * Created by jakob on 05-09-16.
 */
public class Income extends Transaction{
    public Income(long amount, Timestamp date, String description) {
        super(amount, date, description);
    }
}
