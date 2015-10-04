package javabasic.session5.service;

import javabasic.session5.abstractmodel.BangunDatar;
import javabasic.session5.model.Segitiga;

public class SegitigaService implements BangunDatar {

	private Segitiga segitiga;
	
	public SegitigaService(Segitiga segitiga) {
		this.segitiga = segitiga;
	}
	
	public Double hitungLuas() {
		return (double)((this.segitiga.getAlas() * this.segitiga.getTinggi()) / 2.0);
	}

}
