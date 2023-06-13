package p000;

import android.os.Bundle;
import android.support.annotation.NonNull;
/* renamed from: So */
/* loaded from: classes6.dex */
public abstract class AbstractC7546So {
    /* renamed from: d */
    public static AbstractC7546So m84820d(@NonNull String str, int i, int i2, long j, long j2, double d, int i3, String str2) {
        return new QK6(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2);
    }

    /* renamed from: e */
    public static AbstractC7546So m84819e(Bundle bundle, String str, C51556xL6 c51556xL6, DK6 dk6) {
        int mo107304a = dk6.mo107304a(bundle.getInt(XN6.m77066e("status", str)), str);
        int i = bundle.getInt(XN6.m77066e("error_code", str));
        long j = bundle.getLong(XN6.m77066e("bytes_downloaded", str));
        long j2 = bundle.getLong(XN6.m77066e("total_bytes_to_download", str));
        double m5431b = c51556xL6.m5431b(str);
        long j3 = bundle.getLong(XN6.m77066e("pack_version", str));
        long j4 = bundle.getLong(XN6.m77066e("pack_base_version", str));
        int i2 = 1;
        if (mo107304a == 4 && j4 != 0 && j4 != j3) {
            i2 = 2;
        }
        return m84820d(str, mo107304a, i, j, j2, m5431b, i2, bundle.getString(XN6.m77066e("pack_version_tag", str), ""));
    }

    /* renamed from: a */
    public abstract int mo84823a();

    /* renamed from: b */
    public abstract String mo84822b();

    /* renamed from: c */
    public abstract long mo84821c();

    /* renamed from: f */
    public abstract int mo84818f();

    /* renamed from: g */
    public abstract String mo84817g();

    /* renamed from: h */
    public abstract int mo84816h();

    /* renamed from: i */
    public abstract long mo84815i();

    /* renamed from: j */
    public abstract int mo84814j();
}
