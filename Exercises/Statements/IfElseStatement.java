
import java.util.Scanner;

public class IfElseStatement {

    String ageGroup = "Age Group: Child";
    String fullName = "Name: ";
    String ageSet = "Age: ";
    String sexGender = "Gender: ";
    String countryRegion = "Country: ";
    String unknownGender = "The gender inserted is unknown";
    String hello = "Hello";
    String fullData = "FULL DATA";
    
    public static void main(String[] args) {
        
        String name;
        int age;
        String gender;
        String country; 
        String female = "female";
        String male = "male";
        String both = "both";

        IfElseStatement ageGroupObject = new IfElseStatement();
        IfElseStatement ageGroupObject1 = new IfElseStatement();
        IfElseStatement ageGroupObject2 = new IfElseStatement();
        IfElseStatement ageGroupObject3 = new IfElseStatement();
        IfElseStatement genderGroupObject = new IfElseStatement();
        IfElseStatement helloObject = new IfElseStatement();
        IfElseStatement dataObject = new IfElseStatement();

        Scanner sc = new Scanner(System.in);

        System.out.println("AGE CLASSIFICATION SYSTEMS PROVIDER\n");
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your gender: ");
        gender = sc.next();
        System.out.println("Enter your country: ");
        country = sc.next();

        System.out.println("\nFEEDBACK DATA STATUS\n");

        if (age >= 0 && age <= 12) {

            System.out.println(helloObject.hello +name);

            System.out.println(dataObject.fullData);

            IfElseStatement nameObject = new IfElseStatement();
            IfElseStatement ageObject = new IfElseStatement();
            IfElseStatement genderObject = new IfElseStatement();
            IfElseStatement countryObject = new IfElseStatement();

            if (gender.equals(female)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(male)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(both)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else {

                System.out.println(genderGroupObject.unknownGender);
            }
        }
        else if (age >= 13 && age <= 18) {

            System.out.println(helloObject.hello +name);

            System.out.println(dataObject.fullData);

            ageGroupObject1.ageGroup = "Age Group: Adolescence";

            IfElseStatement nameObject = new IfElseStatement();
            IfElseStatement ageObject = new IfElseStatement();
            IfElseStatement genderObject = new IfElseStatement();
            IfElseStatement countryObject = new IfElseStatement();

            if (gender.equals(female)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject1.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(male)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject1.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(both)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject1.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else {

                System.out.println(genderGroupObject.unknownGender);
            }
        }
        else if (age >= 19 && age <= 59) {

            System.out.println(helloObject.hello +name);

            System.out.println(dataObject.fullData);

            ageGroupObject2.ageGroup = "Age Group: Adult";

            IfElseStatement nameObject = new IfElseStatement();
            IfElseStatement ageObject = new IfElseStatement();
            IfElseStatement genderObject = new IfElseStatement();
            IfElseStatement countryObject = new IfElseStatement();

            if (gender.equals(female)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject2.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(male)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject2.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(both)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject2.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else {

                System.out.println(genderGroupObject.unknownGender);
            }
        }
        else if (age >= 60) {

            System.out.println(helloObject.hello +name);

            System.out.println(dataObject.fullData);

            ageGroupObject3.ageGroup = "Age Group: Senior Adult";

            IfElseStatement nameObject = new IfElseStatement();
            IfElseStatement ageObject = new IfElseStatement();
            IfElseStatement genderObject = new IfElseStatement();
            IfElseStatement countryObject = new IfElseStatement();

            if (gender.equals(female)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject3.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(male)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject3.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else if (gender.equals(both)) {

                System.out.println(nameObject.fullName+(name));
                System.out.println(ageObject.ageSet+(age));
                System.out.println(ageGroupObject3.ageGroup);
                System.out.println(genderObject.sexGender+(gender));
                System.out.println(countryObject.countryRegion+(country));
            }
            else {

                System.out.println(genderGroupObject.unknownGender);
            }
        }

        sc.close();
    }

}

