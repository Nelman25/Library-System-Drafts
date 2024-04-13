import javax.swing.*;

public class AtomicHabitsInfo extends ParentClassBook {

    Books atomicHabitsInfo = new Books("Atomic Habits","James Clear","320","Penguin Publishing Group;Avery","2018","English");
    ImageIcon AtomicHabits = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AtomicHabits.jpg");

    AtomicHabitsInfo() {
        frame.setTitle("Atomic Habit by James Clear");
        bookCover.setIcon(AtomicHabits);
        Title.setText(atomicHabitsInfo.getTitle());
        Author.setText(atomicHabitsInfo.getAuthor());
        Publisher.setText(atomicHabitsInfo.getPublisher());
        NumberOfPages.setText(atomicHabitsInfo.getNumberOfPages());
        YearPublished.setText(atomicHabitsInfo.getYearPublished());
        Language.setText(atomicHabitsInfo.getLanguage());
        overview.setText("             Tiny Changes, Remarkable Results No matter your goals, Atomic Habits offers a proven framework " +
                "for improving'every day. James Clear, one of the world's leading experts on habit formation, reveals pra" +
                "ctical strategies that will teach you exactly how to form good habits, break bad ones, and master the tiny " +
                "behaviors that lead to remarkable results. If you're having trouble changing your habits, the problem isn't " +
                "you. The problem is your system. Bad habits repeat themselves again and again not because you don't want to " +
                "change, but because you have the wrong system for change. You do not rise to the level of your goals. You fall" +
                " to the level of your systems. Here, you'll get a proven system that can take you to new heights. Clear is" +
                " known for his ability to distill complex topics into simple behaviors that can be easily applied to daily" +
                " life and work. Here, he draws on the most proven ideas from biology, psychology, and neuroscience to create" +
                "an easy-to-understand guide for making good habits");
    }
}
