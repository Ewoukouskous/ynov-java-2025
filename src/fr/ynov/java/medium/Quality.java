package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {

    public int Id;
    public String Name;

    public Quality(int id,String name){
        this.Id=id;
        this.Name=name;
    }

    public static void main(String[] args) {
        Quality table1 = new Quality(1, "Table");
        Quality table2 = new Quality(1, "Table");

        Quality chair = new Quality(2, "Chair");

        // Compare two object with "==" is impossible

//        if (table1==table2){
//            System.out.println("Same Object");
//        } else {
//            System.out.println("Different Object");
//        }

        if (table1.equals(table2)){
            System.out.println("Same Object");
        } else {
            System.out.println("Different Object");
        }

        if (table1.equals(chair)) {
            System.out.println("Same Object");
        } else {
            System.out.println("Different Object");
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quality quality = (Quality) obj;
        return Id == quality.Id && Objects.equals(Name, quality.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name);
    }

}
