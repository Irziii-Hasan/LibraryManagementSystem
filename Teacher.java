package ConsulnetLibrary;

public class Teacher extends User{
    private String name, dept;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    void getDetails() {
        System.out.println("User ID: "+ id);
        System.out.println("UserName: "+ name);
        System.out.println("Department: "+ dept);

    }

    @Override
    void enrollUser() {

    }
}
