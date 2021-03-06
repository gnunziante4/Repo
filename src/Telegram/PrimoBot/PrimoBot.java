/*
package Telegram.PrimoBot;

import com.botticelli.bot.Bot;
import com.botticelli.bot.request.methods.MessageToSend;
import com.botticelli.bot.request.methods.types.*;
import com.botticelli.messagereceiver.MessageReceiver;

import java.util.ArrayList;
import java.util.List;

public class PrimoBot extends Bot {

    public PrimoBot(String token) {
        super(token);
    }

    @Override
    public void textMessage(Message message) {
        String msgReceived = message.getText();
        TipoComandi comandi = TipoComandi.fromString(msgReceived);
        if (comandi == null) return ;
        MessageToSend mtsend = new MessageToSend(message.getFrom().getId(), " ");
        switch (comandi) {
            case CIAO:
                MessageToSend mts = new MessageToSend(message.getChat().getId(), "Ciao! " + message.getChat().getUserName());
                sendMessage(mts);
                break;
            case TASTIERA:
                MessageToSend mts1 = new ;
                sendMessage(mts1);

                List<List<KeyboardButton>> keyboard = new ArrayList<>();
                List<KeyboardButton> line = new ArrayList<>();
                keyboard.add(line);
                line.add(new KeyboardButton("\uD83D\uDEF4"));
                line.add(new KeyboardButton("\uD83D\uDEF5"));
                line.add(new KeyboardButton("\uD83C\uDFCD️"));
                keyboard.add(line);
                ReplyKeyboardMarkupWithButtons replyKeyboard = new ReplyKeyboardMarkupWithButtons(keyboard);
                replyKeyboard.setResizeKeyboard(true);

                MessageToSend mts = new MessageToSend(message.getFrom().getId(), "Ecco la tastiera");
                mts.setReplyMarkup(replyKeyboard);
                sendMessage(mts);
                break;
            case MONOPATTINO:
                mtsend = new MessageToSend(message.getFrom().getId(), "Esercizio Monopattino");
                break;
            case SCOOTER:
                mtsend = new MessageToSend(message.getFrom().getId(), "Esercizio Scooter");
                break;
            case MOTO:
                mtsend = new MessageToSend(message.getFrom().getId(), "Esercizio Moto");
                break;


        }
        sendMessage(mtsend);

    }

    @Override
    public void audioMessage(Message message) {

    }

    @Override
    public void videoMessage(Message message) {

    }

    @Override
    public void voiceMessage(Message message) {

    }

    @Override
    public void stickerMessage(Message message) {

    }

    @Override
    public void documentMessage(Message message) {

    }

    @Override
    public void photoMessage(Message message) {

    }

    @Override
    public void contactMessage(Message message) {

    }

    @Override
    public void locationMessage(Message message) {

    }

    @Override
    public void venueMessage(Message message) {

    }

    @Override
    public void newChatMemberMessage(Message message) {

    }

    @Override
    public void newChatMembersMessage(Message message) {

    }

    @Override
    public void leftChatMemberMessage(Message message) {

    }

    @Override
    public void newChatTitleMessage(Message message) {

    }

    @Override
    public void newChatPhotoMessage(Message message) {

    }

    @Override
    public void groupChatPhotoDeleteMessage(Message message) {

    }

    @Override
    public void groupChatCreatedMessage(Message message) {

    }

    @Override
    public void inLineQuery(InlineQuery inlineQuery) {

    }

    @Override
    public void chose_inline_result(ChosenInlineResult chosenInlineResult) {

    }

    @Override
    public void callback_query(CallbackQuery callbackQuery) {

    }

    @Override
    public void gameMessage(Message message) {

    }

    @Override
    public void videoNoteMessage(Message message) {

    }

    @Override
    public void pinnedMessage(Message message) {

    }

    @Override
    public void preCheckOutQueryMessage(PreCheckoutQuery preCheckoutQuery) {

    }

    @Override
    public void shippingQueryMessage(ShippingQuery shippingQuery) {

    }

    @Override
    public void invoiceMessage(Message message) {

    }

    @Override
    public void successfulPaymentMessage(Message message) {

    }

    @Override
    public void routine() {

    }
}
*/
