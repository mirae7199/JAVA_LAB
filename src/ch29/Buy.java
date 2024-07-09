package ch29;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("buyer order");
    }
}
