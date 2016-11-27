package test_symphony;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_Address.class, Test_AddressBuilder.class,
		Test_Composition.class, Test_Concert.class, Test_ConcertSeason.class,
		Test_Conductor.class, Test_Controller.class,
		Test_FinancialTransaction.class, Test_Id.class, Test_IdGenerator.class,
		Test_Movement.class, Test_Musician.class, Test_Name.class,
		Test_Performance.class, Test_PerformedConcert.class,
		Test_PhoneNumber.class, Test_ScheduledConcert.class,
		Test_Soloist.class, Test_Ticket.class, Test_Venue.class })
public class AllTests {

}
