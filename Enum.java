package Java_OOPS_2;

enum Day{
    // MONDAY("White") , Tuesday("Orange") , Wednesday("Blue") ,
    // Thursday("Red") , Friday("Yellow") , Saturday("Green") , Sunday("Black");

    MONDAY(1) , Tuesday(2) , Wednesday(3) ,
    Thursday(4) , Friday(5) , Saturday(6) , Sunday;

    private String color;
    private int num;

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private Day(int  n){ 
        this.num = n ;
    }

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    private Day(String c){
        this.color = c ;
    }

    private Day(){
        num = 10;
    }
}

public class Enum {
    public static  void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day); // Prints : MONDAY

        Day [] days  = Day.values();
        for (Day d : days ) {
            System.out.println(d);
        }

        // Here is an example of using the values of Day in if - else
        if (day == Day.MONDAY){
            System.out.println("You can we wear white color clothes");
        }

        switch (day){
            case MONDAY:
                System.out.println("You can we wear white color clothes");
                break;
            default:
                System.out.println( "You should wear black color clothes" );
        }

        for (Day  d1 : Day.values()) {
            System.out.println(d1 + " : " + d1.getNum());
        }

        for (Day  d1 : Day.values()) {
            System.out.println(d1 + " : " + d1.getColor());
        }
    }
}