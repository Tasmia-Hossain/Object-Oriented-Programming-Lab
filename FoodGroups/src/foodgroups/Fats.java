
package foodgroups;

public class Fats extends GroupInfo implements Groups{

    public Fats(String name, double weight, double totalCalories) {
        super(name, weight, totalCalories);
    }
    
    @Override
    public void showDetails(){
        System.out.println("Name of Food: "+name);
        System.out.println("Weight of Food: "+weight);
        System.out.println("Fats are found in butter,margarine,cooking oil etc.");
        System.out.println("Total calories: "+totalCalories);
    }
    
    @Override
    public void calculateCalories(){
        System.out.println(8*weight);
    }
}
