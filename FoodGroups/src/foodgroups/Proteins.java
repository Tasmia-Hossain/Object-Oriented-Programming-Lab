
package foodgroups;

public class Proteins extends GroupInfo implements Groups {

    public Proteins(String name, double weight, double totalCalories) {
        super(name, weight, totalCalories);
    }
    
    @Override
    public void showDetails(){
        System.out.println("Name of Food: "+name);
        System.out.println("Weight of Food: "+weight);
        System.out.println("Protein is found in meal,fish,eggs,etc.");
        System.out.println("Total calories: "+totalCalories);
    }
    
    @Override
    public void calculateCalories(){
        System.out.println(4*weight);
    }
}
