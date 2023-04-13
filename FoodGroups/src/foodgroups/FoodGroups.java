
package foodgroups;

public class FoodGroups {

    public static void main(String[] args) {
        Groups p=new Proteins("Meat",5.6,30.0);
        Groups c=new Carbohydrates("Bread",3.2,25.1);
        Groups f=new Fats("Butter",8.2,50.6);
        
        p.showDetails();
        p.calculateCalories();
        c.showDetails();
        c.calculateCalories();
        f.showDetails();
        f.calculateCalories();
    }
    
}
