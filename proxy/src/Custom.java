public class Custom {
    public static void main(String[] args) {
        HouseProxy proxy = new HouseProxy(new Host());
        proxy.rent();
    }
}
