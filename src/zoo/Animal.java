package zoo;
abstract class Animal {

        private int health;
        private String status;

        public Animal(int health, String status) {
            this.health = health;
            this.status = status;
        }

        public void eat() {
            System.out.println(getClass().getSimpleName() + " is eating.");
            health += 10;
        }

        public void sleep() {
            System.out.println(getClass().getSimpleName() + " is sleeping.");
            health += 5;
        }


        public abstract void makeSound();


        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }


    class Lion extends Animal {
        public Lion(int health, String status) {
            super(health, status);
        }

        @Override
        public void makeSound() {
            System.out.println("Lion roars: Roarrr!");
        }
    }

    class Elephant extends Animal {
        public Elephant(int health, String status) {
            super(health, status);
        }

        @Override
        public void makeSound() {
            System.out.println("Elephant trumpets: Pawoo!");
        }
    }

    class Monkey extends Animal {
        public Monkey(int health, String status) {
            super(health, status);
        }

        @Override
        public void makeSound() {
            System.out.println("Monkey chatters: Ooh ooh aah aah!");
        }
}
