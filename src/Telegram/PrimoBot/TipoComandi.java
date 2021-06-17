package Telegram.PrimoBot;

public enum TipoComandi {

    CIAO("ciao"),
    TASTIERA("tastiera"),
    MONOPATTINO("\uD83D\uDEF4"),
    SCOOTER("\uD83D\uDEF5"),
    MOTO("\uD83C\uDFCD");


    private String text;

    TipoComandi(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static TipoComandi fromString(String text) {
        for (TipoComandi b : TipoComandi.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
    }
