import javax.swing.*;

public class EatThatFrogInfo extends ParentClassBook{

    Books eatThatFrogInfo = new Books("Eat That Frog","Brian Tracy","113","Berrett-Koehler Publishers","2002","English");
    ImageIcon eatThatFrogImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EatThatFrogCover.jpg");

    EatThatFrogInfo() {
        frame.setTitle("Eat That Frog by Brian Tracy");
        bookCover.setIcon(eatThatFrogImg);
        Title.setText(eatThatFrogInfo.getTitle());
        Author.setText(eatThatFrogInfo.getAuthor());
        Publisher.setText(eatThatFrogInfo.getPublisher());
        NumberOfPages.setText(eatThatFrogInfo.getNumberOfPages());
        YearPublished.setText(eatThatFrogInfo.getYearPublished());
        Language.setText(eatThatFrogInfo.getLanguage());
        overview.setText("             I learned few new things from this book. Most important thing to remeber is that every" +
                " day first you have to do the most important obligations that day.And this is true. We do the easiest things first and " +
                "hardest leave for latter, and this is wrong.We have to deal with important obligations first and less important we can do" +
                " if we have time.Everything you have to do following day, write on paper and rank them by importance and consequence (must be " +
                "done or you can postpone it).At the end of the book writter is starting to repeating things (on 100 small pages).Also writter is " +
                "focused just on time managment so in one part of the book he wrote that we don'tloose time on talking with our colleagues, but we have " +
                "to focused on our obligations. Hardcore time managment without social interaction.This was the first book about Time Managment which I read, " +
                "and I think it is a good start point.Greetings from Croatia");
    }
}
