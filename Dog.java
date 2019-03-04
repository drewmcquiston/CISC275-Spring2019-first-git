class Dog extends Animal{
	Dog(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public String toString() {
		return name + ", " + numLegs;
	}
}