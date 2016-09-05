package model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by jakob on 05-09-16.
 */
public abstract class Transaction {
    private long amount;
    private Timestamp date;
    private String description;

    /**
     * Constructor that is never going to be used
     * @param amount asdasdasd
     * @param description
     * @deprecated Never used, will probably be deleted
     */
    public Transaction(long amount, String description){
        this.amount = amount;
        this.description = description;
        date = new Timestamp(new Date().getTime());
    }

    public Transaction(long amount, Timestamp date, String description) {
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public long getAmount() {
        return amount;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}