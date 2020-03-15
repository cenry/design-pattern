package dynamic;

import base.Host;
import base.Rent;

public class Demo {

    public static void main(String[] args) {
        TestInvocationHandler testInvocationHandler = new TestInvocationHandler();
        testInvocationHandler.setTarget(new Host());
        Rent proxy = (Rent) testInvocationHandler.getProxy();
        proxy.rent();
    }

}
