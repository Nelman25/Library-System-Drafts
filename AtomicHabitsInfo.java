import javax.swing.*;
import java.awt.*;

public class AtomicHabitsInfo {

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

    Books atomicHabitsInfo = new Books("Atomic Habits","James Clear","320","Penguin Publishing Group;Avery","2018","English");
    ImageIcon AtomicHabits = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AtomicHabits.jpg");


    AtomicHabitsInfo() {
        frame = new JFrame();
        frame.setTitle("Atomic Habit by James Clear");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950,780);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        bookCover = new JLabel();
        bookCover.setBounds(20,85,350,500);
        bookCover.setIcon(AtomicHabits);

        Title = new JLabel();
        Title.setText(atomicHabitsInfo.getTitle());
        Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

        Author = new JLabel();
        Author.setText(atomicHabitsInfo.getAuthor());
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Publisher = new JLabel();
        Publisher.setText(atomicHabitsInfo.getPublisher());
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        NumberOfPages = new JLabel();
        NumberOfPages.setText(atomicHabitsInfo.getNumberOfPages());
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        YearPublished = new JLabel();
        YearPublished.setText(atomicHabitsInfo.getYearPublished());
        YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        Language = new JLabel();
        Language.setText(atomicHabitsInfo.getLanguage());
        Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

        overview = new JTextArea();
        overview.setSize(450,500);
        overview.setText("             Tiny Changes, Remarkable Results No matter your goals, Atomic Habits offers a proven framework " +
                "for improving'every day. James Clear, one of the world's leading experts on habit formation, reveals pra" +
                "ctical strategies that will teach you exactly how to form good habits, break bad ones, and master the tiny " +
                "behaviors that lead to remarkable results. If you're having trouble changing your habits, the problem isn't " +
                "you. The problem is your system. Bad habits repeat themselves again and again not because you don't want to " +
                "change, but because you have the wrong system for change. You do not rise to the level of your goals. You fall" +
                " to the level of your systems. Here, you'll get a proven system that can take you to new heights. Clear is" +
                " known for his ability to distill complex topics into simple behaviors that can be easily applied to daily" +
                " life and work. Here, he draws on the most proven ideas from biology, psychology, and neuroscience to create" +
                "an easy-to-understand guide for making good habits");
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
