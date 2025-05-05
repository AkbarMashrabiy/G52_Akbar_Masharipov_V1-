package org.example.bot;


import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;

import java.util.ResourceBundle;
import java.util.function.Consumer;

public class MyTelegramBot  {

    private static final ResourceBundle resources = ResourceBundle.getBundle("settings");


    public void handle(Update update, Consumer<BaseRequest> consumer) {

        if (update.callbackQuery() != null){
            Long id = update.callbackQuery().from().id();
        }




        else if (update.message() != null){
            Message message = update.message();
            Long chatId = message.from().id();
            consumer.accept(new SendMessage(chatId, " " + message.from().id()));
            System.out.println(chatId);

        }
    }

    public boolean isAdmin(Long id){
        if (resources.getString("bot.admin.id").equals(id.toString())){
            return true;
        }
        return false;
    }
}
