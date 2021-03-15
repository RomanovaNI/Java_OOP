package items;

import interfaces.IPrintable;

public class Newspaper extends MassMedia implements IPrintable {
    int issueNumber, numberofPages;

    public Newspaper(String name, int issueNumber, int numberofPages) {
        super(name);
        setIssueNumber(issueNumber);
        setNumberofPages(numberofPages);
    }

    public Newspaper() {
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber < 0)
            System.out.println("wrong issue number");
        else
            this.issueNumber = issueNumber;
    }

    public int getNumberofPages() {
        return numberofPages;
    }

    public void setNumberofPages(int numberofPages) {
        if (numberofPages < 0)
            System.out.println("wrong number of pages");
        else
            this.numberofPages = numberofPages;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", issueNumber=" + issueNumber +
                ", numberofPages=" + numberofPages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Newspaper is printing");
    }
}
