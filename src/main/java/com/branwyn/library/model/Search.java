package com.branwyn.library.model;

/**
 *
 * @author Branwyn
 */
public final class Search {

    private String id;
    private String bookName;

    private Search() {

    }

    private Search(Builder builder) {
        id = builder.id;
        bookName = builder.bookName;
    }

    public static class Builder {

        private String id;
        private String bookName;

        public Builder (String value) {
            id = value;
            //return this;
        }

        public Builder bookName(String bookname) {
            this.bookName = bookname;
            return this;
        }

        public Search build() {
            return new Search(this);
        }

    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Search other = (Search) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
