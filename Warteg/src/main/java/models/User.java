/* Nama Kelompok                  :
 * Kezia Tabhita Smith              140810240020
 * Risyam Muhammad Iesqillah		140810240032
 * Laudzan Ananda Syawaliandi		140810240050
 * Dikumpulkan tanggal            : 7 Desember 2025
*/
package models;
public class User {

    private int idUser;
    private String username;
    private String password;
    private boolean isAdmin;

    public User() {}

    public User(int idUser, String username, String password, boolean isAdmin) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}

