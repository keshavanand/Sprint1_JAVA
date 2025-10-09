package com.fdmgroup.classesAndObjectsExercises;

public class Runner {
	public static void main(String args[]){
		HardDrive drive1 = new HardDrive("Seagate",2048);
		HardDrive drive2 = new HardDrive("Dell",3072);
		drive2.setUsedSpace(500);
		
		System.out.println("Drive 1 Model, Capacity and Space used: "+drive1.getModel()+" "+drive1.getCapacity()+" "+drive1.getUsedSpace());
		System.out.println("Drive 2 Model, Capacity and Space used: "+drive2.getModel()+" "+drive2.getCapacity()+" "+drive2.getUsedSpace());

		drive1.setUsedSpace(50);
		
		System.out.println("Update Drive 1 space used: "+ drive1.getUsedSpace());

		Processor processor1 = new Processor("Intel Xeon", 2.93,6);
		Processor processor2 = new Processor("Intel Celeron", 2.9,2);
		
		System.out.println("Processor 1 : "+processor1.getModel()+" "+processor1.getSpeed()+" "+processor1.getNumberOfCores());
		System.out.println("Processor 2 : "+processor2.getModel()+" "+processor2.getSpeed()+" "+processor2.getNumberOfCores());

		Memory memory1 = new Memory("Kingston", 4,1600);
		Memory memory2 = new Memory("Corsair", 8,1333);
		
		System.out.println("Memory 1: "+memory1.getModel()+" "+memory1.getCapacity()+" "+memory1.getSpeed());
		System.out.println("Memory 2: "+memory2.getModel()+" "+memory2.getCapacity()+" "+memory2.getSpeed());

	}
}
