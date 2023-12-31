package domain;

/**
 * Клас Exercise містить метод для обчислення кількості способів підняття по сходах.
 * Кількість способів обчислюється з використанням підходу динамічного програмування.
 */
public class Exercise {

    /**
     * Обчислює кількість способів підняття по сходах.
     *
     * @param n Кількість сходинок у сходах.
     * @return Кількість способів підняття по сходах.
     */
    public static int Calculate(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}