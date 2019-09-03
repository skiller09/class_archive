
public class Program {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Turtle turtle = new Turtle();
		
		Animal[] animal = new Animal[3];
		animal[0] = dog;
		animal[1] = tiger;
		animal[2] = turtle;
		
		Person person = new Person() {
			private int hp = 100;
			public void control(Barkable b) {
				if(b==null) throw new NullPointerException("Object is null");
				if(b.getClass()==Tiger.class) {
					hp-=80;
					System.out.println("호랑이를 제압하였습니다.");
					return;
				}
				else if(b.getClass()==Dog.class) {
					hp-=10;
					System.out.println("개를 제압하였습니다.");
					return;
				}
			}
			public void showInfo() {
				System.out.println("사람 HP : "+hp);
			}
		};
		showResult(animal, person);
	}
	private static void showResult(Animal[] animals, Person p) {
		int len = animals.length;
		for(int i=0;i<len;i++) {
			if(animals[i] instanceof Barkable) {
				System.out.println((i+1)+"번째 동물 : "+animals[i].getName());
				Barkable b = (Barkable)animals[i];
				System.out.println((i+1)+"번째 동물 울음소리 : "+b.bark());
				p.control(b);
				p.showInfo();
			}
		}
	}
}
