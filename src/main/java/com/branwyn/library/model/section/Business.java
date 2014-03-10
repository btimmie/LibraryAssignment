package com.branwyn.library.model.section;

/**
 *
 * @author Branwyn
 */
public final class Business implements Section {

    private String id;
    private String name;

    private Business() {

    }

    private Business(Builder builder) {
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

        public Builder(String name) {
            this.name = name;
        }

        public Business build() {
            return new Business(this);
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
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Business other = (Business) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    

}
