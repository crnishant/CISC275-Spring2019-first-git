class Dog extends Animal implements Comparable<Dog>{
    public Dog(String newName, int newLegs){
	name = newName;
	numLegs = newLegs;
    }x
    public String toString(){
	return name + ", " + numLegs;
    }

    public int compareTo(Dog d1){
	if(this.numLegs == d1.numLegs){
	    return this.name.compareTo(d1.name);
	}
        else if (this.numLegs > d1.numLegs){
	    return 1;
	}
	return -1;
    }
}
