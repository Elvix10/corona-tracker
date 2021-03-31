package corona.project.app.model;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class Corona {

    private String country;
    private String active;
    private String recovered;
    private String deaths;

    private String lastUpdate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;

    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }



    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    @Override
    public String toString() {
        return "Corona{" +
                "country='" + country + '\'' +
                ", active='" + active + '\'' +
                ", recovered='" + recovered + '\'' +
                ", deaths='" + deaths + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }


}
