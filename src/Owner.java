public class Owner {
    private String name;
    private int age;
    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
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
    public boolean isEligibleCreditCard() {
        if(this.age < 18) {
            System.out.println("You are not entitled to a bank card.");
            return false;
        }else{
            System.out.println("You are entitled to a bank card.");
            return true;
        }
    }

}