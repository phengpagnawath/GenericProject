package com.dgb.Util;

public class Constants {
    public final static String MENU_OPTION="1/ Add\n2/ Show all\n3/ Show one\n4/ Update\n5/ Delete\n" +
                                            "6/ Category\n7/ Exit\n";
    public final static String CHOOSE_OPTION="Choice Option > ";
    public final static String CHOSE_WRONG_OPTION="You chose wrong option..!";
    public final static String PRESS_KEY_ENTER=" Please press key \"Enter\" to continue";
    public final static String GOODBYE="Good bye";
    public final static String MSG_SUCCESS="Successful..!";
    public final static String INPUT_WRONG_TYPE="This input is incorrect type..!";
    public final static String CATEGORY_MENU_OPTION="<---------------------Category-------------------->\n" +
                                                    "1/ Add new category\n2/ Show all category\n" +
                                                    "3/ Update category \n4/ Delete category\n5/ Back\n";
    public final static String MSG_NOT_FOUND="Not found..!";
    public static String INPUT(String str){
        return "Input "+str;
    }
    public final static String LINE="---------------------------------------------------------------------------";
    public final static String CATEGORY_LIST="ID\tName";
    public final static String ARTICLE_LIST="ID\tTitle\t\tDescription";
    public final static String CONFIRM_DELETE="Do you want to delete?(Y/N)";
}
