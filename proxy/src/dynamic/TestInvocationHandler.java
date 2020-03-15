package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestInvocationHandler implements InvocationHandler {
    private Object target;

    void setTarget(Object target) {
        this.target = target;
    }

    Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("带房客看房");
        System.out.println("执行" + proxy.getClass().getName() + "的"+ method.getName() + "方法");
        Object result = method.invoke(target, args);
        System.out.println("收中介费");
        return result;
    }
}
