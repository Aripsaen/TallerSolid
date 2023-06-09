/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid.OCP;

/**
 *
 * @author arian
 */
public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode dm){
        this.vehicle.setPower(dm.obtainPower());
        this.vehicle.setSuspensionHeight(dm.obtainSuspensionHeight());
    }
}