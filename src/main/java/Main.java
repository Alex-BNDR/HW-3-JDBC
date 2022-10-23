public class Main {
    public static void main(String[] args) {

        UserSelect userSelect = new UserSelect();
        UserCount userCount = new UserCount();

        System.out.println("Younger than 18:");
        userSelect.select(SQLClasses.OLDER_AGE);

        System.out.println("Name ends on (o):");
        userSelect.select(SQLClasses.ST_LATTER_NAME);

        System.out.println("Age between 18 and 60:");
        userSelect.select(SQLClasses.BETWEEN_AGE);

        System.out.println("Number of users with 'a' in name:");
        userCount.count(SQLClasses.COUNT_USER_CONTAIN_LATTER);

        System.out.println("Number of adults:");
        userCount.count(SQLClasses.COUNT_USER_YOUNGER_AGE);
    }
}
