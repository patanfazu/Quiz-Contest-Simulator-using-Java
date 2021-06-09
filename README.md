# Quiz-Contest-Simulator-using-Java
## Aim/Objective : To simulate a Multiple Choice Quiz with Java

## Technologies Used: For this Quiz Contest Simulator we mainly use Eclipse IDE for Java Developers version 2020-06(4.16), In program use use different packages like FileInputStream, FileOutputStream, util, io. we use files to store data, we also pass and retrive different objects from one class to another.


## Details Handled:

### Sample Scenarios: When User runs the program he will be asked for registration or login:
If User choose registration then details will be asked and stored in files
If User choose login then details will checked in registrtion file and login time will be stored in another file
After Successful login User will be taken to Quiz
User starts attempting Quiz 10 Questions will taken randomly from set of 30 questions.
after user attempt all 10 questions his score will be displayed and same will be saved in another file.


## Applications : This quiz could be used by people of any age. It keeps the user engaged in a fun and creative way . It is used to test one's knowledge of certain things academically or otherwise. This quiz randomizes the set of questions so that two people getting the same set of questions has a low probability. With the result ,it gives the user a sense of achievement.

# Algorithm:
1. Start
1. Three options -- Registration, Login, Exit are given where the user has to choose them in the order given.
1. Choosing registration makes the user enter details such as Username, Password, Email ID, Mobile Number and these details are stored in a txt file.
1. Choosing Login directs the user to input username and password.
1. If the username and password doesn't match the respective details in the txt file stored earlier, the system terminates.
1. If the username and password match, it directs the user to the Quiz.
1. Then, questions are displayed and asks the user to answer them.
1. The system goes on adding score as the quiz goes on.
1. Then, the score is stored in another txt file. Then, the system terminates
1. End
