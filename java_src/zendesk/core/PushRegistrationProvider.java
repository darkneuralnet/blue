package zendesk.core;
/* loaded from: classes8.dex */
public interface PushRegistrationProvider {
    boolean isRegisteredForPush();

    void registerWithDeviceIdentifier(String str, AbstractC44415lI6<String> abstractC44415lI6);

    void registerWithUAChannelId(String str, AbstractC44415lI6<String> abstractC44415lI6);

    void unregisterDevice(AbstractC44415lI6<Void> abstractC44415lI6);
}
