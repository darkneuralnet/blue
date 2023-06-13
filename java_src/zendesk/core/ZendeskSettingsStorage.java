package zendesk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: classes8.dex */
class ZendeskSettingsStorage implements SettingsStorage {
    private static final String LAST_UPDATE = "last_settings_update";
    private static final String RAWSETTTINGS_KEYSET = "rawsettings_keyset";
    private final BaseStorage settingsStorage;

    public ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean areSettingsUpToDate(long j, TimeUnit timeUnit) {
        Long l;
        synchronized (this.settingsStorage) {
            l = (Long) this.settingsStorage.get(LAST_UPDATE, Long.class);
        }
        if (l == null || l.longValue() == -1) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() >= TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return false;
        }
        return true;
    }

    @Override // zendesk.core.SettingsStorage
    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    @Override // zendesk.core.SettingsStorage
    public Map<String, AbstractC52360yi2> getRawSettings() {
        HashMap hashMap;
        synchronized (this.settingsStorage) {
            hashMap = new HashMap();
            Set<String> set = (Set) this.settingsStorage.get(RAWSETTTINGS_KEYSET, Set.class);
            if (set != null) {
                for (String str : set) {
                    if (str != null) {
                        hashMap.put(str, (AbstractC52360yi2) this.settingsStorage.get(str, AbstractC52360yi2.class));
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // zendesk.core.SettingsStorage
    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = (E) this.settingsStorage.get(str, cls);
        }
        return e;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean hasStoredSettings() {
        boolean m27273b;
        synchronized (this.settingsStorage) {
            m27273b = C44504lS5.m27273b(this.settingsStorage.get(LAST_UPDATE));
        }
        return m27273b;
    }

    @Override // zendesk.core.SettingsStorage
    public void storeRawSettings(Map<String, AbstractC52360yi2> map) {
        synchronized (this.settingsStorage) {
            this.settingsStorage.put(LAST_UPDATE, Long.valueOf(System.currentTimeMillis()));
            for (Map.Entry<String, AbstractC52360yi2> entry : map.entrySet()) {
                this.settingsStorage.put(entry.getKey(), entry.getValue());
            }
            this.settingsStorage.put(RAWSETTTINGS_KEYSET, map.keySet());
        }
    }
}
