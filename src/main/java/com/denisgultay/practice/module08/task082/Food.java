package com.denisgultay.practice.module08.task082;

import com.denisgultay.practice.module08.task081.Country;
import com.denisgultay.practice.module08.task081.IdGenerator;

public class Food {

    private long id = IdGenerator.createId();
    private String name;
    private Country country;
    private int expiration;

    public Food(long id, String name, Country country, int expiration) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;

        Food food = (Food) o;

        if (getId() != food.getId()) return false;
        if (getExpiration() != food.getExpiration()) return false;
        if (!getName().equals(food.getName())) return false;
        return getCountry() == food.getCountry();
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCountry().hashCode();
        result = 31 * result + getExpiration();
        return result;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration + " days" +
                '}';
    }
}
