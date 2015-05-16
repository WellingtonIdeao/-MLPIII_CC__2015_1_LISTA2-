package br.unipe.cc.dados;
import java.util.ArrayList;
import java.util.List;
import br.unipe.cc.negocio.Item;

public class Inventario {
	private List<Item> myItems = null;
	
	public Inventario(){
		this.myItems = new ArrayList<>();
	}
	public List<Item> getMyItems() {
		return myItems;
	}
	public void setMyItems(List<Item> myItems) {
		this.myItems = myItems;
	}
	
	public void addItems(Item item){
		this.myItems.add(item);
	}
	public void mostrarList(){
		if(this.myItems.size() != 0){
			System.out.println("Coleçao:");
			for(Item i: myItems){
				System.out.println(i);
			}
		}else
			System.out.println("Coleção Vazia");
	}
}
