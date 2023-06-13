package zendesk.support;
/* loaded from: classes8.dex */
public interface SupportBlipsProvider {
    void requestCreated(String str);

    void requestListViewed();

    void requestUpdated(String str);

    void requestViewed(String str);

    void supportSdkInit();
}
