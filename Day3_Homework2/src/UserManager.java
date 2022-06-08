public class UserManager {
    public void login(User user) {
        System.out.println("Kullanici giris yapti : " + user.getFirstName() + " " + user.getLastName());
    }

    public void update(User user) {
        System.out.println("Kullanici guncellendi.");
    }
}
