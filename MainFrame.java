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

    JButton[] buttons = new JButton[]{
            AtomicHabits, EgoIsTheEnemy, StillnessIsTheKey, SubtleArt, ArtOfWar, EatThatFrog, AuthorPOV,
            PsychMoney, TBATE, ORV
    };
    JButton searchButton = new JButton("Search");
    Color backgroundColor = new Color(244, 242, 201);
    boolean focusable = false;
    boolean borderPainted = false;
    Font font = new Font("Arial", Font.ITALIC, 21);
    int horizontalAlignment = JButton.CENTER;

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
        frame.getContentPane().setBackground(new Color(251, 248, 202));
        frame.setResizable(false);
        frame.setLayout(null);

        yellowHeader.setBounds(0, 0, 1800, 100);
        yellowHeader.setBackground(new Color(213, 173, 54));
        yellowHeader.setLayout(null);

        blueHeader.setBounds(0, 100, 1800, 15);
        blueHeader.setBackground(new Color(38, 89, 153));
        blueHeader.setLayout(null);

        blueHeader2.setBounds(0, 940, 1800, 30);
        blueHeader2.setBackground(new Color(38, 89, 153));
        blueHeader2.setLayout(null);

        label.setText("Public Library System");
        label.setFont(new Font("Helvetica", Font.BOLD, 45));
        label.setForeground(new Color(38, 89, 153));
        label.setIconTextGap(430);
        label.setBounds(30, 21, 1500, 60);
        label.setIcon(NuLogo);

        label2.setText("Education that works.");
        label2.setFont(new Font("Helvetica", Font.BOLD, 17));
        label2.setForeground(new Color(38, 89, 153));
        label2.setBounds(1500, 34, 250, 30);

        searchButton.setFocusable(false);
        searchArea.setBounds(0, 120, 1800, 45);
        searchArea.setBackground(new Color(244, 242, 201));
        searchArea.setLayout(new FlowLayout());

        searchBar.setFont(new Font("Helvetica", Font.PLAIN, 20));
        searchBar.setPreferredSize(new Dimension(400, 35));

        booksContainer.setLayout(new GridLayout(2, 4));
        booksContainer.setBounds(10, 160, 1730, 750);
        booksContainer.setBackground(new Color(244, 242, 201));

        for (JButton button : buttons) {
            button.setBackground(backgroundColor);
            button.setFocusable(focusable);
            button.setBorderPainted(borderPainted);
            button.setFont(font);
            button.setHorizontalAlignment(horizontalAlignment);
            button.setHorizontalTextPosition(JLabel.CENTER);
        }

        AtomicHabits.setText("Atomic Habits");
        AtomicHabits.setVerticalTextPosition(JLabel.BOTTOM);
        AtomicHabits.setIcon(atomicHabitsImg);

        EgoIsTheEnemy.setText("Ego is The Enemy");
        EgoIsTheEnemy.setVerticalTextPosition(JLabel.BOTTOM);
        EgoIsTheEnemy.setIcon(EgoIsTheEnemyImg);

        StillnessIsTheKey.setText("Stillness Is The Key");
        StillnessIsTheKey.setVerticalTextPosition(JLabel.BOTTOM);
        StillnessIsTheKey.setIcon(StillnessIsTheKeyImg);

        SubtleArt.setText("Subtle Art of Not Giving a F*ck");
        SubtleArt.setVerticalTextPosition(JLabel.BOTTOM);
        SubtleArt.setIcon(SubtleArtImg);

        ArtOfWar.setText("Art of War");
        ArtOfWar.setVerticalTextPosition(JLabel.BOTTOM);
        ArtOfWar.setIcon(ArtOfWarImg);

        EatThatFrog.setText("Eat That Frog");
        EatThatFrog.setVerticalTextPosition(JLabel.BOTTOM);
        EatThatFrog.setIcon(EatThatFrogImg);

        AuthorPOV.setText("Author's POV");
        AuthorPOV.setVerticalTextPosition(JLabel.BOTTOM);
        AuthorPOV.setIcon(AuthorPOVImg);

        PsychMoney.setText("Psychology of Money");
        PsychMoney.setVerticalTextPosition(JLabel.BOTTOM);
        PsychMoney.setIcon(PsychMoneyImg);

        TBATE.setText("The beginning after the end");
        TBATE.setVerticalTextPosition(JLabel.BOTTOM);
        TBATE.setIcon(TBATEImg);

        ORV.setText("Omniscient reader's viewpoint");
        ORV.setVerticalTextPosition(JLabel.BOTTOM);
        ORV.setIcon(ORVImg);

        searchButton.addActionListener(this);

        for (JButton button : buttons) {
            button.addActionListener(this);
            booksContainer.add(button);
        }

        searchArea.add(searchBar);
        searchArea.add(searchButton);
        yellowHeader.add(label);
        yellowHeader.add(label2);
        frame.add(yellowHeader);
        frame.add(blueHeader);
        frame.add(blueHeader2);

        frame.add(booksContainer);
        frame.add(searchArea);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //search functions
        if (e.getSource() == searchButton) {
            String searchText = searchBar.getText().toLowerCase();

            switch (searchText) {
                case "atomic habits":
                    AtomicHabitsInfo info = new AtomicHabitsInfo();
                    break;
                case "ego is the enemy":
                    EgoIsTheEnemyInfo info1 = new EgoIsTheEnemyInfo();
                    break;
                case "stillness is the key":
                    StillnessIsTheKeyInfo info2 = new StillnessIsTheKeyInfo();
                    break;
                case "subtle art of not giving a f*ck":
                    SubtleArtInfo info3 = new SubtleArtInfo();
                    break;
                case "art of War":
                    ArtOfWarInfo info4 = new ArtOfWarInfo();
                    break;
                case "eat that frog":
                    EatThatFrogInfo info5 = new EatThatFrogInfo();
                    break;
                case "psychology of money":
                    PsychMoneyInfo info6 = new PsychMoneyInfo();
                    break;
                case "the Beginning After The End":
                    TBATEInfo info7 = new TBATEInfo();
                    break;
                case "omniscient Reader's Viewpoint":
                    ORVInfo info8 = new ORVInfo();
                    break;
                case "author's POV":
                    AuthorPOVInfo info9 = new AuthorPOVInfo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No results found.");
            }
        }
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

