public class Person {
    // Membres/Attributs de la classe Person: les caracteristiques d'une personne 
    private String name;
    private int age;
    private int ID;

    // Constructeur: une methode qui permet de creer une instance/objet de la classe
    Person (String _name, int _age, int _ID) {
        this.name = _name;
        this.age = _age;
        this.ID = _ID;
    }

    // Helpers:
    public void printInfos(){
        System.out.println("Informations sur la personne: " + this);
        System.out.println(this.getName ());
        System.out.println(this.getAge ());
        System.out.println(this.getID ());
    }

    // Getters
    public String getName ()    {  return this.name;    }
    public int getAge ()        {  return this.age;     }
    public int getID ()         {  return this.ID;      }

    // Setters
    public void setName (String _name)  {  this.name = _name;  }
    public void setAge (int _age)       {  this.age = _age;    }
    public void setID (int _ID)         {  this.ID = _ID;      }

    public void setAll (String _name, int _age, int _ID) {
        this.setName(_name);
        this.setAge(_age);
        this.setID(_ID);
    }
}