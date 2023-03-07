package okten_java.lesson2.describingOfUser.papirus;

public class Papirus {
    private int amountOfPages;
    private boolean paper;
    private boolean pictures;

    public Papirus(int amountOfPages, boolean paper, boolean pictures) {
        this.amountOfPages = amountOfPages;
        this.paper = paper;
        this.pictures = pictures;
    }
    public Papirus(){

    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public boolean isPaper() {
        return paper;
    }

    public void setPaper(boolean paper) {
        this.paper = paper;
    }

    public boolean isPictures() {
        return pictures;
    }

    public void setPictures(boolean pictures) {
        this.pictures = pictures;
    }
    @Override
    public String toString(){
        return "\nPapirus \n{" +
                "\namountOfPages: " + amountOfPages +
                "\n'paper: " + paper +
                "\n'pictures: " + pictures + "\n}";
    }
}
