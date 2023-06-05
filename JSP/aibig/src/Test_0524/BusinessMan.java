package Test_0524;

class BusinessMan extends Man {
    String company;
    String position;

    public BusinessMan(String name, String company, String position){
        this.name = name;
        this.company = company;
        this.position = position;
    }
    public void tellYourInfo(){
        System.out.println("My company is " + this.company);
        System.out.println("My position is " + this.position);
        tellYourName();
    }
}
