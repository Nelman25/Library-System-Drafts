import javax.swing.*;

public class SubtleArtInfo extends ParentClassBook {

    Books subtleArtInfo = new Books("The Subtle Art of Not Giving a F*ck","Mark Manson","285","HarperCollins","2016","English");
    ImageIcon subtleArtImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\subtleCover (1).jpg");

    SubtleArtInfo() {
        frame.setTitle("The Subtle Art of Not Giving a F*ck by Mark Manson");
        bookCover.setIcon(subtleArtImg);
        Title.setText(subtleArtInfo.getTitle());
        Author.setText(subtleArtInfo.getAuthor());
        Publisher.setText(subtleArtInfo.getPublisher());
        NumberOfPages.setText(subtleArtInfo.getNumberOfPages());
        YearPublished.setText(subtleArtInfo.getYearPublished());
        Language.setText(subtleArtInfo.getLanguage());
        overview.setText("             In this generation-defining self-help guide, a superstar blogger cuts through the crap to " +
                "show us how to stop trying to be \"positive\" all the time so that we can truly become better, happier people.\n" +
                "For decades, we've been told that positive thinking is the key to a happy, rich life. \"F**k positivity,\" Mark Manson " +
                "says. \"Let's be honest, shit is f**ked and we have to live with it.\" In his wildly popular Internet blog, Mason doesn't " +
                "sugarcoat or equivocate. He tells it like it is—a dose of raw, refreshing, honest truth that is sorely lacking today. " +
                "The Subtle Art of Not Giving a F**k is his antidote to the coddling, let's-all-feel-good mindset that has infected American " +
                "society and spoiled a generation, rewarding them with gold medals just for showing up.\n" + "Manson makes the argument, backed " +
                "both by academic research and well-timed poop jokes, that improving our lives hinges not on our ability to turn lemons into lemonade, " +
                "but on learning to stomach lemons...");
    }
}
