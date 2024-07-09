package ch32;

@FunctionalInterface
public interface Add {
    // 람다 메서드는 Add 에노테이션에 하나만 있어야 한다,,,
    public int add(int x, int y);
}
