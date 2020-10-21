package Task2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(bird1);
        animals.add(bird2);
        System.out.println(animals);
        System.out.println(getDogs(animals));
        System.out.println(getCatsAndDogs(animals));

        Set<Animal> animalSet = new HashSet<>(animals);
        System.out.println(animalSet);
        List<Animal> animalListAfterSet = new ArrayList<>(animalSet);
        System.out.println(animalListAfterSet);
        Map<String,String> map = new LinkedHashMap<>();

        System.out.println("-----------------------------------");
        for (int i = 0; i < animals.size(); i++) {
            for (int j = 0; j < animals.size(); j++) {
                if (j != i) {
                    String key = animals.get(i).getClass().getSimpleName()+ "+" + animals.get(j).getClass().getSimpleName();
                    String value = animals.get(i) + ", " + animals.get(j);
                    map.putIfAbsent(key,value);
                }
            }
        }

        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println();
        }

        System.out.println(filterByString(map,"Cat"));
    }

    public static ArrayList<Animal> getDogs(List<Animal> animals){
        ArrayList<Animal> result = new ArrayList<>();
        for (Animal animal:animals){
            if (animal instanceof Dog){
                result.add(animal);
            }
        }
        return result;
    }

    public static ArrayList<Animal> getCatsAndDogs(List<Animal> animals){
        ArrayList<Animal> result = new ArrayList<>();
        for (Animal animal:animals){
            if ((animal instanceof Dog) || (animal instanceof Cat)){
                result.add(animal);
            }
        }
        return result;
    }

    public static Map<String,String> filterByString(Map<String,String>map, String criteria){
        Map<String,String> result = new HashMap<>();

        for (Map.Entry<String,String> entry: map.entrySet()){
            if (entry.getKey().contains(criteria))
                result.put(entry.getKey(),entry.getValue());
//            System.out.println(entry.getKey().contains("Dog"));
        }

        return result;
    }
}
