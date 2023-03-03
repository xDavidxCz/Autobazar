package com.engeto;

import java.time.LocalDate;

public class CarOwner {

    ///region Atributy

    private String ownerName;
    private String adress;
    private boolean isVIP;
    private LocalDate narozen;

    public String getOwnerName() {
        return ownerName;

    }
    ///endregion

    /// region Přístupové metody
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public LocalDate getNarozen() {
        return narozen;
    }

    public void setNarozen(LocalDate narozen) {
        this.narozen = narozen;
    }
    ///endregion


    public CarOwner(String ownerName, String adress,
                    boolean isVIP, LocalDate narozen) {
        this.ownerName = ownerName;
        this.adress = adress;
        this.isVIP = isVIP;
        this.narozen = narozen;



        }
        public CarOwner() {
            this.ownerName = "Honza Dvořák";
            this.adress = "Prostějov";
            this.isVIP = false;
            this.narozen = LocalDate.of(1996, 7, 15);
    }
}

