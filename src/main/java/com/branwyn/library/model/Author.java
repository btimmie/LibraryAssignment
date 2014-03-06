/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.branwyn.library.model;

/**
 *
 * @author Branwyn
 */
public final class Author {

    private String id;
    private String firstName;
    private String lastName;
    private int numberOfPublications;

    private Author() {

    }

    private Author(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        numberOfPublications = builder.numberOfPublications;
    }

    public static class Builder {

        private String id;
        private String firstName;
        private String lastName;
        private int numberOfPublications;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder(int numberOfPublications) {
            this.numberOfPublications = numberOfPublications;
        }
        
        public Author build(){
            return new Author(this);
            
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

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Author other = (Author) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
