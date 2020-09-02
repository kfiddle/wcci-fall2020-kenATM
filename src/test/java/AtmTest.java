import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

    Atm tester = new Atm(1234);
    Atm tester1 = new Atm();


@Test

    public void testingOurConstructor() {
        Atm tester = new Atm(1234);
        Atm tester1 = new Atm();

    }

@Test
    public void testingOurPinVerifier() {
        Assert.assertEquals(true, tester.allowAccess(1234));
        Assert.assertEquals(false, tester.allowAccess(5678));
    }

@Test

    public void testingOurDepositingMethod() {
        Atm randomAccount = new Atm(300.00);
        Assert.assertEquals(400, randomAccount.depositing(100));
}

@Test

    public void testOurOptionToWithdraw() {
        Atm jerry = new Atm(100.00);
        Atm tom = new Atm(4000.00);
        Assert.assertEquals(false, jerry.verifyWithdraw(500));
        Assert.assertEquals(true, tom.verifyWithdraw(2));

}

@Test

    public void testOurActualWithdrawal() {
    Atm tom = new Atm(30000.00);
    Atm jerry = new Atm(2.00);

   // Assert.assertEquals(10000.00, tom.withdraw(20000));


}
}