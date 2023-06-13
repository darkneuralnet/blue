package p000;

import com.google.android.gms.internal.places.C17539g;
/* renamed from: eW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40391eW7 {

    /* renamed from: a */
    public static final CV7 f78506a = m42814c();

    /* renamed from: b */
    public static final CV7 f78507b = new C17539g();

    /* renamed from: a */
    public static CV7 m42816a() {
        return f78506a;
    }

    /* renamed from: b */
    public static CV7 m42815b() {
        return f78507b;
    }

    /* renamed from: c */
    public static CV7 m42814c() {
        try {
            return (CV7) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
