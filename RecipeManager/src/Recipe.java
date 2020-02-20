import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Recipe {
	
	int id;
	
	String name;
	
	String cookTime;
	
	ArrayList<String> recipeList; 
	
	Map<Ingredient, Integer> ingredientMap = new HashMap<Ingredient, Integer>();//should ingredient list be a hashmap? 
	
	//constructors
	/**
	 * default constructor
	 */
	public Recipe() {
		this.id=0;
		this.name="";
		this.recipeList= new ArrayList<String>();
		this.cookTime="";
	}
	/**
	 * initializes recipeList with input value
	 * @param list
	 */
	public Recipe(ArrayList<String> list) {
		this.id=0;
		this.name="";
		this.recipeList= new ArrayList<String>();
		for(int i=0; i < list.size();i++) {
			this.recipeList.add(i, list.get(i));
		}

	}
	public Recipe(int id, String name, String time) {
		this.id=id;
		this.name=name;
		this.cookTime=time;
	}
	//mutator methods

	public void setId(int newId) {
		this.id = newId;
	}
	public void setCookTime(String newTime) {
		this.cookTime = newTime;
	}
	public void setRecipeList(ArrayList<String> rList) {
		this.recipeList=rList;
	}
	//accessor methods
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<String> getRecipeList(){
		return this.recipeList;
	}
	public String getCookTime() {
		return this.cookTime;
	}
	//addInstruction
	/**
	 * addInstruction -method adds a string variable to recipeList if list is not full and input has 5-200 characters.
	 * @param instruction - instruction to add to recipe
	 */
	public void addInstruction(String instruction) {
		boolean listFull;
		boolean instructionInRange;
		listFull = checkList(recipeList);
		instructionInRange= checkInstruction(instruction);
		
		if(listFull && instructionInRange) {
			recipeList.add(instruction);
			System.out.println("Instruction added.");
		} else { 
			if(!listFull) {
				System.out.println("Recipe list is full");
			}
			if(!instructionInRange) {
				System.out.println("Instruction out of range");
				}
			}
	}
	
	

	/**
	 * checkList- method returns true if input list contains less than 5 items
	 * @param list
	 * @return listFull-true if list is not full
	 */
	public boolean checkList(ArrayList<String> list) {
		boolean listFull;
		listFull =(list.size()<5);
		return listFull;
	}
	
	/**
	 * checkInstruction- returns false if input string contains less than 5 or more than 200 characters
	 * @param instruction
	 * @return
	 */
	public boolean checkInstruction(String instruction) {
		boolean instructionInRange;
		
		instructionInRange = (instruction.length() <= 200 && instruction.length() >= 10);
		
		return instructionInRange;
	}
	
	
	/**
	 * printRecipe - prints the items in recipeList appended with what step each is in the recipe 
	 */
	public void printRecipe() {
		int i;
		int step;
		int s = this.getRecipeList().size();
		for(i=0;i<s;i++) {
			step=i+1;
			System.out.println("Step " + step +": " + this.getRecipeList().get(i));
			System.out.println();
		}
	}
	
	//addIngredient
	public void addIngredient(Ingredient i, double amt) {
		
	}
	//printIngredients
	public void printIngredients(){
		
	}
	//removeIngredient
	public void removeIngredient(Ingredient i) {
		
	}
	//modifyIngredients
	public void modifyIngredientAmount(Ingredient i) {
		
	}

}
