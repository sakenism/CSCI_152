public interface Animal
{
	/**
		@return returns String which represent what kind of animal it is 		
	*/
	public String animalKind();
	/**
		@return return age of the animal

	*/
	
	public int getAge();

	/**
		@param food - name of the food	
		@return returns true if animal can eat specific type of food, returns false otherwise
	*/
	public boolean canEat(String food);

	/**
		the animal's age increases by 1	
	*/
	public void ageOneYear() throws Exception;
	/**
		animal is fed
	*/

	public String feed(String food);


	/**
		checks if animal is alive
	*/
	public boolean isAlive();
	/**
	@return returns the name and age of animal
	*/
	public String toString();

}