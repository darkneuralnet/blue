package com.stripe.android.core.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/core/storage/SharedPreferencesStorage;", "Lcom/stripe/android/core/storage/Storage;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "purpose", "", "(Landroid/content/Context;Ljava/lang/String;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "clear", "", "getBoolean", "key", "defaultValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "remove", "storeValue", "value", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class SharedPreferencesStorage implements Storage {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String logTag;
    private final Context context;
    private final String purpose;
    private final Lazy sharedPrefs$delegate;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/storage/SharedPreferencesStorage$Companion;", "", "()V", "logTag", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        String simpleName = SharedPreferencesStorage.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "SharedPreferencesStorage::class.java.simpleName");
        logTag = simpleName;
    }

    public SharedPreferencesStorage(Context context, String purpose) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.context = context;
        this.purpose = purpose;
        lazy = LazyKt__LazyJVMKt.lazy(new SharedPreferencesStorage$sharedPrefs$2(this));
        this.sharedPrefs$delegate = lazy;
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean clear() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.clear();
            return edit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to clear values");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.storage.Storage
    public boolean getBoolean(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                String str = this.purpose;
                boolean z2 = sharedPrefs.getBoolean(str + "_" + key, z);
                z = z2;
                key = z2;
            } else {
                String str2 = logTag;
                Log.e(str2, "Unable to retrieve a Boolean for " + key);
                key = key;
            }
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                String str3 = logTag;
                Log.e(str3, key + " is not a Boolean", th);
            } else {
                String str4 = logTag;
                Log.d(str4, "Error retrieving Boolean for " + key, th);
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.storage.Storage
    public float getFloat(String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                String str = this.purpose;
                float f2 = sharedPrefs.getFloat(str + "_" + key, f);
                f = f2;
                key = f2;
            } else {
                String str2 = logTag;
                Log.e(str2, "Unable to retrieve a Float for " + key);
                key = key;
            }
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                String str3 = logTag;
                Log.e(str3, key + " is not a Float", th);
            } else {
                String str4 = logTag;
                Log.d(str4, "Error retrieving Float for " + key, th);
            }
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.storage.Storage
    public int getInt(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                String str = this.purpose;
                int i2 = sharedPrefs.getInt(str + "_" + key, i);
                i = i2;
                key = i2;
            } else {
                String str2 = logTag;
                Log.e(str2, "Unable to retrieve an Int for " + key);
                key = key;
            }
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                String str3 = logTag;
                Log.e(str3, key + " is not a Int", th);
            } else {
                String str4 = logTag;
                Log.d(str4, "Error retrieving Int for " + key, th);
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.storage.Storage
    public long getLong(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                String str = this.purpose;
                long j2 = sharedPrefs.getLong(str + "_" + key, j);
                j = j2;
                key = j2;
            } else {
                String str2 = logTag;
                Log.e(str2, "Unable to retrieve a Long for " + key);
                key = key;
            }
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                String str3 = logTag;
                Log.e(str3, key + " is not a Long", th);
            } else {
                String str4 = logTag;
                Log.d(str4, "Error retrieving Long for " + key, th);
            }
        }
        return j;
    }

    @Override // com.stripe.android.core.storage.Storage
    public String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                String str = this.purpose;
                String string = sharedPrefs.getString(str + "_" + key, defaultValue);
                if (string != null) {
                    return string;
                }
            }
            String str2 = logTag;
            Log.e(str2, "Unable to retrieve a String for " + key);
            return defaultValue;
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                String str3 = logTag;
                Log.e(str3, key + " is not a String", th);
                return defaultValue;
            }
            String str4 = logTag;
            Log.d(str4, "Error retrieving String for " + key, th);
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.remove(key);
            return edit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to remove values");
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            String str = this.purpose;
            edit.putString(str + "_" + key, value);
            return edit.commit();
        }
        String str2 = logTag;
        Log.e(str2, "Shared preferences is unavailable to store " + value + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            String str = this.purpose;
            edit.putLong(str + "_" + key, j);
            return edit.commit();
        }
        String str2 = logTag;
        Log.e(str2, "Shared preferences is unavailable to store " + j + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            String str = this.purpose;
            edit.putInt(str + "_" + key, i);
            return edit.commit();
        }
        String str2 = logTag;
        Log.e(str2, "Shared preferences is unavailable to store " + i + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            String str = this.purpose;
            edit.putFloat(str + "_" + key, f);
            return edit.commit();
        }
        String str2 = logTag;
        Log.e(str2, "Shared preferences is unavailable to store " + f + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            String str = this.purpose;
            edit.putBoolean(str + "_" + key, z);
            return edit.commit();
        }
        String str2 = logTag;
        Log.e(str2, "Shared preferences is unavailable to store " + z + " for " + key);
        return false;
    }
}
