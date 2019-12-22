package nullobject;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:45
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealConsumer(name);
            }
        }
        return new NullCustomer();
    }
}
