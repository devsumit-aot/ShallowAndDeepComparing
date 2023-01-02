public class Employee {
    private int id;
    private String name;
    private int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj != null && obj.getClass()!=this.getClass()){
            return false;
        }
        else if(obj.equals(this.getClass())){
            return true;
        }
        else{
            Employee e1=(Employee) obj;
            return e1.getId()==this.getId();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
