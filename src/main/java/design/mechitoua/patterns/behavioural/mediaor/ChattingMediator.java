package design.mechitoua.patterns.behavioural.mediaor;

public interface ChattingMediator {
    public abstract void sendMessage(String msg, User user);

    public abstract void addUser(User user);
}
