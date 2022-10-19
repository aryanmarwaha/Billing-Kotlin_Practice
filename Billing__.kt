import java.time.LocalDateTime

fun main(){
	var BillId:Int =1
	println("Instructions :")
	println("Press Enter to Begin the software")
	println("After the Billing process is completed, You will be asked -whether you want to continue or 'Stop'")
	println("If you Wish to Terminate the software, Type 'Stop' and then Enter")
	println("-----------------------------------------------------------------------------------")
	println()

	var Initialiser1= readLine()
	while(Initialiser1!="Stop" || Initialiser1=="stop" || Initialiser1=="STOP"){
		BillId= generateBill(BillId)
		println()
		println("Would You Like to continue ... ")
		Initialiser1 = readLine()
		println()
		println()
	}
	
}


fun generateBill(BillID:Int):Int{
	print("Enter Customer-Name: ")
	var customer_name= readLine()
	val current_date = LocalDateTime.now()

	val Menu1 = mutableMapOf("Soup Vegetarian" to 50,"QuickBites Vegetarian" to 100,"Soup Non-Vegetarian" to 65 ,"QuickBites" to 110,"Non-Vegetarian" to 110)

	var Selected_Items : HashMap<String?, Array<Int?>> = HashMap<String?, Array<Int?>>()
	println()
	println("Please Select the Items From the menu :")
	for(i in Menu1.keys){
		println(i)
	}
	println()
	println("**Please Say 'Thats all' to Place the Order**")
	println("----------------------------------------------------------------------")
	println("----------------------------------------------------------------------")
	print("Please Enter the Item-name: ")
	
	var item_name= readLine()
	while(item_name!="Thats all"){
		print("Please Select The Quantity: x")
		var Quantity= readLine()!!
		var price= Menu1[item_name]

		// Selected_Items[item_name]= arrayOf(Quantity,price)
		
		Selected_Items.put(item_name , arrayOf(Quantity.toInt(),price))
		println("Item Added --------------")
		println()
		print("What Else Would You Like to Order (Item-name): ")
		item_name= readLine()

	}
	println("OK Preparing Bill --please Wait----------")
	println("OK Preparing Bill --please Wait----------")
	println("OK Preparing Bill --please Wait----------")
	println()
	println()
	println()
	println()
	println()

	println("----------------------------------------------------------------------")
	println("Bill no. ${BillID}")
	println("                                        ${current_date}")
	println("Cust.Name: ${customer_name}")
	println("                                                       ")

	var SumCost:Int=0;
	println("Item Name       |       Quantity       |        Price")
	for(item in Selected_Items.keys){

		println("${item}|            ${Selected_Items[item]?.get(0)}                  |              ${Selected_Items[item]?.get(1)} ")
		val Quantity_1= (Selected_Items[item]?.get(0))?.toInt()
		val Cost__= (Selected_Items[item]?.get(1))?.toInt()
		val productCost= (Quantity_1)!!*(Cost__)!!
		SumCost+= productCost

	}
	println("----------------------------------------------------------------------")
	println("----------------------------------------------------------------------")
	println("Total Cost:                                           |  ${SumCost}            ")
	println()
	var tax= 0.05*SumCost
	println("To Pay (after 5% service tax):                        |  ${tax+SumCost}                            ")
	println("----------------------------------------------------------------------")
	println("-------------------------------------------------------")

	var temp=BillID+1
	return temp






}

