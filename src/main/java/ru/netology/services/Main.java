package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        IncomeTrackerService service = new IncomeTrackerService();
        int freeDays;
        freeDays = service.calculateFreeMonths(10_000, 3_000, 20_000);
        System.out.println();
        freeDays = service.calculateFreeMonths(100_000, 60_000, 150_000);

    }
}
