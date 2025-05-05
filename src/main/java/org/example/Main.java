package org.example;



import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import org.example.bot.MyTelegramBot;


import java.util.List;
import java.util.ResourceBundle;

public class Main {
    private static final ResourceBundle resources = ResourceBundle.getBundle("settings");
    public static void main(String[] args) {


//      todo  Ustoz projektni build qilib qoydim halos, bot father dan bir necha bor token olib ham ishlatib ko'rdim,
//       har kuni ishlatib yurgan strukturam negadir bugun bitta xatolik ko'rsatib turibdi
//       { java: java.lang.NoSuchFieldError: Class com.sun.tools.javac.tree.JCTree$JCImport does not have member field 'com.sun.tools.javac.tree.JCTree qualid'}
//        BU xatolikni tuzata olmadim, xatto run tugmasi bosilmadi, shu sababli botni ichini yozib chiqolmadim.




        String token = resources.getString("bot.token");
        String username = resources.getString("bot.username");
        String adminId = resources.getString("bot.admin.id");

        TelegramBot bot = new TelegramBot(token);
        bot.setUpdatesListener((List<Update> updates) -> {
            updates.forEach(update -> {
                MyTelegramBot mybot = new MyTelegramBot();
                mybot.handle(update, bot::execute);
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });

    }
}