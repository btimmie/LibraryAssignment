package com.branwyn.library.model;

import java.util.List;

/**
 *
 * @author Branwyn
 */
public final class Member {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private List<Book> books;

    private Member() {
    }

    private Member(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        books = builder.books;

    }

    public static class Builder {

        private String id;
        private String firstName;
        private String lastName;
        private int age;
        private List<Book> books;

        public Builder(String value) {
            firstName = value;

        }

        public Builder id(String value) {
            this.id = id;
            return this;
        }

        public Builder lastName(String value) {
            lastName = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder books(List<Book> value) {
            books = value;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
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
        final Member other = (Member) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
