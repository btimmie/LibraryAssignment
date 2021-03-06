package com.branwyn.library.model;

import java.util.List;

/**
 *
 * @author Branwyn
 */
public final class Supplier {

    private String id;
    private String name;
    private List<Book> books;

    private Supplier() {

    }

    private Supplier(Builder builder) {
        id = builder.id;
        name = builder.name;
        books = builder.books;

    }

    public static class Builder {

        private String id;
        private String name;
        private List<Book> books;

        public Builder(String id) {
            this.id = id;
            
        }

        public Builder name (String name) {
            this.name = name;
            return this;
        }

        public Builder(List<Book> books) {
            this.books = books;
        }

        public Supplier build() {
            return new Supplier(this);
        }

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Supplier other = (Supplier) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
