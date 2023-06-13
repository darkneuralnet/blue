package zendesk.core;
/* loaded from: classes8.dex */
public interface BlipsProvider {
    void sendBlip(PageView pageView, BlipsGroup blipsGroup);

    void sendBlip(UserAction userAction, BlipsGroup blipsGroup);
}
