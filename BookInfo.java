import javax.swing.*;
import java.awt.*;

public class BookInfo {
    JFrame frame;
    JLabel BookCoverPanel;
    JLabel Title;
    JLabel Author;
    JLabel Publisher;
    JLabel NumberOfPages;
    JLabel YearPublished;
    JLabel Language;


    Books atomicHabits = new Books("Atomic Habits","James Clear",320,"Penguin Publishing Group;Avery",2018,"English");

    ImageIcon AtomicHabits = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AtomicHabits.jpg");

    BookInfo() {
        frame = new JFrame();
        frame.setTitle("Book Info");
        frame.setSize(1200,900);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(true);

        BookCoverPanel = new JLabel();
        BookCoverPanel.setLayout(new BorderLayout());
        BookCoverPanel.setBounds(0,0, 350,500);
        BookCoverPanel.setIcon(AtomicHabits);

        Title = new JLabel();
        Title.setText("Title: " + atomicHabits.getTitle());
        Title.setBounds(15,510,350,32);
        Title.setFont(new Font("Times New Roman", Font.BOLD, 32));

        Author = new JLabel();
        Author.setText("Author: " + atomicHabits.getAuthor());
        Author.setBounds(15,560,350,32);
        Author.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        Publisher = new JLabel();
        Publisher.setText("Author: " + atomicHabits.getAuthor());
        Publisher.setBounds(15,560,350,32);
        Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        NumberOfPages = new JLabel();
        NumberOfPages.setText("Number of Pages: " + atomicHabits.getNumberOfPages());
        NumberOfPages.setBounds(15,610,350,32);
        NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        frame.add(BookCoverPanel);
        frame.add(Title);
        frame.add(Author);
        frame.add(NumberOfPages);

        frame.setVisible(true);
    }
}
