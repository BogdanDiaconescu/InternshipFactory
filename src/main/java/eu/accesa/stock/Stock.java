package eu.accesa.stock;
import eu.accesa.internshipfactory.constatnts.Constants;
import eu.accesa.part.Brake;
import eu.accesa.part.Engine;
import eu.accesa.part.Part;
import java.util.ArrayList;
import java.util.List;
public class Stock {


    private Double actualSteel;
    private SteelGenerator steelGenerator;
    public void initialize() {
        System.out.println("stock");
        this.actualSteel= Constants.INITIAL_STEEL;
        steelGenerator = new SteelGenerator();
    }

    public void verifyStock (List <Part> requirements) {
        Double neededSteel=0d;
        for (Part p : requirements)
            neededSteel+=p.getSteelContentInKg();
        if (neededSteel>actualSteel)
        {
            System.out.println("Estimated time for production: " + (neededSteel-actualSteel)/100*30);
            while (neededSteel>actualSteel)
                if (SteelGenerator.generate()!=null)
                    actualSteel+=100;
            actualSteel=0d;
        }
        else
        {
            System.out.println("Production ready");
            actualSteel-=neededSteel;
        }
    }

}