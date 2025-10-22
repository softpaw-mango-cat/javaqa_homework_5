package ru.netology.services;

public class IncomeTrackerService {

    public int calculateFreeMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int count = 0;
        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                int additionalExpenses = (balance - expenses) * 2 / 3;
                System.out.println("Месяц " + month + ". Денег " + balance +
                        ". Буду отдыхать. Потратил -" + expenses +
                        ", затем ещё -" + additionalExpenses);
                balance = balance - expenses - additionalExpenses;
                count++;
            } else {
                System.out.println("Месяц " + month + ". Денег " + balance +
                        ". Придётся работать. Заработал +" + income +
                        ", потратил -" + expenses);
                balance = balance + income - expenses;
            }
        }
        System.out.println("Количество дней отдыха: " + count);
        return count;
    }
}

