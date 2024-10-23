package observer;

public class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    @Override
    public void update(String headline) {
        System.out.println(channelName + " received a new headline: " + headline);
    }
}
