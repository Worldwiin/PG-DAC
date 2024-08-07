public class String_Occurence {
    public static void main(String[] args) {
        String str="I have 2 Car one is Baleno Car and other is Ferrari Car but Truck is used for transportation. Car occurred 3 time Truck Occurred 1 time";
        String s1="Car";
        String s2="Truck";
        carCount(str,s1);
        truckCount(str,s2);
    }
    public static void carCount(String str,String c) {
        String [] car=str.split(" ");
        int count=0;
        for(int i=0;i<car.length;i++){
            if(car[i].equals(c)){
                count++;
            }
        }
        System.out.println("Car has occured: "+count+" times");

    }
    public static void truckCount(String str,String t) {
        String [] truck=str.split(" ");
        int count=0;
        for(int i=0;i<truck.length;i++){
            if(truck[i].equals(t)){
                count++;
            }
        }
        System.out.println("Truck has occured: "+count+" times");
    }
}
