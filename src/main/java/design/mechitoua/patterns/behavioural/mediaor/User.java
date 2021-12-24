package design.mechitoua.patterns.behavioural.mediaor;

public abstract class User {
    private ChattingMediator chattingMediator;
    private String userName;

    protected User(ChattingMediator chattingMediator, String name) {
        super();
        this.chattingMediator = chattingMediator;
        this.userName = name;
    }

    public abstract void sendMessage(String msg);

    public abstract void receiveMessage(String msg);

    public ChattingMediator getChattingMediator() {
        return chattingMediator;
    }

    public String getName() {
        return userName;
    }
}
