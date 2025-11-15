public class LogisticsApp{
    public static void main(String[] args){
        Transport t;
        t=new Truck();
        t.deliver();
        t=new Ship();
        t.deliver();
        t=new Airplane();
        t.deliver();
    }
}

class Transport{
    void deliver(){
        System.out.println("Transport is delivering goods");
    }
}

class Truck extends Transport{
    void deliver(){
        System.out.println("Truck is delivering goods");
    }
}

class Ship extends Transport{
    void deliver(){
        System.out.println("Ship is delivering goods");
    }
}

class Airplane extends Transport{
    void deliver(){
        System.out.println("Airplane is delivering goods");
    }
}
