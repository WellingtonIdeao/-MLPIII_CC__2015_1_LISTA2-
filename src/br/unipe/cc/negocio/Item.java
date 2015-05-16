package br.unipe.cc.negocio;

public class Item implements Comparable {
	private int cod;
	private String descri;
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	
	@Override
	public int compareTo(Object arg0) {
		Item item = (Item) arg0;
		if (this.cod < item.cod) {
			return -1;
		} else if (this.cod > item.cod) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Codigo do Item: "+this.cod;
	}

	@Override
	public boolean equals(Object obj) {
		Item item = (Item)obj;
		return (this.cod == item.getCod());
	}
	

}
