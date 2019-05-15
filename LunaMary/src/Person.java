public class Person {


    private String nombre;
    private Integer edad;
    private String sexo;

    public Person(String nombre,
                  Integer edad,
                  String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public String retrieveNamePerson() {
        return nombre;
    }

    public void setNamePerson(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAgePerson() {
        return edad;
    }

    public void setAgePerson(Integer edad) {
        this.edad = edad;
    }

    public String retrieveSexerson() {
        return sexo;
    }

    public void setSexPerson(String sexo) {
        this.sexo = sexo;
    }

    public void showDataPerson() {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(sexo);
    }


}
