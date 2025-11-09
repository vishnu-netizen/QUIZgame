import java.util.Scanner;

public class questionService {
    question[]questions=new question[5];
    String[]selections=new String[5];
    public questionService() {
        questions[0] = new question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void displayquestions(){
        int i=0;
        for(question q:questions){
            System.out.println("QUESTION no: "+q.getId());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc=new Scanner(System.in);
            selections[i++]=sc.nextLine();
        }
        for(String s:selections){
            System.out.println(s);
        }
    }
    public void calscore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            question que = questions[i];
            String actualanswer=que.getAnswer();
            String selectedanswer=selections[i];
            if(actualanswer.equals(selectedanswer)){
                score++;
            }
        }
        System.out.println("YOUR SCORE"+score);
    }
}
