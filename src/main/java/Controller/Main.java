
package Controller;

import Model.Histogram;
import Model.MailHistogramBuilder;
import Model.MailListReader;
import View.HistogramDisplay;
import View.Mail;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Roberto GS\\Desktop\\IS2\\Kata4_RGS\\email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histo = MailHistogramBuilder.build(mailList);;
        HistogramDisplay histogramDisplay= new HistogramDisplay(histo);
        histogramDisplay.execute();
    }
}
