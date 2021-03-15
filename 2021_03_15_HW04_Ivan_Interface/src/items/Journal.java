package items;

import interfaces.IPrintable;

public class Journal extends MassMedia implements IPrintable {
    int issueNumber, numberofPages;
    boolean glossy;

    public Journal(String name, int issueNumber, int numberofPages, boolean glossy) {
        super(name);
        setIssueNumber(issueNumber);
        setNumberofPages(numberofPages);
        this.glossy = glossy;
    }

    public Journal() {
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

    public boolean isGlossy() {
        return glossy;
    }

    public void setGlossy(boolean glossy) {
        this.glossy = glossy;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "name='" + name + '\'' +
                ", issueNumber=" + issueNumber +
                ", numberofPages=" + numberofPages +
                ", glossy=" + glossy +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Journal is printing");
    }
}
