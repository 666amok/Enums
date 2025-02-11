//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] companies={"Audi Deutschland", "Audi Italy", "Audi France"};
        Company company = Company.AUDI_DE;

        for (String s : companies){
            if (s.equals(company.value())) System.out.println("The list have a company Audi Deutschland");
        }

        String auIt = "Audi Italy";
        for (Company c : Company.values()){
            if (auIt.equals(c.value())){
                System.out.println("This company exists: " + c.value());
            break;}
            System.out.println("This company does not exist!!!");
        }

        String comp = company.value();
        System.out.println(comp);
    }
}