package com.example.mobfinalmenuplusnavbar.pojo;

public class Account {

    private String name;
    private int amount;
    private String currency;

    public Account(String name, int amount, String currency) {
        this.setName(name);
        this.setAmount(amount);
        this.setCurrency(currency);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
