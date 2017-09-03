package org.launchcode.quizproject.models;

public class Quiz{

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

    private int id;
    private static int nextId = 1;
    Quiz(){
        id = nextId;
        nextId++;
//        super();
//        QuestionType.getType();
    }
}
