package symphony;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SampleData {
	
	
	public SampleData(){
		super();
	}
	
	public Soloist addSoloist(String specialty,String fName,String lName,String city, String country,String streetname, String streetnum, String phoneNumber){
		sol = new Soloist();
		sol.setName(new Name(fName,lName));
		AddressBuilder ab = new AddressBuilder();
		ab.city(city);
		ab.country(country);
		ab.streetName(streetname);
		ab.streetNum(streetnum);
		sol.setAddress(ab.build());
		PhoneNumber pn = new PhoneNumber(phoneNumber);
		sol.setPhoneNumber(pn);
		sol.setSpecialty(specialty);
		return sol;
	}
	public Conductor addConductor(String fname, String lname, String city,String country, String streetname,String streetnum,String phonenumber){
		conductor = new Conductor();
		AddressBuilder ab = new AddressBuilder();
		ab.city(city);
		ab.country(country);
		ab.streetName(streetname);
		ab.streetNum(streetnum);
		conductor.setAddress(ab.build());
		conductor.setName(new Name(fname,lname));
		conductor.setPhoneNumber(new PhoneNumber(phonenumber));
		return conductor;
	}
	
	public Movement addMov(String name, int number, String date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		Date d = new Date();
		d = sdf.parse(date);
		mov = new Movement(name, number);
		return mov;
	}
	public Composition addComp(ArrayList<Movement> mov){
		compo = new Composition(mov);
		return compo;
	}
	
	public Perform addPerform(Composition comp,Soloist sol){
		perform = new Perform(sol, comp);
		return perform;
	}
	public Concert addConcert(Conductor con, ArrayList<Composition> comp, ArrayList<Perform> per){
		concert = new Concert(con,comp,per);
		return concert;
	}
	public static void main(String [] args) throws ParseException{
		SampleData sd = new SampleData();
		ArrayList<Soloist> s = new ArrayList<Soloist>();
		s.add(sd.addSoloist("Piano", "Omar", "Bajunaid", "Ottawa", "Canada", "Streetn", "123", "613-899-9887"));
		s.add(sd.addSoloist("Drum", "Sam", "Koh", "Ottawa", "Canada", "Wood", "22", "613-777-9887"));
		s.add(sd.addSoloist("Guitar", "Mac", "Joe", "Ottawa", "Canada", "Steee", "111", "613-899-888"));
		
		Soloist so = sd.addSoloist("Guitar", "Mac", "Joe", "Ottawa", "Canada", "Steee", "111", "613-899-888");
		Soloist sol = sd.addSoloist("Drum", "Sam", "Koh", "Ottawa", "Canada", "Wood", "22", "613-777-9887");
		
		
		ArrayList<Movement> m = new ArrayList<Movement>();
		m.add(sd.addMov("Mov1",1 , "2015/9/10"));
		m.add(sd.addMov("Mov2",2 ,"2015/10/20"));
		m.add(sd.addMov("Mov3",3 , "2015/9/10"));
		m.add(sd.addMov("Mov4",4 ,"2015/10/20"));
		
		
		
		Composition c1 = sd.addComp(m);
		
		Composition c = sd.addComp(m);
		
		
		ArrayList<Composition> cm1 = new ArrayList<Composition>();
		
		cm1.add(c1);
		cm1.add(c);
		
		Conductor d = sd.addConductor("Rob", "Sai", "Ottawa", "Canada", "strrrrt", "55", "613-997-1125");
		
		ArrayList<Perform> Aper = new ArrayList<Perform>();
		
		Aper.add(sd.addPerform(c, so));
		Aper.add(sd.addPerform(c, sol));
		
	
		
		
		
		Concert myConcert = sd.addConcert(d, cm1, Aper);
		
		System.out.print(myConcert.getCompositions().get(0));
		
		
	}
	
	private Concert concert;
	private Conductor conductor;
	private Composition compo;
	private Perform perform;
	private Movement mov;
	private Soloist sol;
	
}
