public class Docent {
    //Global private variabelen die binnen deze class beschikbaar zijn
    private int _id;
    private String _name;
    private String _lastName;
    private int _age;
    private String _courseCode;
    public Docent(int id, String name, String lastName, int age, String courseCode){
        //Constructor net als in de Grade class
        _id = id;
        _name = name;
        _lastName = lastName;
        _age = age;
        _courseCode = courseCode;
    }

    public int getId(){
        return _id;
    }
    public String getName(){                //MEthod getName om de naam van de student uit te lezen. (aangeroepen in Main.java r 31)
        return _name;
    }
    public String getFullName(){
        return _name + " " + _lastName;
    }
    public int getAge(){
        return _age;
    }
    public String getCourse(){                    //method getCourse waarmee het vak kan worden gelezen. (aangeroepen in Main.java r 33)
        return _courseCode;
    }
}
