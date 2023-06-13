package zendesk.core;

import android.content.SharedPreferences;
/* loaded from: classes8.dex */
class SharedPreferencesStorage implements BaseStorage {
    private final Serializer serializer;
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesStorage(SharedPreferences sharedPreferences, Serializer serializer) {
        this.sharedPreferences = sharedPreferences;
        this.serializer = serializer;
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    @Override // zendesk.core.BaseStorage
    public String get(String str) {
        return this.sharedPreferences.getString(str, null);
    }

    public long getLong(String str) {
        return this.sharedPreferences.getLong(str, 0L);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, String str2) {
        if (C44504lS5.m27273b(str)) {
            this.sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    @Override // zendesk.core.BaseStorage
    public void remove(String str) {
        if (C44504lS5.m27273b(str)) {
            this.sharedPreferences.edit().remove(str).apply();
        }
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(String str, Class<E> cls) {
        return (E) this.serializer.deserialize(get(str), cls);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, Object obj) {
        if (C44504lS5.m27273b(str)) {
            put(str, obj != null ? this.serializer.serialize(obj) : null);
        }
    }
}
