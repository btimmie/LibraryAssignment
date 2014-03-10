package com.branwyn.library.model.employee;

import com.branwyn.library.model.Order;
import java.util.List;

/**
 *
 * @author Branwyn
 */
public final class Librarian implements Employee {

    private String id;
    private String name;
    private List<Order> orders;

    private Librarian() {

    }

    private Librarian(Builder builder) {
        id = builder.id;
        name = builder.name;
        orders = builder.orders;

    }

    public static class Builder {

        private String id;
        private String name;
        private List<Order> orders;

        public Builder(String id) {
            this.id = id;
        }

        public Builder name (String name) {
            this.name = name;
            return this;
        }

        public Builder(List<Order> orders) {
            this.orders = orders;
        }

        public Librarian build() {
            return new Librarian(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Librarian other = (Librarian) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    

}
