package com.branwyn.library.model;

import java.util.List;

/**
 *
 * @author Branwyn
 */
public final class Dvd {

    private String id;
    private String title;
    private String releaseDate;
    private List<Member> members;

    private Dvd() {

    }

    private Dvd(Builder builder) {
        id = builder.id;
        title = builder.title;
        releaseDate = builder.releaseDate;
        members = builder.members;

    }

    public static class Builder {

        private String id;
        private String title;
        private String releaseDate;
        private List<Member> members;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder members(List<Member> members) {
            this.members = members;
            return this;
        }
        
        public Dvd build(){
            return new Dvd(this);
            
        }

    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<Member> getMembers() {
        return members;
    }


    @Override
    public int hashCode() {
        int hash = 3;
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
        final Dvd other = (Dvd) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
