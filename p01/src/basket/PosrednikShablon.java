//package basket;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PosrednikShablon {
//    public static void main(String[] args) {
//
//        TextChat chat = new TextChat();
//        Userr admin = new Admin(chat, "Иван Иваныч");
//        Userr u1 = new SimpleUser(chat, "Вася");
//        Userr u2 = new SimpleUser(chat, "Ваня");
//        Userr u3 = new SimpleUser(chat, "Валя");
//        Userr u4 = new SimpleUser(chat, "Ваган");
//        u2.setEnable(false);
//
//        chat.setAdmin(admin);
//        chat.addUser(u1);
//        chat.addUser(u2);
//        chat.addUser(u3);
//        chat.addUser(u4);
//
//        admin.sendMassage("Привет!");
////        u1.sendMassage("Привет!");
//    }
//}
//
////расширенная версия
//abstract class Userr{
//    Chat chat;
//    String name;
//    boolean isEnable = true;
//    public boolean isEnable(){return isEnable;}
//    public void setEnable(boolean isEnable){this.isEnable = isEnable;}
//    public Userr(Chat chat, String nane){this.chat = chat; this.name = nane;}
//    public String getName(){return name;}
//    public void sendMassage(String massage){chat.sendMassage(massage,this);}
//    abstract void getMassage(String massage);
//    @Override
//    public String toString() {
//        return "Userr{" + name + "}";
//    }
//
//}
//class Admin extends Userr{
//    public Admin(Chat chat, String name){super(chat,name);}
//
//    @Override
//    void getMassage(String massage) {
//        System.out.println("Администратор " + getName() + " получает сообщение '" + massage + "'");
//
//    }
//}
//class SimpleUser extends Userr{
//    public SimpleUser(Chat chat, String name){super(chat,name);}
//
//    @Override
//    void getMassage(String massage) {
//        System.out.println("Пользователь " + getName() + " получает сообщение '" + massage + "'");
//
//    }
//}
//interface Chat{
//    void sendMassage(String massage, Userr user);
//}
//class TextChat implements Chat {
//    Userr admin;
//    List<Userr> users = new ArrayList<>();
//
//    public void setAdmin(Userr admin) {
//        if (admin != null && admin instanceof Admin) {
//            this.admin = admin;
//        } else {
//            throw new RuntimeException("Не хватает прав.");
//
//        }
//    }
//
//    public void addUser(Userr u) {
//        if (admin == null) {
//            throw new RuntimeException("В чате нет Админа.");
//        }
//        if (u instanceof SimpleUser) {
//            users.add(u);
//        } else {
//            throw new RuntimeException("Админ не может входить в другой чат.");
//        }
//
//    }
//
//    public void sendMassage(String massage, Userr userr) {
//        if (userr instanceof Admin) {
//            for (Userr u : users) {
//                u.getMassage(userr.getName() + ": " + massage);
//            }
//        }
//        if (userr instanceof SimpleUser) {
//            for (Userr u : users) {
//                if (u != userr && u.isEnable())
//                    u.getMassage(userr.getName() + ": " + massage);
//            }
//            if (admin.isEnable())
//                admin.getMassage(userr.getName() + ": " + massage);
//        }
//    }
//}

    //Простая версия
//        TextChat chat = new TextChat();
//
//        Userr admin = new Admin(chat);
//        Userr u1 = new SimpleUser(chat);
//        Userr u2 = new SimpleUser(chat);
//
//        chat.setAdmin(admin);
//        chat.addUser(u1);
//        chat.addUser(u2);
//
//        u1.sendMassage("Привет, я пользователь.");
//        admin.sendMassage("Админ зашёл в чат!!!");

//interface Userr {
//    void sendMassage(String massage);
//    void getMassage(String massage);
//}
//class Admin implements Userr {
//    Chat chat;
//
//    public Admin(Chat chat) {
//        this.chat = chat;
//    }
//
//    public void sendMassage(String massage) {
//        chat.sendMassage(massage, this);
//    }
//
//    public void getMassage(String massage) {
//        System.out.println("Администратор получает сообщение '" + massage + "'");
//    }
//}
//class SimpleUser implements Userr{
//    Chat chat;
//    public SimpleUser(Chat chat) {this.chat = chat;}
//    public void sendMassage(String massage) {
//        chat.sendMassage(massage, this);
//    }
//    public void getMassage(String massage){
//        System.out.println("Пользователь получает сообщение '" + massage + "'");
//    }
//}
//interface Chat{
//    void sendMassage(String massage, Userr user);
//}
//
//class TextChat implements Chat{
//    Userr admin;
//    List<Userr> users = new ArrayList<>();
//    public void setAdmin(Userr admin){this.admin = admin;}
//    public void addUser(Userr u){users.add(u);}
//    public void sendMassage(String massage, Userr user){
//        for (Userr u : users){
//            u.getMassage(massage);
//        }
//        admin.getMassage(massage);
//    }
//}

