package com.listview.img;

public class Planet {

	private int drawableId;
	private String diametro;
	private String categoria;
	private String sat;

	public Planet(int drawableId, String diametro, String categoria, String sat) {
		super();
		this.drawableId = drawableId;
		this.diametro = diametro;
		this.categoria = categoria;
		this.sat = sat;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setSat(String sat) {
		this.sat = sat;
	}

	public String getDiametro() {
		return diametro;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getSat() {
		return sat;
	}

	public int getDrawableId() {
		return drawableId;
	}

	public void setDrawableId(int drawableId) {
		this.drawableId = drawableId;
	}

}
