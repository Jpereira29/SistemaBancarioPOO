package Interfaces;

public interface IBank {
    public default double deposit(double amount) {
        return 0;
    }
    public default boolean withdraw(double amount) {
        return false;
    }
}
