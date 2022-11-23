package memoJang;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.User();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

}