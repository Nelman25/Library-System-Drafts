import javax.swing.*;

public class EgoIsTheEnemyInfo extends ParentClassBook {

    Books egoIsTheEnemyInfo = new Books("Ego Is The Enemy","Ryan Holiday","226","Profile Books","2016","English");
    ImageIcon EgoIsTheEnemy = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EgoIsTheEnemyResized.jpg");

    EgoIsTheEnemyInfo() {
        frame.setTitle("Ego is the Enemy by Ryan Holiday");
        bookCover.setIcon(EgoIsTheEnemy);
        Title.setText(egoIsTheEnemyInfo.getTitle());
        Author.setText(egoIsTheEnemyInfo.getAuthor());
        Publisher.setText(egoIsTheEnemyInfo.getPublisher());
        NumberOfPages.setText(egoIsTheEnemyInfo.getNumberOfPages());
        YearPublished.setText(egoIsTheEnemyInfo.getYearPublished());
        Language.setText(egoIsTheEnemyInfo.getLanguage());
        overview.setText("\"              While the history books are filled with tales of obsessive, visionary geniuses who remade the world in their image with sheer, " +
                "almost irrational force, I've found that history is also made by individuals who fought their egos at every turn, who eschewed the spotlight, " +
                "and who put their higher goals above their desire for recognition.\" – from the Prologue\n" + "\n" + "Many of us insist the main impediment to " +
                "a full, successful life is the outside world. In fact, the most common enemy lies within: our ego. Early in our careers, it impedes learning and the" +
                " cultivation of talent. With success, it can blind us to our faults and sow future problems. In failure, it magnifies each blow and makes recovery more " +
                "difficult. At every stage, ego holds us back.");
    }
}
