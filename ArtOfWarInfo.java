import javax.swing.*;
import java.awt.*;

public class ArtOfWarInfo {

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

    Books artOfWarInfo = new Books("Art of War","Sun Tzu","267","null","1905","English");
    ImageIcon artOfWarImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ArtOfWarCover.jpg");


    ArtOfWarInfo() {
        frame = new JFrame();
        frame.setTitle("Art Of War by Sun Tzu");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(artOfWarImg);

        Title = new JLabel();
        Title.setText(artOfWarInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(artOfWarInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(artOfWarInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(artOfWarInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(artOfWarInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(artOfWarInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("             The Art of War is the Swiss army knife of military theory-pop out a different tool for any situation. " +
                "Folded into this small package are compact views on resourcefulness, momentum, cunning, the profit motive, flexibility, integrity, " +
                "secrecy, speed, positioning, surprise, deception, manipulation, responsibility, and practicality. Thomas Cleary's translation keeps the " +
                "package tight, with crisp language and short sections. Commentaries from the Chinese tradition trail Sun-tzu's words, elaborating and picking " +
                "up on puzzling lines. Take the solitary passage: 'Do not eat food for their soldiers.' Elsewhere, Sun-tzu has told us to plunder the enemy's stores, " +
                "but now we're not supposed to eat the food? The Tang dynasty commentator Du Mu solves the puzzle nicely, 'If the enemy suddenly abandons their food" +
                " supplies, they should be tested first before eating, lest they be poisoned.' Most passages, however, are the pinnacle of succinct clarity: 'Lure " +
                "them in with the prospect of gain, take them");
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
