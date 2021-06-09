package semproject;
import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Control3 {
 private ArrayList<Question> questionSet;
 public Control3() {
  questionSet = new ArrayList<Question>();
 String q = "Which planet is the closest to the Sun?";
 String[] a = {"Venus", "Earth" , "Mercury", "North"};
 questionSet.add(new Question(q, a, "Mercury"));
 
 q = "What is the name of the first woman space tourist?";
  // must reuse variable with new String[]
  // array constants can only be used during initialization
 a = new String[]{"Jullian Moore", "Anousheh Ansari", "Paula Radcliffe","Namira Salim"};
 questionSet.add(new Question(q, a, "Anousheh Ansari"));
  
 q = "Which country successfully test fired BrahMos Missile from Sukhoi 30 MKI?";
 a = new String[]{"China", "India", "Nepal", "Bangladesh"};
 questionSet.add(new Question(q, a, "India"));

 q = "Indian Army and police of which state conduct joint anti-terror exercise in Pune?";
 a = new String[]{"Maharashtra", "Kerala", "Punjab", "J and K"};
 questionSet.add(new Question(q, a, "Maharashtra"));
 
 q = "Which movie has received the award for the Best Original Score at 14th Asian Film Awards?";
 a = new String[]{"Chichore", "Gully Boy", "Tanhaji", "Parasite"};
 questionSet.add(new Question(q, a, "Gully Boy"));
 
 q = "Who won Global Architecture Award?";
 a = new String[]{"Odisha's Krushi Bhavan", "Red Fort", "Taj Mahal", "None of these"};
 questionSet.add(new Question(q, a, "Odisha's Krushi Bhavan"));
 
 q = "Name the Indian fast bowler who will be conferred the Arjuna Award for year 2020?";
 a = new String[]{"Umesh Yadav", "Bhuvneshwar Kumar", "Mohammed Shami", "Ishant Sharma"};
 questionSet.add(new Question(q, a, "Ishant Sharma"));
 
 q = "Which butterfly has become the largest butterfly in India?";
 a = new String[]{"Nymphalis antiopa", "Golden Birdwing", "Southern Birdwing", "Pieris rapae"};
 questionSet.add(new Question(q, a, "Golden Birdwing"));
 
 q = "Which is the Indian state with the highest technical potential in wind power?";
 a = new String[]{"Gujarat", "Tamil Nadu", "Maharashtra", "Uttar Pradesh"};
 questionSet.add(new Question(q, a, "Maharashtra"));
 
 q = "Katerina Sakellaropoulou was recently elected as the first female President of which country?";
 a = new String[]{"Greece", "Serbia", "Turkey", "Hungary"};
 questionSet.add(new Question(q, a, "Greece"));
 
 q = "India has signed an agreement with which country to upgrade Ashuganj-Akhaura road into 4-lane highway?";
 a = new String[]{"Myanmar", "Nepal", "Sri Lanka", "Bangladesh"};
 questionSet.add(new Question(q, a, "Bangladesh"));
 
 q = "What is the upper limit for legal abortion, as per the Medical Termination of Pregnancy (Amendment) Bill, recently approved by the Cabinet?";
 a = new String[]{"24 weeks", "28 weeks", "32 weeks", "20 weeks"};
 questionSet.add(new Question(q, a, "24 weeks"));
 
 q = "The CBM extraction rights of Coal India was proposed to be auctioned. What does CBM stand for?";
 a = new String[]{"Coal based Mining", "Coal bed Methane", "Central block Mining", "Coal block Mining"};
 questionSet.add(new Question(q, a, "Coal bed Methane"));
 
 q = "Which technology company has announced the launch of a programme for agritech start-ups in India?";
 a = new String[]{"Google", "Amazon", "Facebook", "Microsoft"};
 questionSet.add(new Question(q, a, "Microsoft"));
 
 q = "Metro train services are to be operated across the country, except in which state/UT?";
 a = new String[]{"Maharashtra", "Tamil Nadu", "Kerala", "West Bengal"};
 questionSet.add(new Question(q, a, "Maharashtra"));
 
 q = "Who is the head of the Parliamentary Standing Committee on Information Technology?";
 a = new String[]{"Shashi Tharoor", "Adhir Ranjan Chowdhury", "Meenakshi Lekhi", "Girish Bapat"};
 questionSet.add(new Question(q, a, "Shashi Tharoor"));
 
 q = "When is the Army Day celebrated across India, every year?";
 a = new String[]{"January 13", "January 14", "January 15", "January 16"};
 questionSet.add(new Question(q, a, "January 15"));
 
 q = "ISRO is to set up its second launch port in Tamilnadu for SSLV. What does SSLV stand for?";
 a = new String[]{"Space Satellite Launch Vehicle", "Speed Satellite Launch Vehicle", "Solar Satellite Launch Vehicle", "Small Satellite Launch Vehicle"};
 questionSet.add(new Question(q, a, "Small Satellite Launch Vehicle"));
 
 q = "Which international smartphone firm recently signed an MoU with IIT- Hyderabad for Research and Development projects?";
 a = new String[]{"Xiaomi", "OPPO", "Huawei", "VIVO"};
 questionSet.add(new Question(q, a, "OPPO"));
 
 q = "Sero-survey, that is proposed to be conducted by ICMR, involves the predominant testing of which sample?";
 a = new String[]{"Nasal swab", "Throat swab", "Blood", "Urine"};
 questionSet.add(new Question(q, a, "Blood"));
 
 q = "What is L. Vannamei, a species that was seen in news recently?";
 a = new String[]{"Frog", "Turtle", "Shrimp", "Prawn"};
 questionSet.add(new Question(q, a, "Shrimp"));
 
 q = "What is the name of the free video-conferencing application, launched by Reliance Jio?";
 a = new String[]{"JioMeet", "Vande Bharat", "Hello India", "Jio Zoom"};
 questionSet.add(new Question(q, a, "JioMeet"));
 
 q = "What is the name of the short video platform launched by YouTube in India?";
 a = new String[]{"Shorts", "TinTin", "Thinkz", "Musically"};
 questionSet.add(new Question(q, a, "Shorts"));
 
 q = "What gun uses 5.56mm ammo in PUBG MOBILE among the following?";
 a = new String[]{"UMP45", "M249", "M762", "Groza"};
 questionSet.add(new Question(q, a, "M249"));
 
 q = "Who won the 'Best Actor' award in the Oscars-2020?";
 a = new String[]{"Leonardo DiCaprio", "Antonio Banderas", "Joaquin Phoenix", "Adam Driver"};
 questionSet.add(new Question(q, a, "Joaquin Phoenix"));
 
 q = "What song won the 'Song of the Year' award at the 63rd Grammy Awards?";
 a = new String[]{"Someone You Loved", "Bad Guy", "Lover", "Hard Place"};
 questionSet.add(new Question(q, a, "Bad Guy"));
 
 q = "‘Attukal Pongala’ is a famous annual women-festival of which state?";
 a = new String[]{"Tamil Nadu", "Kerala", "Karnataka", "Telangana"};
 questionSet.add(new Question(q, a, "Kerala"));
 
 q = "Which cricketer was named as the Captain of ICC’s ODI and Test teams of the year?";
 a = new String[]{"M S Dhoni", "Eoin Morgan", "Kane Williamson", "Virat Kohli"};
 questionSet.add(new Question(q, a, "Virat Kohli"));
 
 q = "Which Golfer is set to be inducted into the World Golf Hall of Fame as part of the class of 2021?";
 a = new String[]{"Rory McIlroy", "Tiger Woods", "Philip Mickelson", "Brooks Koepka"};
 questionSet.add(new Question(q, a, "Tiger Woods"));
 
 q = "Which country remains in the top spot in the latest FIFA rankings released?";
 a = new String[]{"Belgium", "France", "Brazil", "England"};
 questionSet.add(new Question(q, a, "Belgium"));

  Collections.shuffle(questionSet, new Random());
 }
 public void start(String str) {
  try (Scanner scan = new Scanner(System.in)) {
	int numCorrect = 0;
	  // show questions from questionSet
	//int[] random = new int[6];
	 Random rd= new Random();
	 Set<Integer>set = new HashSet<Integer>();
     int[] arr=new int[10];
    
     while (set.size() < 10) {
        set.add(rd.nextInt(30)+1);
       
     }
     int j = 0;
     for (Integer i: set) {
        
        arr[j]=i;
        j++;
     }
		//System.out.println(random%10);
	  int i;
	  for ( i = 0; i < questionSet.size()/3; i++) {
		 
		int	question=arr[i];
		 System.out.println("Random is"+question);
		 //System.out.println("question is"+question);
	   System.out.println("Q"+(i+1)+" "+questionSet.get(question).getQuestion());
	   //System.out.println(questionSet.get(question).get);
	   int numChoices = questionSet.get(question).getChoices().size();
	   // show choices from questions in questionSet
	   for (int choice = 0; choice < numChoices; choice++) {
	    System.out.println((choice + 1) + ": " + 
	      questionSet.get(question).getChoices().get(choice));
	   }
	   int playerAnswer = scan.nextInt();
	   ArrayList<String> choiceSet = 
	     questionSet.get(question).getChoices();
	   String correctAnswer = questionSet.get(question).getAnswer();
	   int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
	   if (playerAnswer == correctAnswerIndex + 1) {
	    numCorrect++;
	   }
	  }
	 
	  try {
	  FileOutputStream fout=new FileOutputStream("C:\\Users\\patan\\Documents\\Semester\\Semester 5\\oop Java\\semproject\\ScoreInfo.txt",true);
		String f="\n"+str+"\tScored "+numCorrect;
		//String f="\n"+username+"\t"+mailid+"\t"+phno+"\t"+pwrd
		byte[] b=f.getBytes();
		fout.write(b);
		fout.close();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  scan.close();
	  //scan.close();
	  System.out.println(str+" you got " + numCorrect + "/"+i+" correct answer(s)");
}
 }
}