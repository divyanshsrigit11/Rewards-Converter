public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }

    @Test
    public void testCashToMilesConversion() {
        double cashValue = 100.0;
        double expectedMiles = cashValue * 0.0035;
        RewardValue reward = new RewardValue(cashValue);
        assertEquals(expectedMiles, reward.getMilesValue(), 0.001);
    }

    @Test
    public void testMilesToCashConversion() {
        double milesValue = 500.0; // Known miles amount
        double expectedCash = milesValue /0.0035;
        RewardValue reward = new RewardValue(milesValue);
        assertEquals(expectedCash, reward.getCashValue(), 0.001);
    }

}
