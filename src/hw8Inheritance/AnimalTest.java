package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n---------------------------------------------------------------\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // This is Hierarchical inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); // This is Hierarchical inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo(); // This is Hierarchical inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // This is single inheritance
		dog.animalInfo(); // This is Multi-Level inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo(); // This is single inheritance
		snake.animalInfo(); // This is Multi-Level inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo(); // This is single inheritance
		robin.animalInfo(); // This is Multi-Level inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo(); // This is single inheritance
		bullDog.mammalInfo(); // This is Multi-Level inheritance
		bullDog.animalInfo(); // This is Multi-Level inheritance

		System.out.println("\n---------------------------------------------------------------\n");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo(); // This is single inheritance
		cobra.reptileInfo(); // This is Multi-Level inheritance
		cobra.animalInfo(); // This is Multi-Level inheritance

	}

}
