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
    JTextField searchBar = new JTextField();
    JButton searchButton = new JButton("Search");
    JButton AtomicHabits = new JButton();
    JButton EgoIsTheEnemy = new JButton();
    JButton StillnessIsTheKey = new JButton();
    JButton SubtleArt = new JButton();
    JButton ArtOfWar = new JButton();
    JButton EatThatFrog = new JButton();
    JButton AuthorPOV = new JButton();
    JButton PsychMoney = new JButton();
    JButton TBATE = new JButton();
    JButton ORV = new JButton();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    ImageIcon NuLogo = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\NULogoResized.png");
    ImageIcon atomicHabitsImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Pictures\\AtomicHabits (1).jpg");
    ImageIcon EgoIsTheEnemyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ego-is-the-enemy_3.jpg");
    ImageIcon StillnessIsTheKeyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EgoIsTheEnemy.jpg");
    ImageIcon SubtleArtImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\the-subtle-art-of-not-giving-a-f-ck.jpg");
    ImageIcon ArtOfWarImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\the-art-of-war-74.jpg");
    ImageIcon EatThatFrogImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EatThatFrog.jpg");
    ImageIcon PsychMoneyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\PsychMoney.jpg");
    ImageIcon AuthorPOVImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AuthorPOV.jpg");
    ImageIcon TBATEImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\TBATE.jpg");
    ImageIcon ORVImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ORVImg.png");


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

        searchButton.setFocusable(false);
        searchArea.setBounds(0,115,1800,45);
        searchArea.setBackground(new Color(244, 242, 201));
        searchArea.setLayout(new FlowLayout());

        searchBar.setFont(new Font("Helvetica", Font.PLAIN,20));
        searchBar.setPreferredSize(new Dimension(400,35));

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

        TBATE.setText("The beginning after the end");
        TBATE.setBackground(new Color(244, 242, 201));
        TBATE.setFocusable(false);
        TBATE.setBorderPainted(false);
        TBATE.setFont(new Font("Arial",Font.ITALIC,21));
        TBATE.setHorizontalTextPosition(JLabel.CENTER);
        TBATE.setVerticalTextPosition(JLabel.BOTTOM);
        TBATE.setIcon(TBATEImg);

        ORV.setText("Omniscient reader's viewpoint");
        ORV.setBackground(new Color(244, 242, 201));
        ORV.setFocusable(false);
        ORV.setBorderPainted(false);
        ORV.setFont(new Font("Arial",Font.ITALIC,21));
        ORV.setHorizontalTextPosition(JLabel.CENTER);
        ORV.setVerticalTextPosition(JLabel.BOTTOM);
        ORV.setIcon(ORVImg);

        searchButton.addActionListener(this);
        AtomicHabits.addActionListener(this);
        EgoIsTheEnemy.addActionListener(this);
        StillnessIsTheKey.addActionListener(this);
        SubtleArt.addActionListener(this);
        ArtOfWar.addActionListener(this);
        EatThatFrog.addActionListener(this);
        AuthorPOV.addActionListener(this);
        PsychMoney.addActionListener(this);
        TBATE.addActionListener(this);
        ORV.addActionListener(this);

        searchArea.add(searchBar);
        searchArea.add(searchButton);
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
        booksContainer.add(TBATE);
        booksContainer.add(ORV);

        frame.add(booksContainer);
        frame.add(searchArea);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //search functions
        if(e.getSource() == searchButton) {
            if (searchBar.getText().equalsIgnoreCase("Atomic Habits")) {
                AtomicHabitsInfo info = new AtomicHabitsInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Ego is the enemy")) {
                EgoIsTheEnemyInfo info = new EgoIsTheEnemyInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Stillness is the key")) {
                StillnessIsTheKeyInfo info = new StillnessIsTheKeyInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Subtle art of not giving a f*ck")) {
                SubtleArtInfo info = new SubtleArtInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Art of War")) {
                ArtOfWarInfo info = new ArtOfWarInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Eat that frog")) {
                EatThatFrogInfo info = new EatThatFrogInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Psychology of Money")) {
                PsychMoneyInfo info = new PsychMoneyInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("The Beginning After The End")) {
                TBATEInfo info = new TBATEInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("Omniscient Reader's Viewpoint")) {
                ORVInfo info =  new ORVInfo();
            }
            else if (searchBar.getText().equalsIgnoreCase("The Author's POV")) {
                AuthorPOVInfo info = new AuthorPOVInfo();
            }
            else {
                JOptionPane.showMessageDialog(null, "No results found.");
            }
        }
        //button functions

        else if(e.getSource()==AtomicHabits) {
            AtomicHabitsInfo atomicHabitsInfo = new AtomicHabitsInfo();
        }
        else if(e.getSource()==EgoIsTheEnemy) {
            EgoIsTheEnemyInfo egoIsTheEnemyInfo = new EgoIsTheEnemyInfo();
        }
        else if(e.getSource()==StillnessIsTheKey) {
            StillnessIsTheKeyInfo stillnessIsTheKeyInfo = new StillnessIsTheKeyInfo();
        }
        else if(e.getSource()==SubtleArt) {
            SubtleArtInfo subtleArtInfo = new SubtleArtInfo();
        }
        else if(e.getSource()==ArtOfWar) {
            ArtOfWarInfo artOfWarInfo = new ArtOfWarInfo();
        }
        else if(e.getSource()==EatThatFrog) {
            EatThatFrogInfo eatThatFrogInfo = new EatThatFrogInfo();
        }
        else if(e.getSource()==PsychMoney) {
            PsychMoneyInfo psychMoneyInfo = new PsychMoneyInfo();
        }
        else if(e.getSource()==AuthorPOV) {
            AuthorPOVInfo authorPOVInfo = new AuthorPOVInfo();
        }
        else if(e.getSource()==TBATE) {
            TBATEInfo tbateInfo = new TBATEInfo();
        }
        else if(e.getSource()==ORV) {
            ORVInfo orvInfo = new ORVInfo();
        }
    }
}
