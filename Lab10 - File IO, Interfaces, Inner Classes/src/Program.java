
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
					System.out.println("ȣ���̸� �����Ͽ����ϴ�.");
					return;
				}
				else if(b.getClass()==Dog.class) {
					hp-=10;
					System.out.println("���� �����Ͽ����ϴ�.");
					return;
				}
			}
			public void showInfo() {
				System.out.println("��� HP : "+hp);
			}
		};
		showResult(animal, person);
	}
	private static void showResult(Animal[] animals, Person p) {
		int len = animals.length;
		for(int i=0;i<len;i++) {
			if(animals[i] instanceof Barkable) {
				System.out.println((i+1)+"��° ���� : "+animals[i].getName());
				Barkable b = (Barkable)animals[i];
				System.out.println((i+1)+"��° ���� �����Ҹ� : "+b.bark());
				p.control(b);
				p.showInfo();
			}
		}
	}
}
