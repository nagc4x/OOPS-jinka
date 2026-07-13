class student{
    String name;
    int age,cgpa;
    
    public static void main(String args[]){
        student s1 = new student();
        student s2 = new student("abhinav",17,7);
        s1.display();
        s2.display();
    }
    student(){
        name="nagc";
        age=18;
        cgpa=6;
    }
    student(String n,int a,int c){
        name=n;
        age=a;
        cgpa=c;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
    }
}