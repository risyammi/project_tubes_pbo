package GUI;

public class Session {
    private static Integer userId = null;
    private static String username = null;

    public static void setSession(Integer id, String user) {
        userId = id;
        username = user;
    }

    public static Integer getUserId() {
        return userId;
    }

    public static String getUsername() {
        return username;
    }

    public static boolean isLoggedIn() {
        return userId != null;
    }

    public static void destroy() {
        userId = null;
        username = null;
    }
}
