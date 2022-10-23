public class SQLClasses {
    public static final String OLDER_AGE = """
            SELECT * FROM user WHERE age <= 18;
             """;
    public static final String ST_LATTER_NAME = """
            SELECT * FROM user WHERE first_name LIKE '%o';
             """;
    public static final String BETWEEN_AGE = """
            SELECT * FROM user WHERE age BETWEEN 18 AND 60;
                             
            """;
    public static final String COUNT_USER_CONTAIN_LATTER = """
            SELECT count(*) AS COUNT FROM USER WHERE first_name LIKE '%a%';
            """;
    public static final String COUNT_USER_YOUNGER_AGE = """
            SELECT count(*) AS COUNT FROM USER WHERE age >=18;
            """;

    public SQLClasses() {
    }
}
