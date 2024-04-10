import javax.swing.*;
import java.awt.*;

public class SubtleArtInfo {

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

    Books subtleArtInfo = new Books("The Subtle Art of Not Giving a F*ck","Mark Manson","285","HarperCollins","2016","English");
    ImageIcon subtleArtImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\subtleCover (1).jpg");

    SubtleArtInfo() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("The Subtle Art of Not Giving a F*ck by Mark Manson");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(subtleArtImg);

        Title = new JLabel();
        Title.setText(subtleArtInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(subtleArtInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(subtleArtInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(subtleArtInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(subtleArtInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(subtleArtInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("             In this generation-defining self-help guide, a superstar blogger cuts through the crap to " +
                "show us how to stop trying to be \"positive\" all the time so that we can truly become better, happier people.\n" +
                "For decades, we've been told that positive thinking is the key to a happy, rich life. \"F**k positivity,\" Mark Manson " +
                "says. \"Let's be honest, shit is f**ked and we have to live with it.\" In his wildly popular Internet blog, Mason doesn't " +
                "sugarcoat or equivocate. He tells it like it is—a dose of raw, refreshing, honest truth that is sorely lacking today. " +
                "The Subtle Art of Not Giving a F**k is his antidote to the coddling, let's-all-feel-good mindset that has infected American " +
                "society and spoiled a generation, rewarding them with gold medals just for showing up.\n" + "Manson makes the argument, backed " +
                "both by academic research and well-timed poop jokes, that improving our lives hinges not on our ability to turn lemons into lemonade, " +
                "but on learning to stomach lemons...");
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
