import javax.swing.*;

public class PsychMoneyInfo extends ParentClassBook{

    Books psychoMoneyInfo = new Books("Psychology of Money","Morgan Housel","316","Jaico Publishing House","2020","English");
    ImageIcon psychMoneyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\PsychMoneyCover.jpg");

    PsychMoneyInfo() {
        frame.setTitle("Psychology of Money by Morgan Housel");
        bookCover.setIcon(psychMoneyImg);
        Title.setText(psychoMoneyInfo.getTitle());
        Author.setText(psychoMoneyInfo.getAuthor());
        Publisher.setText(psychoMoneyInfo.getPublisher());
        NumberOfPages.setText(psychoMoneyInfo.getNumberOfPages());
        YearPublished.setText(psychoMoneyInfo.getYearPublished());
        Language.setText(psychoMoneyInfo.getLanguage());
        overview.setText("             Doing well with money isn’t necessarily about what you know. It’s about how you behave. And behavior " +
                "is hard to teach, even to really smart people.\n" + "\n" + "Money―investing, personal finance, and business decisions―is typically" +
                " taught as a math-based field, where data and formulas tell us exactly what to do. But in the real world people don’t make financial " +
                "decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your own unique view of the world, " +
                "ego, pride, marketing, and odd incentives are scrambled together.\n" + "\n" + "In The Psychology of Money, award-winning author Morgan " +
                "Housel shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life’s " +
                "most important topics.");
    }
}
