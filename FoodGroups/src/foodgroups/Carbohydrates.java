
package foodgroups;

public class Carbohydrates extends GroupInfo implements Groups{

    public Carbohydrates(String name, double weight, double totalCalories) {
        super(name, weight, totalCalories);
    }
    
    
    @Override
    public void showDetails(){
        System.out.println("Name of Food: "+name);
        System.out.println("Weight of Food: "+weight);
        System.out.println("Carbohydrates are found in bread,rice,potatoes etc.");
        System.out.println("Total calories: "+totalCalories);
    }
    
    @Override
    public void calculateCalories(){
        System.out.println(5*weight);
    }
}
