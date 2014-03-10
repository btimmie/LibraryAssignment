package com.branwyn.library.model;

/**
 *
 * @author Branwyn
 */
public final class Order {

    private String id;
    private String name;

    private Order() {

    }

    private Order(Builder builder) {
        id = builder.id;
        name = builder.name;

    }

    public static class Builder {

        private String id;
        private String name;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder (String name) {
            this.name = name;
           
        }

        public Order build() {
            return new Order(this);
        }

    }
     public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
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
            final Builder other = (Builder) obj;
            if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
                return false;
            }
            return true;
        }
}
