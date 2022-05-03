package G9W;

class Car3{
	private String model;
	public Car3(String model) {
		this.model = model;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Car3)
			return model.equals(((Car3)obj).model);
		else
			return false;
	}
	
	public String toString() {
		return model;
		
	}
}

public class CartTest2 {
	public static void main(String[] args) {
		Car3 firstCar = new Car3("HMW520");
		Car3 secondeCar = new Car3("HMW520");
		if(firstCar.equals(secondeCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
		System.out.println(firstCar);
		System.out.println(secondeCar);
	}
}
