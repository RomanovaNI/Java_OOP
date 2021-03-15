package appl;

import interfaces.IPrintable;
import items.*;

import java.util.Arrays;

public class MassMediaAppl {
    public static void main(String[] args) {
        Newspaper np1 = new Newspaper("Spiegel", 13, 16);
        Newspaper np2 = new Newspaper("MK", 03, 8);
        Newspaper np3 = new Newspaper("Times", 25, 22);
        Journal j1 = new Journal("Bazar", 04, 142, true);
        Journal j2 = new Journal("Autos", 333, 97, false);
        Journal j3 = new Journal("Marie Clare", 17, 102, true);
        NewsPortal p1 = new NewsPortal("Meduza", "https://meduza.io");
        NewsPortal p2 = new NewsPortal("Lenta.ru", "https://lenta.ru");
        NewsPortal p3 = new NewsPortal("Zeit online", "https://www.zeit.de");
        WebSite ws1 = new WebSite("Facebook", "https://facebook.com", "Zuckerberg");
        WebSite ws2 = new WebSite("Andron13", "https://anderon13.de", "Andrej Podlubnyi");

        MassMedia[] array = new MassMedia[]{np1, np2, np3, j1, j2, j3, p1, p2, p3, ws1, ws2};
        //     IPrintable [] arr= new IPrintable[]{np1, np2, np3, j1, j2, j3, p1, p2, p3, ws1, ws2};

        //      displayPrintable(array);
        getPrintableElements(array);
        Arrays.toString(array);
        printIprintableArray(getPrintableElements(array));


    }

    private static void printIprintableArray(IPrintable[] array) {
        System.out.println(" The printable elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    private static IPrintable[] getPrintableElements(MassMedia[] input) {

        IPrintable[] output = new IPrintable[]{};

        for (int i = 0; i < output.length; i++) {
            if (input[i] instanceof IPrintable) {
                output[i] = (IPrintable) input[i];
            }

        }
        return output;
    }

    private static void displayPrintable(MassMedia[] array) {
        for (MassMedia m : array) {
            if (m instanceof IPrintable) {
                ((IPrintable) m).print();
                System.out.println(m);
            }
        }
    }
}
