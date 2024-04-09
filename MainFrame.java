import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {

    JFrame frame = new JFrame();

    JPanel yellowHeader = new JPanel();
    JPanel blueHeader = new JPanel();
    JPanel blueHeader2 = new JPanel();
    JPanel booksContainer = new JPanel();
    JPanel searchArea = new JPanel();

    JButton AtomicHabits = new JButton();
    JButton EgoIsTheEnemy = new JButton();
    JButton StillnessIsTheKey = new JButton();
    JButton SubtleArt = new JButton();
    JButton ArtOfWar = new JButton();
    JButton EatThatFrog = new JButton();
    JButton AuthorPOV = new JButton();
    JButton PsychMoney = new JButton();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    ImageIcon NuLogo = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\NULogoResized.png");
    ImageIcon atomicHabitsImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Pictures\\AtomicHabits (1).jpg");
    ImageIcon EgoIsTheEnemyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ego-is-the-enemy_3.jpg");
    ImageIcon StillnessIsTheKeyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EgoIsTheEnemy.jpg");
    ImageIcon SubtleArtImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\the-subtle-art-of-not-giving-a-f-ck.jpg");
    ImageIcon ArtOfWarImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\the-art-of-war-74.jpg");
    ImageIcon EatThatFrogImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EatThatFrog.jpg");
    ImageIcon PsychMoneyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Pictures\\AtomicHabits (1).jpg");
    ImageIcon AuthorPOVImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AuthorPOV.jpg");

    MainFrame() {
        frame.setTitle("National University Library System");
        frame.setSize(1800, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(251,248,202));
        frame.setResizable(false);
        frame.setLayout(null);

        yellowHeader.setBounds(0,0,1800,100);
        yellowHeader.setBackground(new Color(213, 173, 54));
        yellowHeader.setLayout(null);

        blueHeader.setBounds(0,100,1800,15);
        blueHeader.setBackground(new Color(38, 89, 153));
        blueHeader.setLayout(null);

        blueHeader2.setBounds(0,940,1800,30);
        blueHeader2.setBackground(new Color(38, 89, 153));
        blueHeader2.setLayout(null);

        label.setText("Public Library System");
        label.setFont(new Font("Helvetica", Font.BOLD, 45));
        label.setForeground(new Color(38, 89, 153));
        label.setIconTextGap(400);
        label.setBounds(30,21,1500,60);
        label.setIcon(NuLogo);

        label2.setText("Education that works.");
        label2.setFont(new Font("Helvetica",Font.BOLD,17));
        label2.setForeground(new Color(38, 89, 153));
        label2.setBounds(1500,34,250,30);

        booksContainer.setLayout(new FlowLayout());
        booksContainer.setBounds(10, 160,1730,750);
        booksContainer.setBackground(new Color(244, 242, 201));

        AtomicHabits.setText("Atomic Habits");
        AtomicHabits.setBackground(new Color(244, 242, 201));
        AtomicHabits.setFocusable(false);
        AtomicHabits.setBorderPainted(false);
        AtomicHabits.setFont(new Font("Arial",Font.ITALIC,21));
        AtomicHabits.setHorizontalTextPosition(JLabel.CENTER);
        AtomicHabits.setVerticalTextPosition(JLabel.BOTTOM);
        AtomicHabits.setIcon(atomicHabitsImg);

        EgoIsTheEnemy.setText("Ego is The Enemy");
        EgoIsTheEnemy.setBackground(new Color(244, 242, 201));
        EgoIsTheEnemy.setFocusable(false);
        EgoIsTheEnemy.setBorderPainted(false);
        EgoIsTheEnemy.setFont(new Font("Arial",Font.ITALIC,21));
        EgoIsTheEnemy.setHorizontalTextPosition(JLabel.CENTER);
        EgoIsTheEnemy.setVerticalTextPosition(JLabel.BOTTOM);
        EgoIsTheEnemy.setIcon(EgoIsTheEnemyImg);

        StillnessIsTheKey.setText("Stillness Is The Key");
        StillnessIsTheKey.setBackground(new Color(244, 242, 201));
        StillnessIsTheKey.setFocusable(false);
        StillnessIsTheKey.setBorderPainted(false);
        StillnessIsTheKey.setFont(new Font("Arial",Font.ITALIC,21));
        StillnessIsTheKey.setHorizontalTextPosition(JLabel.CENTER);
        StillnessIsTheKey.setVerticalTextPosition(JLabel.BOTTOM);
        StillnessIsTheKey.setIcon(StillnessIsTheKeyImg);

        SubtleArt.setText("Subtle Art of Not Giving a F*ck");
        SubtleArt.setBackground(new Color(244, 242, 201));
        SubtleArt.setFocusable(false);
        SubtleArt.setBorderPainted(false);
        SubtleArt.setFont(new Font("Arial",Font.ITALIC,21));
        SubtleArt.setHorizontalTextPosition(JLabel.CENTER);
        SubtleArt.setVerticalTextPosition(JLabel.BOTTOM);
        SubtleArt.setIcon(SubtleArtImg);

        ArtOfWar.setText("Art of War");
        ArtOfWar.setBackground(new Color(244, 242, 201));
        ArtOfWar.setFocusable(false);
        ArtOfWar.setBorderPainted(false);
        ArtOfWar.setFont(new Font("Arial",Font.ITALIC,21));
        ArtOfWar.setHorizontalTextPosition(JLabel.CENTER);
        ArtOfWar.setVerticalTextPosition(JLabel.BOTTOM);
        ArtOfWar.setIcon(ArtOfWarImg);

        EatThatFrog.setText("Eat That Frog");
        EatThatFrog.setBackground(new Color(244, 242, 201));
        EatThatFrog.setFocusable(false);
        EatThatFrog.setBorderPainted(false);
        EatThatFrog.setFont(new Font("Arial",Font.ITALIC,21));
        EatThatFrog.setHorizontalTextPosition(JLabel.CENTER);
        EatThatFrog.setVerticalTextPosition(JLabel.BOTTOM);
        EatThatFrog.setIcon(EatThatFrogImg);

        AuthorPOV.setText("Author's POV");
        AuthorPOV.setBackground(new Color(244, 242, 201));
        AuthorPOV.setFocusable(false);
        AuthorPOV.setBorderPainted(false);
        AuthorPOV.setFont(new Font("Arial",Font.ITALIC,21));
        AuthorPOV.setHorizontalTextPosition(JLabel.CENTER);
        AuthorPOV.setVerticalTextPosition(JLabel.BOTTOM);
        AuthorPOV.setIcon(AuthorPOVImg);

        PsychMoney.setText("Psychology of Money");
        PsychMoney.setBackground(new Color(244, 242, 201));
        PsychMoney.setFocusable(false);
        PsychMoney.setBorderPainted(false);
        PsychMoney.setFont(new Font("Arial",Font.ITALIC,21));
        PsychMoney.setHorizontalTextPosition(JLabel.CENTER);
        PsychMoney.setVerticalTextPosition(JLabel.BOTTOM);
        PsychMoney.setIcon(PsychMoneyImg);

        AtomicHabits.addActionListener(this);
        EgoIsTheEnemy.addActionListener(this);
        StillnessIsTheKey.addActionListener(this);
        SubtleArt.addActionListener(this);
        ArtOfWar.addActionListener(this);
        EatThatFrog.addActionListener(this);
        AuthorPOV.addActionListener(this);
        PsychMoney.addActionListener(this);


        yellowHeader.add(label);
        yellowHeader.add(label2);
        frame.add(yellowHeader);
        frame.add(blueHeader);
        frame.add(blueHeader2);
        booksContainer.add(AtomicHabits);
        booksContainer.add(EgoIsTheEnemy);
        booksContainer.add(StillnessIsTheKey);
        booksContainer.add(SubtleArt);
        booksContainer.add(ArtOfWar);
        booksContainer.add(EatThatFrog);
        booksContainer.add(AuthorPOV);
        booksContainer.add(PsychMoney);

        frame.add(booksContainer);
        frame.add(searchArea);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==AtomicHabits) {
            AtomicHabitsInfo atomicHabitsInfo = new AtomicHabitsInfo();
        }
        else if(e.getSource()==EgoIsTheEnemy) {
            EgoIsTheEnemyInfo egoIsTheEnemyInfo = new EgoIsTheEnemyInfo();
        }
        else if(e.getSource()==StillnessIsTheKey) {
        }
        else if(e.getSource()==SubtleArt) {
        }
        else if(e.getSource()==ArtOfWar) {
        }
        else if(e.getSource()==EatThatFrog) {
        }
        else if(e.getSource()==AuthorPOV) {
        }
        else if(e.getSource()==PsychMoney) {
        }
    }
}
