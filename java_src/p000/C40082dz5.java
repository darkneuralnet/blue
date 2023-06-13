package p000;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\f\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001d\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\rH\u0080\u0002\u001a\u001f\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0080\u0002\u001a\u001d\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0007H\u0080\u0002\u001a\u001d\u0010\u0016\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080\u0002\u001a#\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0080\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\nH\u0001\u001a\u001c\u0010\u001b\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\rH\u0001\u001a\u001c\u0010\u001c\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0007H\u0001¨\u0006\u001d"}, m28432d2 = {"Landroid/content/SharedPreferences;", "LYj2;", "key", "", "h", "value", "i", "", "f", "g", "", "j", "k", "", DateTokenConverter.CONVERTER_KEY, "e", "", "l", "", "r", "p", "n", "o", "", "q", "m", "b", "c", C17296a.f69688o, "config_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: dz5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40082dz5 {
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public static final void m43446a(SharedPreferences sharedPreferences, EnumC37312Yj2 key, int i) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putInt(key.name(), i).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: b */
    public static final void m43445b(SharedPreferences sharedPreferences, EnumC37312Yj2 key, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putString(key.name(), str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: c */
    public static final void m43444c(SharedPreferences sharedPreferences, EnumC37312Yj2 key, boolean z) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putBoolean(key.name(), z).commit();
    }

    /* renamed from: d */
    public static final boolean m43443d(SharedPreferences sharedPreferences, EnumC37312Yj2 key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getBoolean(key.name(), false);
    }

    /* renamed from: e */
    public static final boolean m43442e(SharedPreferences sharedPreferences, EnumC37312Yj2 key, boolean z) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getBoolean(key.name(), z);
    }

    /* renamed from: f */
    public static final int m43441f(SharedPreferences sharedPreferences, EnumC37312Yj2 key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getInt(key.name(), 0);
    }

    /* renamed from: g */
    public static final int m43440g(SharedPreferences sharedPreferences, EnumC37312Yj2 key, int i) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getInt(key.name(), i);
    }

    /* renamed from: h */
    public static final long m43439h(SharedPreferences sharedPreferences, EnumC37312Yj2 key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getLong(key.name(), 0L);
    }

    /* renamed from: i */
    public static final long m43438i(SharedPreferences sharedPreferences, EnumC37312Yj2 key, long j) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getLong(key.name(), j);
    }

    /* renamed from: j */
    public static final String m43437j(SharedPreferences sharedPreferences, EnumC37312Yj2 key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getString(key.name(), null);
    }

    /* renamed from: k */
    public static final String m43436k(SharedPreferences sharedPreferences, EnumC37312Yj2 key, String value) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return sharedPreferences.getString(key.name(), value);
    }

    /* renamed from: l */
    public static final Set<String> m43435l(SharedPreferences sharedPreferences, EnumC37312Yj2 key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return sharedPreferences.getStringSet(key.name(), null);
    }

    /* renamed from: m */
    public static final void m43434m(SharedPreferences sharedPreferences, EnumC37312Yj2 key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().remove(key.name()).apply();
    }

    /* renamed from: n */
    public static final void m43433n(SharedPreferences sharedPreferences, EnumC37312Yj2 key, int i) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putInt(key.name(), i).apply();
    }

    /* renamed from: o */
    public static final void m43432o(SharedPreferences sharedPreferences, EnumC37312Yj2 key, long j) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putLong(key.name(), j).apply();
    }

    /* renamed from: p */
    public static final void m43431p(SharedPreferences sharedPreferences, EnumC37312Yj2 key, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putString(key.name(), str).apply();
    }

    /* renamed from: q */
    public static final void m43430q(SharedPreferences sharedPreferences, EnumC37312Yj2 key, Set<String> value) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        sharedPreferences.edit().putStringSet(key.name(), value).apply();
    }

    /* renamed from: r */
    public static final void m43429r(SharedPreferences sharedPreferences, EnumC37312Yj2 key, boolean z) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().putBoolean(key.name(), z).apply();
    }
}
