import javax.swing.*;

public class StillnessIsTheKeyInfo extends ParentClassBook{

    Books stillnessIsTheKeyInfo = new Books("Stillness is the Key","Ryan Holiday","288","Portfolio","2019","English");
    ImageIcon stillnessImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\StillnessIsTheKeyCover.jpg");

    StillnessIsTheKeyInfo() {
        frame.setTitle("Stillness is the key by Ryan Holiday");
        bookCover.setIcon(stillnessImg);
        Title.setText(stillnessIsTheKeyInfo.getTitle());
        Author.setText(stillnessIsTheKeyInfo.getAuthor());
        Publisher.setText(stillnessIsTheKeyInfo.getPublisher());
        NumberOfPages.setText(stillnessIsTheKeyInfo.getNumberOfPages());
        YearPublished.setText(stillnessIsTheKeyInfo.getYearPublished());
        Language.setText(stillnessIsTheKeyInfo.getLanguage());
        overview.setText("             In The Obstacle Is the Way and Ego Is the Enemy , bestselling author Ryan Holiday made ancient " +
                "wisdom wildly popular with a new generation of leaders in sports, politics, and technology. In his new book, Stillness " +
                "Is the Key , Holiday draws on timeless Stoic and Buddhist philosophy to show why slowing down is the secret weapon for " +
                "those charging ahead.\n" + "All great leaders, thinkers, artists, athletes, and visionaries share one indelible quality. " +
                "It enables them to conquer their tempers. To avoid distraction and discover great insights. To achieve happiness and do the " +
                "right thing. Ryan Holiday calls it stillness--to be steady while the world spins around you.\n" + "In this book, he outlines" +
                " a path for achieving this ancient, but urgently necessary way of living. Drawing on a wide range of history's greatest thinkers, " +
                "from Confucius to Seneca, Marcus Aurelius to Thich Nhat Hanh, John Stuart Mill to Nietzsche, he argues that stillness is not mere inactivity");
    }
}
