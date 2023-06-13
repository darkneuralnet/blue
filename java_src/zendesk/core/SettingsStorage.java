package zendesk.core;

import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public interface SettingsStorage {
    boolean areSettingsUpToDate(long j, TimeUnit timeUnit);

    void clear();

    Map<String, AbstractC52360yi2> getRawSettings();

    <E> E getSettings(String str, Class<E> cls);

    boolean hasStoredSettings();

    void storeRawSettings(Map<String, AbstractC52360yi2> map);
}
