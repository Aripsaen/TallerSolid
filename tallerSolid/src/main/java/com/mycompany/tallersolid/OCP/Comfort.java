/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid.OCP;

/**
 *
 * @author arian
 */
public class Comfort implements DrivingMode {
	public static final int power = 400;
	public static final int suspensionHeight = 20;

	@Override
	public int obtainPower() {
		return power;
	}

	@Override
	public int obtainSuspensionHeight() {
		return suspensionHeight;
	}

}
