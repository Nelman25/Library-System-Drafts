import javax.swing.*;
import java.awt.*;

public class PsychMoneyInfo {

    JFrame frame;
    JPanel bookInfoPanel;
    JPanel overviewPanel;
    JLabel bookCover;
    JLabel Title;
    JLabel Author;
    JLabel Publisher;
    JLabel NumberOfPages;
    JLabel YearPublished;
    JLabel Language;
    JTextArea overview;

    Books psychoMoneyInfo = new Books("Psychology of Money","Morgan Housel","316","Jaico Publishing House","2020","English");
    ImageIcon psychMoneyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\PsychMoneyCover.jpg");

    PsychMoneyInfo() {
        frame = new JFrame();
        frame.setTitle("Psychology of Money by Morgan Housel");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(950,780);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(psychMoneyImg);

        Title = new JLabel();
        Title.setText(psychoMoneyInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(psychoMoneyInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(psychoMoneyInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(psychoMoneyInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(psychoMoneyInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(psychoMoneyInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("             Doing well with money isn’t necessarily about what you know. It’s about how you behave. And behavior " +
                "is hard to teach, even to really smart people.\n" + "\n" + "Money―investing, personal finance, and business decisions―is typically" +
                " taught as a math-based field, where data and formulas tell us exactly what to do. But in the real world people don’t make financial " +
                "decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your own unique view of the world, " +
                "ego, pride, marketing, and odd incentives are scrambled together.\n" + "\n" + "In The Psychology of Money, award-winning author Morgan " +
                "Housel shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life’s " +
                "most important topics.");
        overview.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        overview.setEditable(false);
        overview.setLineWrap(true);

        overviewPanel = new JPanel();
        overviewPanel.setLayout(new FlowLayout());
        overviewPanel.setBackground(Color.white);
        overviewPanel.setBounds(400,230,500,500);

        bookInfoPanel = new JPanel();
        bookInfoPanel.setOpaque(true);
        bookInfoPanel.setLayout(new FlowLayout());
        bookInfoPanel.setBackground(Color.white);
        bookInfoPanel.setBounds(435,25,400,200);

        bookInfoPanel.add(Title);
        bookInfoPanel.add(Author);
        bookInfoPanel.add(Publisher);
        bookInfoPanel.add(NumberOfPages);
        bookInfoPanel.add(YearPublished);
        bookInfoPanel.add(Language);
        overviewPanel.add(overview);

        frame.add(bookInfoPanel);
        frame.add(bookCover);
        frame.add(overviewPanel);
        frame.setVisible(true);
    }
}
