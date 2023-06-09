/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid.OCP;

/**
 *
 * @author arian
 */
public class Sport implements DrivingMode {
	public static final int power = 500;
	public static final int suspensionHeight = 10;
	
	@Override
	public int obtainPower() {
		return power;
	}

	@Override
	public int obtainSuspensionHeight() {
		return suspensionHeight;
	}

}
