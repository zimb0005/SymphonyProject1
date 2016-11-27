package symphony;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SampleData {
	
	
	public SampleData(){
		super();
	}
	
	public Soloist addSoloist(String specialty,String fName,String lName,String city,String province, String country,String streetname, String streetnum, String phoneNumber){
		sol = new Soloist();
		sol.setName(new Name(fName,lName));
		AddressBuilder ab = new AddressBuilder();
		ab.city(city);
		ab.country(country);
		ab.streetName(streetname);
		ab.streetNum(streetnum);
		ab.province(province);
		sol.setAddress(ab.build());
		PhoneNumber pn = new PhoneNumber(phoneNumber);
		sol.setPhoneNumber(pn);
		sol.setSpecialty(specialty);
		return sol;
	}
	public Conductor addConductor(String fname, String lname, String city, String province, String country, String streetname,String streetnum,String phonenumber){
		conductor = new Conductor();
		AddressBuilder ab = new AddressBuilder();
		ab.city(city);
		ab.country(country);
		ab.streetName(streetname);
		ab.streetNum(streetnum);
		ab.province(province);
		conductor.setAddress(ab.build());
		conductor.setName(new Name(fname,lname));
		conductor.setPhoneNumber(new PhoneNumber(phonenumber));
		return conductor;
	}
	
	public Movement addMov(String name, int number) {
		mov = new Movement(name, number);
		return mov;
	}
	public Composition addComp(ArrayList<Movement> mov){
		compo = new Composition(mov);
		return compo;
	}
	
	public Performance addPerform(Composition comp,Soloist sol, Date datePerformed){
		perform = new Performance(sol, comp, datePerformed);
		return perform;
	}
	public Concert addConcert(Conductor con, ArrayList<Composition> comp, ArrayList<Performance> per){
		concert = new Concert(con,comp,per);
		return concert;
	}
	public Concert makeConcert() {
		SampleData sd = new SampleData();
		ArrayList<Soloist> s = new ArrayList<Soloist>();
		s.add(sd.addSoloist("Piano", "Omar", "Bajunaid", "Ottawa","Ontario", "Canada", "Woodland Dr", "123", "613-899-9887"));
		s.add(sd.addSoloist("Drum", "Sam", "Koh", "Ottawa","Ontario",  "Canada", "Julian Ave", "22", "613-777-9887"));
		s.add(sd.addSoloist("Guitar", "Mac", "Joe", "Ottawa","Ontario",  "Canada", "Steee", "111", "613-899-888"));
		
		Soloist so = sd.addSoloist("Guitar", "Mac", "Joe", "Ottawa","Ontario",  "Canada", "Mcbride Blvd ", "111", "613-899-888");
		Soloist sol = sd.addSoloist("Drum", "Sam", "Koh", "Ottawa","Ontario",  "Canada", "Carling Dr.", "22", "613-777-9887");
		
		ArrayList<Movement> m = new ArrayList<Movement>();
		m.add(sd.addMov("Mov1",1 ));
		m.add(sd.addMov("Mov2",2 ));
		m.add(sd.addMov("Mov3",3 ));
		m.add(sd.addMov("Mov4",4 ));
		
		Composition c1 = sd.addComp(m);
		
		Composition c = sd.addComp(m);
		
		
		ArrayList<Composition> cm1 = new ArrayList<Composition>();
		
		cm1.add(c1);
		cm1.add(c);
		
		Conductor d = sd.addConductor("Rob", "Sai", "Ottawa","Ontario",  "Canada", "Summit Dr.", "55", "613-997-1125");
		
		ArrayList<Performance> Aper = new ArrayList<Performance>();
		
		
		Date date = new Date("July 21, 2015");
		
		
		
		Aper.add(sd.addPerform(c, so,date));
		Aper.add(sd.addPerform(c, sol, date));
		
		Concert myConcert = sd.addConcert(d, cm1, Aper);
		
		return myConcert;
		
		
	}
	
	private Concert concert;
	private Conductor conductor;
	private Composition compo;
	private Performance perform;
	private Movement mov;
	private Soloist sol;
	
}
