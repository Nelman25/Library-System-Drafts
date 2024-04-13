import javax.swing.*;

public class ORVInfo extends ParentClassBook{

    Books ORVInfo = new Books("Omniscient Reader's Viewpoint","Sing Shong","513 Chapters","null","null","English");
    ImageIcon authorPovIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ORVcover.jpg");

    ORVInfo() {
        frame.setTitle("Omniscient Reader's Viewpoint by Sing Shong");
        bookCover.setIcon(authorPovIcon);
        Title.setText(ORVInfo.getTitle());
        Author.setText(ORVInfo.getAuthor());
        Publisher.setText(ORVInfo.getPublisher());
        NumberOfPages.setText(ORVInfo.getNumberOfPages());
        YearPublished.setText(ORVInfo.getYearPublished());
        Language.setText(ORVInfo.getLanguage());
        overview.setText("He is an average office worker who has a passion for reading, his favorite web novel being \"Three Ways to Survive in a Ruined World\". \r\n"
                + "\r\n"
                + "However, his life takes a drastic turn when the events of the novel start unfolding in real life, and he is the only one who is aware of how the world will come to an end. "

        );
    }
}
