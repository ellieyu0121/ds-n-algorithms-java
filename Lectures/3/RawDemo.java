@SuppressWarnings("unchecked")
// Demonstrate raw type.
class RawDemo {
	public static void main(String args[]) {

		// Create a Gen object for Integers.
		Gen<Integer> iOb = new Gen<Integer>(88);

		// Create a Gen object for Strings.
		Gen<String> strOb = new Gen<String>("Generics Test");

		// Create a raw-type Gen object and give it
		// a Double value.
		Gen raw = new Gen(new Double(98.6));
		// Cast here is necessary because type is unknown.
		double d = (Double) raw.getob();
		System.out.println("value: " + d);

		// case1: will code below work?
		// I think it will since it's raw, and we're convering Double to Int
		// int i = (Integer) raw.getob(); // ?
		// nope!! case 1 didn't work since we can't cast Double object into Integer
		// Object
		// I don't believe this case will work either
		// strOb = raw; // ?
		// System.out.println(strOb.getob());

		// String str = strOb.getob(); // ?
		// while we could let strOb point to a raw object, it stil is a double object
		// I don't believe the case below will work
		raw = iOb; // ?
		System.out.println(iOb.getob());// output 88
		// OHHH I'm wrong!! Now the raw object points to the int object. Sorrryyy

		// Will this work? that's the million dollars question.
		// d = (Double) raw.getob(); // ?
		// nope it won't work!!!! since raw now is an integer object. we can't cast it
		// into a double
	}
}