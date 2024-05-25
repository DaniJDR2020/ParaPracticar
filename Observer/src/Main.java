public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");
        NewsSubscriber subscriber3 = new NewsSubscriber("Subscriber 3");

        newsAgency.registerObserver(subscriber1);
        newsAgency.registerObserver(subscriber2);
        newsAgency.registerObserver(subscriber3);

        newsAgency.setNews("Breaking News: Observer Pattern in Action!");

        newsAgency.removeObserver(subscriber2);

        newsAgency.setNews("Update: Observer Pattern Example Completed.");
    }
}