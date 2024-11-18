class Main {
    public static void main(String[] args)
  {
    // create 3 shrimps
    Shrimp pregnant = new Shrimp("pregnant", 14, false);
    Shrimp cheen = new Shrimp("cheen", 8, true);
    Shrimp lilStink = new Shrimp("lilStink", 10, true);

   // test the constructors
    System.out.println(pregnant.getName());
    System.out.println(cheen.getLegs());
    System.out.println(lilStink.getAlive());

    // create 2 more shrimps with names less than 5 letters in length
    Shrimp eek = new Shrimp("eek", 12, true);
    Shrimp kik = new Shrimp("kik", 4, false);

    // create an array of size 7 with all the shrimp
    Shrimp[] arr = new Shrimp[5];
    arr[0] = pregnant;
    arr[1] = cheen;
    arr[2] = lilStink;
    arr[3] = eek;
    arr[4] = kik;

    //test your methods here
    System.out.println(normLegs(arr));
    }
    
    // Turns out shrimp usually have 10 legs. Huh. I thought they'd be like spiders and have 8. Anyway, write a method that will go through an array of Shrimp and a String of the names of the Shrimp with 10 or more legs separated by a comma and a space
 public static String normLegs(Shrimp[] arr){
  String output = "";
  for(int i = 0; i < arr.length; i++){
    if(arr[i]!=null && arr[i].getLegs()>=10){
      output += arr[i].getName() + ", ";
    }
  }
  if(output.isEmpty()){
    return "Everyone has freaky legs.";
  }
  else{
    return "These shrimp have a good amount of legs: " + output.substring(0, output.length()-2);
  }
}

//Shrimp with short names need short legs. If a Shrimp has less than 5 characters in its name, then chop off their legs until the number of legs they have matches the length of their name 
public static void nameKill(Shrimp[] arr){
  for(int j = 0; j < arr.length; j++){
    if(arr[j]!= null && arr[j].getName().length() < 5){
      arr[j].setLegs(arr[j].getName().length());
  }

}

}

}