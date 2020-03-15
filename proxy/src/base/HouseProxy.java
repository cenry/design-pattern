package base;

public class HouseProxy implements Rent {

    private Host host;

    public HouseProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("带房客看房");
        host.rent();
        System.out.println("收中介费");
    }

}
