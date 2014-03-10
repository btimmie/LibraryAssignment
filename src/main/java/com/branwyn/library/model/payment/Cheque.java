package com.branwyn.library.model.payment;

/**
 *
 * @author Branwyn
 */
public final class Cheque implements Payment {

    private String id;
    private int amount;

    private Cheque() {

    }

    private Cheque(Builder builder) {
        id = builder.id;
        amount = builder.amount;
    }

    public static class Builder {

        private String id;
        private int amount;

        public Builder(String id) {
            this.id = id;
        }

        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public Cheque build() {
            return new Cheque(this);
        }

    }

    public String getID() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cheque other = (Cheque) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
