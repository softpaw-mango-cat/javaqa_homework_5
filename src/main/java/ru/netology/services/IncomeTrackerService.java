package ru.netology.services;

public class IncomeTrackerService {

    public void calculateFreeMonths(int income, int expenses, int threshold) {
        int balance = 0;

        for (int month = 1; month <= 12; month++) {

            if (balance >= threshold) {
                int additionalExpenses = (balance - expenses) * 2 / 3;
                System.out.println("Месяц " + month + ". Денег " + balance +
                        ". Буду отдыхать. Потратил -" + expenses +
                        ", затем ещё -" + additionalExpenses);
                balance = balance - expenses - additionalExpenses;

            } else {

                System.out.println("Месяц " + month + ". Денег " + balance +
                        ". Придётся работать. Заработал +" + income +
                        ", потратил -" + expenses);
                balance = balance + income - expenses;
            }

        }
    }
}

