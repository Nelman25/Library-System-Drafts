import javax.swing.*;

public class TBATEInfo extends ParentClassBook {

    Books TBATEInfo = new Books("The Beginning After The End","TurtleMe","Ongoing","null","null","English");
    ImageIcon authorPovIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\TBATECover.jpg");

    TBATEInfo() {
        frame.setTitle("The Beginning After The End by TurtleMe");
        bookCover.setIcon(authorPovIcon);
        Title.setText(TBATEInfo.getTitle());
        Author.setText(TBATEInfo.getAuthor());
        Publisher.setText(TBATEInfo.getPublisher());
        NumberOfPages.setText(TBATEInfo.getNumberOfPages());
        YearPublished.setText(TBATEInfo.getYearPublished());
        Language.setText(TBATEInfo.getLanguage());
        overview.setText("King Grey is a remarkable ruler with a prosperous reign, and yet…opulence and success cannot bury emptiness and solitude.\r\n"
                + "\r\n"
                + " His time as king, however, comes to an abrupt end, and he reincarnates as Arthur Leywin―a baby born in a world of magic and monsters.\r\n"
                + "\r\n"
                + "Equipped with memories of his previous life and the desire to protect the newfound warmth surrounding him, Art begins his journey of becoming a strong warrior once again. Sword training, mana coreformation, magic studies\r\n"
                + "\r\n"
                + "―Art does it all in order to be as powerful as can be! But will it be enough to repel the dangerous forces that threaten his second chance at life…? \r\n"
                + ""
        );
    }
}