class AnimalCompare implements Comparator<Animal>{
    @Override
    public int compare(Animal a1,Animal a2){
	if(a1.name.compareTo(a2.name) == 0){
	    if(a1.numLegs > a2.numLegs){
		return 1;
	    }
	    else if(a1.numLegs < a2.numLegs){
		return -1;
	    }
	    else{
		return 0;
	    }
	}
	    return a1.name.compareTo(a2.name);
    }
}
