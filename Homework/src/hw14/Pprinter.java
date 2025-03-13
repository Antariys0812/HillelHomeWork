package hw14;

public class Pprinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public void Message (String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return this.sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    Message msg = new Message();
    @Override
    public void print() {
        if (msg.sender == null | msg.sender == "") {
            if (msg.text == null){
                Runnable uuu = new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                    }
                };
                uuu.run();
            }
            else {
                System.out.println("Анонімний користувач відправив повідомлення: " + msg.text);
            }
        }
        else {
            System.out.println("Користувач " + msg.sender + " відправив повідомлення: " + msg.text);
        }
    }
}
