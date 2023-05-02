package WeatherGUI;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Load the Zipcode database
        ZipCodeDB db = new ZipCodeDB();
        db.load();

        JFrame frame =
                new JFrame("CS219 Fancy App");
        frame.setSize(550,400);
        // don't set the layout, let the
        // top level JPanel do it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new WeatherPanel(db));
        frame.setVisible(true);
    }
}
