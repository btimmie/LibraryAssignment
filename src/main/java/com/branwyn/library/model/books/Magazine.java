package com.branwyn.library.model.books;

/**
 *
 * @author Branwyn
 */
public final class Magazine implements Book {

    private String id;
    private String name;

    private Magazine() {

    }

    private Magazine(Builder builder) {
        id = builder.id;
        name = builder.name;

    }

    public static class Builder {

        private String id;
        private String name;

        public Builder(String id) {
            this.id = id;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Magazine build() {
            return new Magazine(this);
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
        int hash = 5;
        hash = 13 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Magazine other = (Magazine) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
