import javax.swing.*;
import java.awt.*;

public class ORVInfo {
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

    Books ORVInfo = new Books("Omniscient Reader's Viewpoint","Sing Shong","513 Chapters","null","null","English");
    ImageIcon authorPovIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ORVcover.jpg");


    ORVInfo() {
        frame = new JFrame();
        frame.setTitle("Omniscient Reader's Viewpoint by Sing Shong");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(950,780);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(authorPovIcon);

        Title = new JLabel();
        Title.setText(ORVInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(ORVInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(ORVInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(ORVInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(ORVInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(ORVInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("He is an average office worker who has a passion for reading, his favorite web novel being \"Three Ways to Survive in a Ruined World\". \r\n"
                + "\r\n"
                + "However, his life takes a drastic turn when the events of the novel start unfolding in real life, and he is the only one who is aware of how the world will come to an end. "

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
