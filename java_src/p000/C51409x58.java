package p000;

import com.google.android.gms.internal.clearcut.C17506g;
/* renamed from: x58  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51409x58 {

    /* renamed from: a */
    public static final T48 f117094a = m5853c();

    /* renamed from: b */
    public static final T48 f117095b = new C17506g();

    /* renamed from: a */
    public static T48 m5855a() {
        return f117094a;
    }

    /* renamed from: b */
    public static T48 m5854b() {
        return f117095b;
    }

    /* renamed from: c */
    public static T48 m5853c() {
        try {
            return (T48) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
