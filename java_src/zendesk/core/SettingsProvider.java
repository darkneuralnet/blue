package zendesk.core;
/* loaded from: classes8.dex */
public interface SettingsProvider {
    void getCoreSettings(AbstractC44415lI6<CoreSettings> abstractC44415lI6);

    <E extends Settings> void getSettingsForSdk(String str, Class<E> cls, AbstractC44415lI6<SettingsPack<E>> abstractC44415lI6);
}
