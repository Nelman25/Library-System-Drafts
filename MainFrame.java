import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainFrame implements MouseListener, ActionListener {

    JFrame frame = new JFrame();

    JPanel yellowHeader = new JPanel();
    JPanel blueHeader = new JPanel();
    JPanel booksContainer = new JPanel();
    JPanel searchArea = new JPanel();

    JLabel AtomicHabits = new JLabel();
    JLabel EgoIsTheEnemy = new JLabel();
    JLabel StillnessIsTheKey = new JLabel();
    JLabel SubtleArt = new JLabel();
    JLabel ArtOfWar = new JLabel();
    JLabel EatThatFrog = new JLabel();
    JLabel DanteInferno = new JLabel();
    JLabel PsychMoney = new JLabel();
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    JTextField searchBar = new JTextField();
    JButton search = new JButton("Search");

    ImageIcon NuLogo = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\NULogoResized.png");
    ImageIcon atomicHabitsImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon EgoIsTheEnemyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon StillnessIsTheKeyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon SubtleArtImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon ArtOfWarImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon EatThatFrogImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon DanteInfernoImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");
    ImageIcon PsychMoneyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\red (1).jpg");


    MainFrame() {
        frame.setTitle("National University Library System");
        frame.setSize(900, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(235,237,237));
        frame.setResizable(false);

        frame.setLayout(null);

        yellowHeader.setBounds(0,0,900,80);
        yellowHeader.setBackground(new Color(255,219,38));
        yellowHeader.setLayout(null);

        blueHeader.setBounds(0,80,900,10);
        blueHeader.setBackground(new Color(11,67,135));
        blueHeader.setLayout(null);

        label.setText("Public Library System");
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        label.setForeground(new Color(49, 73, 153));
        label.setIconTextGap(53);
        label.setBounds(15,10,600,60);
        label.setIcon(NuLogo);

        label2.setText("Education that works.");
        label2.setFont(new Font("Helvetica",Font.BOLD,17));
        label2.setForeground(new Color(49, 73, 153));
        label2.setBounds(660,26,250,30);

        searchArea.setLayout(new FlowLayout());
        searchArea.setBounds(10,100,865,50);

        searchBar.setPreferredSize(new Dimension(300,28));

        search.setSize(100,19);
        search.setFocusable(false);
        search.addActionListener(this);

        booksContainer.setLayout(new GridLayout(2,4,10,10));
        booksContainer.setBounds(10, 160,865,790);

        AtomicHabits.setText("Atomic Habits");
        AtomicHabits.setFont(new Font("Arial",Font.PLAIN,19));
        AtomicHabits.setHorizontalTextPosition(JLabel.CENTER);
        AtomicHabits.setVerticalTextPosition(JLabel.BOTTOM);
        AtomicHabits.setIcon(atomicHabitsImg);

        EgoIsTheEnemy.setText("Ego is The Enemy");
        EgoIsTheEnemy.setFont(new Font("Arial",Font.PLAIN,19));
        EgoIsTheEnemy.setHorizontalTextPosition(JLabel.CENTER);
        EgoIsTheEnemy.setVerticalTextPosition(JLabel.BOTTOM);
        EgoIsTheEnemy.setIcon(EgoIsTheEnemyImg);

        StillnessIsTheKey.setText("Ego is The Enemy");
        StillnessIsTheKey.setFont(new Font("Arial",Font.PLAIN,19));
        StillnessIsTheKey.setHorizontalTextPosition(JLabel.CENTER);
        StillnessIsTheKey.setVerticalTextPosition(JLabel.BOTTOM);
        StillnessIsTheKey.setIcon(StillnessIsTheKeyImg);

        SubtleArt.setText("Ego is The Enemy");
        SubtleArt.setFont(new Font("Arial",Font.PLAIN,19));
        SubtleArt.setHorizontalTextPosition(JLabel.CENTER);
        SubtleArt.setVerticalTextPosition(JLabel.BOTTOM);
        SubtleArt.setIcon(SubtleArtImg);

        ArtOfWar.setText("Ego is The Enemy");
        ArtOfWar.setFont(new Font("Arial",Font.PLAIN,19));
        ArtOfWar.setHorizontalTextPosition(JLabel.CENTER);
        ArtOfWar.setVerticalTextPosition(JLabel.BOTTOM);
        ArtOfWar.setIcon(ArtOfWarImg);

        EatThatFrog.setText("Ego is The Enemy");
        EatThatFrog.setFont(new Font("Arial",Font.PLAIN,19));
        EatThatFrog.setHorizontalTextPosition(JLabel.CENTER);
        EatThatFrog.setVerticalTextPosition(JLabel.BOTTOM);
        EatThatFrog.setIcon(EatThatFrogImg);

        DanteInferno.setText("Ego is The Enemy");
        DanteInferno.setFont(new Font("Arial",Font.PLAIN,19));
        DanteInferno.setHorizontalTextPosition(JLabel.CENTER);
        DanteInferno.setVerticalTextPosition(JLabel.BOTTOM);
        DanteInferno.setIcon(DanteInfernoImg);

        PsychMoney.setText("Ego is The Enemy");
        PsychMoney.setFont(new Font("Arial",Font.PLAIN,19));
        PsychMoney.setHorizontalTextPosition(JLabel.CENTER);
        PsychMoney.setVerticalTextPosition(JLabel.BOTTOM);
        PsychMoney.setIcon(PsychMoneyImg);

        AtomicHabits.addMouseListener(this);
        EgoIsTheEnemy.addMouseListener(this);
        StillnessIsTheKey.addMouseListener(this);
        SubtleArt.addMouseListener(this);
        ArtOfWar.addMouseListener(this);
        EatThatFrog.addMouseListener(this);
        DanteInferno.addMouseListener(this);
        PsychMoney.addMouseListener(this);

        yellowHeader.add(label);
        yellowHeader.add(label2);
        searchArea.add(searchBar);
        searchArea.add(search);
        frame.add(yellowHeader);
        frame.add(blueHeader);
        booksContainer.add(AtomicHabits);
        booksContainer.add(EgoIsTheEnemy);
        booksContainer.add(StillnessIsTheKey);
        booksContainer.add(SubtleArt);
        booksContainer.add(ArtOfWar);
        booksContainer.add(EatThatFrog);
        booksContainer.add(DanteInferno);
        booksContainer.add(PsychMoney);

        frame.add(booksContainer);
        frame.add(searchArea);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BookInfo bookInfo = new BookInfo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        BookInfo book = new BookInfo();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
