import javax.swing.*;
import java.awt.*;

public class StillnessIsTheKeyInfo {

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

    Books stillnessIsTheKeyInfo = new Books("Stillness is the Key","Ryan Holiday","288","Portfolio","2019","English");
    ImageIcon stillnessImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\StillnessIsTheKeyCover.jpg");

    StillnessIsTheKeyInfo() {
        frame = new JFrame();
        frame.setTitle("Stillness is the key by Ryan Holiday");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(stillnessImg);

        Title = new JLabel();
        Title.setText(stillnessIsTheKeyInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(stillnessIsTheKeyInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(stillnessIsTheKeyInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(stillnessIsTheKeyInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(stillnessIsTheKeyInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(stillnessIsTheKeyInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("             In The Obstacle Is the Way and Ego Is the Enemy , bestselling author Ryan Holiday made ancient " +
                "wisdom wildly popular with a new generation of leaders in sports, politics, and technology. In his new book, Stillness " +
                "Is the Key , Holiday draws on timeless Stoic and Buddhist philosophy to show why slowing down is the secret weapon for " +
                "those charging ahead.\n" + "All great leaders, thinkers, artists, athletes, and visionaries share one indelible quality. " +
                "It enables them to conquer their tempers. To avoid distraction and discover great insights. To achieve happiness and do the " +
                "right thing. Ryan Holiday calls it stillness--to be steady while the world spins around you.\n" + "In this book, he outlines" +
                " a path for achieving this ancient, but urgently necessary way of living. Drawing on a wide range of history's greatest thinkers, " +
                "from Confucius to Seneca, Marcus Aurelius to Thich Nhat Hanh, John Stuart Mill to Nietzsche, he argues that stillness is not mere inactivity");
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
