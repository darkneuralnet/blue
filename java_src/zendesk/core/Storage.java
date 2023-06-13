package zendesk.core;
/* loaded from: classes8.dex */
interface Storage {
    void clear();

    SessionStorage getSessionStorage();

    boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration);

    void storeSdkHash(ApplicationConfiguration applicationConfiguration);
}
