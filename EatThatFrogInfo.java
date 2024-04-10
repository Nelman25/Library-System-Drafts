import javax.swing.*;
import java.awt.*;

public class EatThatFrogInfo {

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

    Books eatThatFrogInfo = new Books("Eat That Frog","Brian Tracy","113","Berrett-Koehler Publishers","2002","English");
    ImageIcon eatThatFrogImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EatThatFrogCover.jpg");

    EatThatFrogInfo() {
        frame = new JFrame();
        frame.setTitle("Eat That Frog by Brian Tracy");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(eatThatFrogImg);

        Title = new JLabel();
        Title.setText(eatThatFrogInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(eatThatFrogInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(eatThatFrogInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(eatThatFrogInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(eatThatFrogInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(eatThatFrogInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("             I learned few new things from this book. Most important thing to remeber is that every" +
                " day first you have to do the most important obligations that day.And this is true. We do the easiest things first and " +
                "hardest leave for latter, and this is wrong.We have to deal with important obligations first and less important we can do" +
                " if we have time.Everything you have to do following day, write on paper and rank them by importance and consequence (must be " +
                "done or you can postpone it).At the end of the book writter is starting to repeating things (on 100 small pages).Also writter is " +
                "focused just on time managment so in one part of the book he wrote that we don'tloose time on talking with our colleagues, but we have " +
                "to focused on our obligations. Hardcore time managment without social interaction.This was the first book about Time Managment which I read, " +
                "and I think it is a good start point.Greetings from Croatia");
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
