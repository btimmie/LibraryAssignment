package com.branwyn.library.model;

import com.branwyn.library.model.section.Section;
import java.util.List;

/**
 *
 * @author Branwyn
 */
public final class Book {

    private String id;
    private String title;
    private int publicationYear;
    private List<Supplier> suppliers;
    private List<Author> authors;
    private List<Section> sections;

    private Book() {
    }

    private Book(Builder builder) {
        id = builder.id;
        title = builder.title;
        publicationYear = builder.publicationYear;
        suppliers = builder.suppliers;
        authors = builder.authors;
        sections= builder.sections;
    }

    public static class Builder {

        private String id;
        private String title;
        private int publicationYear;
        private List<Supplier> suppliers;
        private List<Author> authors;
        private List<Section> sections;

        public Builder(String title) {
            this.title = title;
        }

        public Builder id(String value) {
            id = value;
            return this;
        }

        public Builder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Builder suppliers(List<Supplier> suppliers) {
            this.suppliers = suppliers;
            return this;
        }

        public Builder authors(List<Author> authors) {
            this.authors = authors;
            return this;
        }

        public Builder sections(List<Section> sections) {
            this.sections = sections;
            return this;
        }
        
        

        public Book build() {
            return new Book(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public List<Supplier> getSupplier() {
        return suppliers;
    }

    public List<Author> getAuthors() {
        return authors;
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
        final Book other = (Book) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
