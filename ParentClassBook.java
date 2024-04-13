import javax.swing.*;
import java.awt.*;

public class ParentClassBook {

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

    ParentClassBook() {
            frame = new JFrame();
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(950,780);
            frame.getContentPane().setBackground(Color.white);
            frame.setLayout(null);

            bookCover = new JLabel();
            bookCover.setBounds(20,85,350,500);

            Title = new JLabel();
            Title.setFont(new Font("Times New Roman", Font.BOLD, 28));

            Author = new JLabel();
            Author.setFont(new Font("Times New Roman", Font.ITALIC, 20));

            Publisher = new JLabel();
            Publisher.setFont(new Font("Times New Roman", Font.ITALIC, 20));

            NumberOfPages = new JLabel();
            NumberOfPages.setFont(new Font("Times New Roman", Font.ITALIC, 20));

            YearPublished = new JLabel();
            YearPublished.setFont(new Font("Times New Roman", Font.ITALIC, 20));

            Language = new JLabel();
            Language.setFont(new Font("Times New Roman", Font.ITALIC, 20));

            overview = new JTextArea();
            overview.setSize(450,500);
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

