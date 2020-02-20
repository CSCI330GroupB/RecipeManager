import java.util.ArrayList;
import java.util.Arrays;

public class UnitTest {
//	public static final String SCENARIO= "Scenario: "
//recipe source:https://www.momtastic.com/food/dinner/174899-veal-osso-buco-recipe/
	
	public static ArrayList<String> listNotFull = new ArrayList<>(Arrays.asList("Pat veal shanks dry with a paper towel and season on both sides with salt and pepper.","Heat oil in a large dutch oven over medium-high heat. Add veal shanks to the pan and brown for 3 minutes on each side. Remove shanks and put them on a plate." ,"Add vegetables and bay leaves to the same dutch oven and cook until they begin to soften (about 6 minutes).",  
			"Add the tomato paste and red wine and stir. Add the veal shanks back into the pot. Cook until half of the wine has evaporated. Pour in chicken stock. Reduce the heat to low and cover pot with a tight fitting lid. Cook for about 1 and 15 minutes."));
	public static ArrayList<String> listFull = new ArrayList<>(Arrays.asList("Pat veal shanks dry with a paper towel and season on both sides with salt and pepper.","Heat oil in a large dutch oven over medium-high heat. Add veal shanks to the pan and brown for 3 minutes on each side. Remove shanks and put them on a plate." ,"Add vegetables and bay leaves to the same dutch oven and cook until they begin to soften (about 6 minutes).",  
			"Add the tomato paste and red wine and stir. Add the veal shanks back into the pot. Cook until half of the wine has evaporated. Pour in chicken stock. Reduce the heat to low and cover pot with a tight fitting lid. Cook for about 1 and 15 minutes.", "Add in potatoes and cook for 15 – 20 minutes, until potatoes are just tender and meat is falling off of the bone. Enjoy!"));

	
	public static String inputInRange = "Add in potatoes and cook for 15 – 20 minutes, until potatoes are just tender and meat is falling off of the bone. Enjoy!";
	public static String inputShort = "Eat!";
	public static String inputLong = "'Just exactly like Father if Father had known as much about it the night before I went out there as he did the day after I came back thinking Mad impotent old man who realized at last that there must be some limit even to the capabilities of a demon for doing harm, who must have seen his situation as that of the show girl, the pony, who realizes that the principal tune she prances to comes not from horn and fiddle and drum but from a clock and calendar, must have seen himself as the old wornout cannon which realizes that it can deliver just one more fierce shot and crumble to dust in its own furious blast and recoil, who looked about upon the scene which was still within his scope and compass and saw son gone, vanished, more insuperable to him now than if the son were dead since now (if the son still lived) his name would be different and those to call him by it strangers and whatever dragon’s outcropping of Sutpen blood the son might sow on the body of whatever strange woman would therefore carry on the tradition, accomplish the hereditary evil and harm under another name and upon and among people who will never have heard the right one; daughter doomed to spinsterhood who had chosen spinsterhood already before there was anyone named Charles Bon since the aunt who came to succor her in bereavement and sorrow found neither but instead that calm absolutely impenetrable face between a homespun dress and sunbonnet seen before a closed door and again in a cloudy swirl of chickens while Jones was building the coffin and which she wore during the next year while the aunt lived there and the three women wove their own garments and raised their own food and cut the wood they cooked it with (excusing what help they had from Jones who lived with his granddaughter in the abandoned fishing camp with its collapsing roof and rotting porch against which the rusty scythe which Sutpen was to lend him, make him borrow to cut away the weeds from the door-and at last forced him to use though not to cut weeds, at least not vegetable weeds -would lean for two years) and wore still after the aunt’s indignation had swept her back to town to live on stolen garden truck and out o f anonymous baskets left on her front steps at night, the three of them, the two daughters negro and white and the aunt twelve miles away watching from her distance as the two daughters watched from theirs the old demon, the ancient varicose and despairing Faustus fling his final main now with the Creditor’s hand already on his shoulder, running his little country store now for his bread and meat, haggling tediously over nickels and dimes with rapacious and poverty-stricken whites and negroes, who at one time could have galloped for ten miles in any direction without crossing his own boundary, using out of his meagre stock the cheap ribbons and beads and the stale violently-colored candy with which even an old man can seduce a fifteen-year-old country girl, to ruin the granddaughter o f his partner, this Jones-this gangling malaria-ridden white man whom he had given permission fourteen years ago to squat in the abandoned fishing camp with the year-old grandchild-Jones, partner porter and clerk who at the demon’s command removed with his own hand (and maybe delivered too) from the showcase the candy beads and ribbons, measured the very cloth from which Judith (who had not been bereaved and did not mourn) helped the granddaughter to fashion a dress to walk past the lounging men in, the side-looking and the tongues, until her increasing belly taught her embarrassment-or perhaps fear;-Jones who before ’61 had not even been allowed to approach the front of the house and who during the next four years got no nearer than the kitchen door and that only when he brought the game and fish and vegetables on which the seducer-to-be’s wife and daughter (and Clytie too, the one remaining servant, negro, the one who would forbid him to pass the kitchen door with what he brought) depended on to keep life in them, but who now entered the house itself on the (quite frequent now) afternoons when the demon would suddenly curse the store empty of customers and lock the door and repair to the rear and in the same tone in which he used to address his orderly or even his house servants when he had them (and in which he doubtless ordered Jones to fetch from the showcase the ribbons and beads and candy) direct Jones to fetch the jug, the two of them (and Jones even sitting now who in the old days, the old dead Sunday afternoons of monotonous peace which they spent beneath the scuppernong arbor in the back yard, the demon lying in the hammock while Jones squatted against a post, rising from time to time to pour for the demon from the demijohn and the bucket of spring water which he had fetched from the spring more than a mile away then squatting again, chortling and chuckling and saying `Sho, Mister Tawm’ each time the demon paused)-the two of them drinking turn and turn about from the jug and the demon not lying down now nor even sitting but reaching after the third or second drink that old man’s state of impotent and furious undefeat in which he would rise, swaying and plunging and shouting for his horse and pistols to ride single-handed into Washington and shoot Lincoln (a year or so too late here) and Sherman both, shouting, ‘Kill them! Shoot them down like the dogs they are!’ and Jones: ‘Sho, Kernel; sho now’ and catching him as he fell and commandeering the first passing wagon to take him to the house and carry him up the front steps and through the paintless formal door beneath its fanlight imported pane by pane from Europe which Judith held open for him to enter with no change, no alteration in that calm frozen face which she had worn for four years now, and on up the stairs and into the bedroom and put him to bed like a baby and then lie down himself on the floor beside the bed though not to sleep since before dawn the man on the bed would stir and groan and Jones would say, ‘flyer I am, Kernel. Hit’s all right. They aint whupped us yit, air they?’ this Jones who after the demon rode away with the regiment when the granddaughter was only eight years old would tell people that he ‘was lookin after Major’s place and niggers’ even before they had time to ask him why he was not with the troops and perhaps in time came to believe the lie himself, who was among the first to greet the demon when he returned, to meet him at the gate and say, ‘Well, Kernel, they kilt us but they aint whupped us yit, air they?’ who even worked, labored, sweat at the demon’s behest during that first furious period while the demon believed he could restore by sheer indomitable willing the Sutpen’s Hundred which he remembered and had lost, labored with no hope of pay or reward who must have seen long before the demon did (or would admit it) that the task was hopeless-blind Jones who apparently saw still in that furious lecherous wreck the old fine figure of the man who once galloped on the black thoroughbred about that domain two boundaries of which the eye could not see from any point.' -Faulkner";
	public static String test1 = "list has less than 5 items, input has 5-200 characters";
	public static String test2 = "list has 5 items, input has 5-200 characters";
	public static String test3 = "list has less than 5 items, input has less than 5 characters";
	public static String test4 = "list has less than 5 items, input has more than 200 characters";
	public static String test5 = "list has 5 items, input has less than 5 characters";
	public static String test6 = "list has 5 items, input has more than 200 characters";
	
	public static void testAddInstruction() {
		
		
		//Scenario 1: list has less than 5 items, input has 5-200 characters
		testScenario(test1, listNotFull, listFull, 1, inputInRange);
//		printList(listNotFull);
		//Scenario 2 : list has 5 items, input has 5-200 characters
		testScenario(test2, listFull, listFull, 2, inputInRange);
//		printList(listNotFull);
		//Scenario 3: list has less than 5 items, input has less than 5 characters
		testScenario(test3, listNotFull, listNotFull, 3, inputShort);
		//Scenario 4: list has less than 5 items, input has more than 200 characters
		
		testScenario(test4, listNotFull, listNotFull, 4, inputLong);

		//Scenario 5: List has 5 items, input has less than 5 characters
		testScenario(test5, listFull, listFull, 5, inputShort);
		
		//Scenario 6: List has 5 items, input has more than 200 characters
		testScenario(test6, listFull, listFull, 6, inputLong);

		
	}
	
	
	//can this be modified to work for testing other methods?
	public static void testScenario( String testDescription, ArrayList<String> initial, ArrayList<String> expected, int scenario, String input) {
		
		Recipe r = new Recipe(initial);
		boolean pass = false;
		String result ="fail";
		
		printBreak();
		//Print scenario number and test description
		System.out.println("Scenario " + scenario + ": " + testDescription + "\n");
		//Print object state
		System.out.println("Initial Object state: \n");
		r.printRecipe();
		System.out.println();
		//Print input for this test
		System.out.println("Input: \n");
		System.out.println(input);// hard coded input
		System.out.println();
		//Print expected object state after method execution
		System.out.println("Expected object state: ");
		System.out.println();
		printList(expected);//hard coded object

		
		System.out.println("Executing method.... \n");
		r.addInstruction(input);//execute Object.method(input)
		System.out.println();
		System.out.println("Actual object state: \n");
		r.printRecipe();
		System.out.println();
		pass=expected.equals(r.getRecipeList());
		if(pass) {
			result = "pass";
		}
		System.out.println("Scenario " + scenario + " test: "+result);
		System.out.println();
		printBreak();
	}
	
	/**
	 * prints the items in an array list of strings appended with what step each is in the list
	 * @param list
	 */
	public static void printList(ArrayList<String>list) {
		int i;
		int step;

		for(i=0;i<list.size();i++) {
			step=i+1;
			System.out.println("Step " + step +": " + list.get(i));
			System.out.println();
		}
	
	
	}
	
	public static void printBreak() {
		System.out.println("<*************************************************>");
	}
	
	//testScenarioModifyIngredient
	
	//testScenarioRemoveIngredient 
}