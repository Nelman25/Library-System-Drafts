import javax.swing.*;

public class ArtOfWarInfo extends ParentClassBook {

    Books artOfWarInfo = new Books("Art of War","Sun Tzu","267","null","1905","English");
    ImageIcon artOfWarImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ArtOfWarCover.jpg");

    ArtOfWarInfo() {
        frame.setTitle("Art Of War by Sun Tzu");
        bookCover.setIcon(artOfWarImg);
        Title.setText(artOfWarInfo.getTitle());
        Author.setText(artOfWarInfo.getAuthor());
        Publisher.setText(artOfWarInfo.getPublisher());
        NumberOfPages.setText(artOfWarInfo.getNumberOfPages());
        YearPublished.setText(artOfWarInfo.getYearPublished());
        Language.setText(artOfWarInfo.getLanguage());
        overview.setText("             The Art of War is the Swiss army knife of military theory-pop out a different tool for any situation. " +
                "Folded into this small package are compact views on resourcefulness, momentum, cunning, the profit motive, flexibility, integrity, " +
                "secrecy, speed, positioning, surprise, deception, manipulation, responsibility, and practicality. Thomas Cleary's translation keeps the " +
                "package tight, with crisp language and short sections. Commentaries from the Chinese tradition trail Sun-tzu's words, elaborating and picking " +
                "up on puzzling lines. Take the solitary passage: 'Do not eat food for their soldiers.' Elsewhere, Sun-tzu has told us to plunder the enemy's stores, " +
                "but now we're not supposed to eat the food? The Tang dynasty commentator Du Mu solves the puzzle nicely, 'If the enemy suddenly abandons their food" +
                " supplies, they should be tested first before eating, lest they be poisoned.' Most passages, however, are the pinnacle of succinct clarity: 'Lure " +
                "them in with the prospect of gain, take them");

    }
}
