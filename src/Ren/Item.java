package Ren;

import java.util.ArrayList;

public class Item {
	ArrayList<Shohin> items = new ArrayList<Shohin>();
	public Item() {
		items.add(new Shohin(1,"鉛筆",80));
		items.add(new Shohin(2,"ペン",100));
		items.add(new Shohin(3,"筆箱",200));
	}
	public Shohin getShohin(int c) {
		for(Shohin s : items) {
			if(s.code == c) {
				Shohin sho = new Shohin(c,s.name, s.tanka);
				return sho;
			}
		}
		return null;
	}
	public void list() {
		System.out.println("商品コード"+"\t"+"商品名"+"\t"+"単価"+"\t"+"数量"+"\t"+"金額");
		for (Shohin s : items) {
			System.out.println(s.code + "\t\t\t"+ s.name + "\t"+ s.tanka + "\t");
		}
	}
}
