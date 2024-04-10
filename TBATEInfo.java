import javax.swing.*;
import java.awt.*;

public class TBATEInfo {
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

    Books TBATEInfo = new Books("The Beginning After The End","TurtleMe","Ongoing","null","null","English");
    ImageIcon authorPovIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\TBATECover.jpg");

    TBATEInfo() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("The Beginning After The End by TurtleMe");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(authorPovIcon);

        Title = new JLabel();
        Title.setText(TBATEInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(TBATEInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(TBATEInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(TBATEInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(TBATEInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(TBATEInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("King Grey is a remarkable ruler with a prosperous reign, and yet…opulence and success cannot bury emptiness and solitude.\r\n"
                + "\r\n"
                + " His time as king, however, comes to an abrupt end, and he reincarnates as Arthur Leywin―a baby born in a world of magic and monsters.\r\n"
                + "\r\n"
                + "Equipped with memories of his previous life and the desire to protect the newfound warmth surrounding him, Art begins his journey of becoming a strong warrior once again. Sword training, mana coreformation, magic studies\r\n"
                + "\r\n"
                + "―Art does it all in order to be as powerful as can be! But will it be enough to repel the dangerous forces that threaten his second chance at life…? \r\n"
                + ""

        );
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
        bookInfoPanel.setBounds(435,25,450,200);

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