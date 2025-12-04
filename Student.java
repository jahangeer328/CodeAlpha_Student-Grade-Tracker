// "implements" is keyword to use Calculation interface functions
class Student implements Calculation{
   protected String name;
   protected int [] marks;

    //Parameterized constructor
    //Constructor is special method which intialize the object
    Student(String name, int [] marks){ 
        this.name = name;
        this.marks = marks;

    }

//it is Average function which return average of totat entered marks 
    public double getAverage(){
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }
        return (double) sum/ marks.length;
    }

    //it will give highest marks which you entered by user
    public int getHighest(){
        int high = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] > high){
                high = marks[i];
            }

        }
        return  high;
    }

    //it will give lowes marks which you entered by user
    public int getLowest(){
        int low = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < low){
                low = marks[i];
            }
        }
        return  low;
    }
}
