import javax.swing.*;

public class AuthorPOVInfo extends ParentClassBook {

    Books authorsPovInfo = new Books("The Author's POV","Entrail_Ji","864 Chapters","null","null","English");
    ImageIcon authorPovIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AuthorsPOVCover.jpg");

    AuthorPOVInfo() {
        frame.setTitle("The Author's POV by Entrail_Ji");
        bookCover.setIcon(authorPovIcon);
        Title.setText(authorsPovInfo.getTitle());
        Author.setText(authorsPovInfo.getAuthor());
        Publisher.setText(authorsPovInfo.getPublisher());
        NumberOfPages.setText(authorsPovInfo.getNumberOfPages());
        YearPublished.setText(authorsPovInfo.getYearPublished());
        Language.setText(authorsPovInfo.getLanguage());
        overview.setText("\"A protagonist is a person whom the world revolves around, someone who defeats all of his opponents,"
                + " and ultimately gets the beautiful girl. The sole existence all villains fear.\"\r\n"
                + "\r\n"
                + "What about me?\r\n"
                + "\r\n"
                + "I'm a failed author who had only one success throughout his whole career, and reincarnated into my late novel as a mob character."
                + " Even in this life, the world didn't revolve around me. The girls don’t come flocking towards me.\r\n"
                + "\r\n"
                + "As i was rejoicing the fact that I didn't reincarnate as a protagonist because they are calamity mangnets, I didn't know I would later come to regret these words… \r\n"
        );
    }
}