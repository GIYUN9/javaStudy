package study;

public class Menu {
	// 3
	//우리가 영화관에서 사용하는 프로그램을 만든다고 가정한다.
	//해당 클레스는 영화관 매점에 메뉴 객체를 생성할 Menu Class이다. 
	//필요하다고 생각하는 데이터와 기능을 구현하고 이를 활용해 보자
	//필드(데이터)
	String name;
	int price;
	int stock = 0;
	//생성자
	public Menu(){
		//기본
	}
	public Menu(String foodName, int price ){
		this.name = foodName;
		this.price = price;
	}
	public void per() {

	}
	
	public void inventory() {
		System.out.println("상품명 : " + getName());
		System.out.println("재고 : " + stock);
	}
	
	//메서드
	public int inStock(int ea) {
		this.stock = ea;
		return stock;
	}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return "메뉴 이름: " + name + ", 가격: " + price + "원";
    }
}
	
	
		
	

	
	
