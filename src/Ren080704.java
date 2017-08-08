class Item{
	String name;
	int tanka;
	int suryo;

	Item(String n,int t,int s){
		name = n;
		tanka = t;
		suryo = s;
	}
	int kingaku(){
		return tanka * suryo;
	}
}
class Header{
	Item[] items;

	int shokei(){
		int sho = 0;
		for(Item i : items){
			sho += i.kingaku();
		}
		return sho;
	}
	int tax(){
		return (int)(Math.floor(shokei() * 0.08));
	}
	int gokei(){
		return shokei() + tax();
	}
}
class Ren080704{
	public static void main(String[] args){
		Header h = new Header();
		h.items = new Item[3]; 
		h.items[0] = new Item("ペン",80,1);
		h.items[1] = new Item("筆",100,2);
		h.items[2] = new Item("筆箱",600,1);

		System.out.println("商品\t単価\t数量\t合計");

		for(Item i : h.items){
			System.out.println(i.name + "\t" + i.tanka + "\t" + i.suryo + "\t" + i.kingaku());
		}
		System.out.println("\t\t小計\t" + h.shokei());
		System.out.println("\t\t税\t" + h.tax());
		System.out.println("\t\t合計\t" + h.gokei());
	}

}
