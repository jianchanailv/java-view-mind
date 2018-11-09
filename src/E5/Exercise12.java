package E5;

/**
 * 编写名为Tank的类，此类的状态可以是“满的”或“空的”。其终结条件是：
 * 对象被清理时必须处于空状态，请编写finalize()以检验终结条件是否
 * 成立。在main()中测试Tank可能发生的几种使用方式。
 */
public class Exercise12 {
    public static void main(String[] args) {
        Tank tank = new Tank(true);
        tank.makeFull();
        tank = null;
        System.gc();
    }
}

class Tank {
    private boolean empty;

    Tank(boolean empty) {
        this.empty = empty;
    }

    void makeFull() {
        empty = false;
    }

    void makeEmpty() {
        empty = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if (empty) {
            System.out.println("Tank was finalized");
        } else {
            System.out.println("Error:Tank is full");
        }
//        super.finalize();
    }
}
