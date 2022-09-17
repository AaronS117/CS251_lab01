public class SMouse
{
    private int age = 0;
    private double weight = 1.0;
    public void grow()
    {
        this.weight += 0.2 * this.age;
        ++this.age;
    }
    public void display()
    {
        System.out.println("Mouse age: "+ this.age);
        System.out.println("Mouse weight: "+ this.weight + "\n");
    }// End Display
}// End Class