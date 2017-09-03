package org.launchcode.quizproject.models;

import java.util.ArrayList;

public class Quiz{
//
//    public enum QuestionType {
//        CHECKBOX("checkbox"), SELECT("select"), RADIO("radio");
//        private String type;
//        QuestionType(String type){
//            this.type = type;
//        }
//        public String getType(){
//            return type;
//        }
//    }

//    private int id;
//    private static int nextId = 1;
    private ArrayList<Question> questionList = new ArrayList<>();
    private Question question = new Question();
//    private String question;

//    public String getQuestion(){
//        return question;
//    }
//    public void setQuestion(String question){
//        this.question = question;
//    }
    public ArrayList<Question> getQuestionList(){
        return questionList;
    }
    public void setQuestionList(ArrayList<Question> questionList){
        questionList.add(question);
    }


//    QuestionType;
//    private String answer;
//    private int score;



    Quiz(){
        super();
//        this.id = nextId;
//        nextId++;

//        super();
//        QuestionType.getType();
    }
}
