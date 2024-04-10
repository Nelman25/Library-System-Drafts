import javax.swing.*;
import java.awt.*;

public class AuthorPOVInfo {

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

    Books authorsPovInfo = new Books("The Author's POV","Entrail_Ji","864 Chapters","null","null","English");
    ImageIcon authorPovIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AuthorsPOVCover.jpg");

    AuthorPOVInfo() {
        frame = new JFrame();
        frame.setTitle("The Author's POV by Entrail_Ji");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(authorPovIcon);

        Title = new JLabel();
        Title.setText(authorsPovInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(authorsPovInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(authorsPovInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(authorsPovInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(authorsPovInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(authorsPovInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("\"A protagonist is a person whom the world revolves around, someone who defeats all of his opponents,"
                + " and ultimately gets the beautiful girl. The sole existence all villains fear.\"\r\n"
                + "\r\n"
                + "What about me?\r\n"
                + "\r\n"
                + "I'm a failed author who had only one success throughout his whole career, and reincarnated into my late novel as a mob character."
                + " Even in this life, the world didn't revolve around me. The girls don’t come flocking towards me.\r\n"
                + "\r\n"
                + "As i was rejoicing the fact that I didn't reincarnate as a protagonist because they are calamity mangnets, I didn't know I would later come to regret these words… \r\n"

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