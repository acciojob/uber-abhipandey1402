package com.driver.model;

//import com.sun.tools.javac.util.List;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int driverId;

    String mobile;

    String password;

    @OneToOne
    @JoinColumn
    private Cab cab;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private ArrayList<TripBooking> tripBookingList = new ArrayList<>();

    public Driver() {
    }

    public Driver(int driverId, String mobile, String password) {
        this.driverId = driverId;
        this.mobile = mobile;
        this.password = password;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}