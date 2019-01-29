public class Main{

    public static void main(String[] args){

        Main program = new Main();  //Maakt een object van de class Main. Het object is program
        program.run();              //voert de functie run uit

    }
    private void run(){
    /*
    In de onderstaande code worden er eerst 3 studenten aangemaakt. (r 20 / 22)
    Vervolgens worden er voor een aantal van deze studenten cijfers aangemaakt. (grades) (r 24 / 26)
    Vervolgens wordt een cijfer van 1 van de studenten aangepast. (r 28)
    Dan wordt het aangepaste cijfer geprint met daarbij de naam van het vak en de opdracht. (r 33 / 39)
    */


        Student[] students = new Student[5];                    //Maakt een array waarin 5 objecten passen van het type Student
        students[0] = new Student(001,"Florence John", "Harmenzon", 21);  //Maakt een object/Instance aan van de class Student. Het object is students[0]


        students[0].addGrade(new Grade("PRO2" ,"P1L4", 7));      //Maakt een object/Instance aan van de class Grade. Geeft dit object mee als argument voor de method addGrade


        students[0].getGrade(0).changeResult(8);               //Roept de method changeResult aan. Deze is gedefinieerd in de class Grade
        //De method getGrade is gedefinieerd in de class Student. Deze geeft een grade object/Instance terug

        System.out.println(students[0].getName() +              //Roept de method getName aan. Deze is gedefinieerd in de class Student
                "'s grade for " +
                students[0].getGrade(0).getCourse() +                   //Roept de method getCourse aan. Deze is gedefinieerd in de class Grade
                " , " +
                students[0].getGrade(0).getAssignment() +               //Roept de method getAssignment aan. Deze is gedefinieerd in de class Grade
                " changed to: " +
                students[0].getGrade(0).getResult());                   //Roept de method getResult aan. Deze is gedefinieerd in de class Grade

        Docent[] docenten = new Docent[5];
        docenten[0] = new Docent(001,"Erwin", "Henraat", 27, "PRO2");

        System.out.println(
                "Teacher's name is " + docenten[0].getFullName() +
                        ", age is " + docenten[0].getAge() +
                        ", course code is " + docenten[0].getCourse()
        );


    }

}
