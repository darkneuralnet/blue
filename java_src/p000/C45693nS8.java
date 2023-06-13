package p000;

import com.google.android.gms.internal.vision.C17564K;
/* renamed from: nS8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45693nS8 {

    /* renamed from: a */
    public static final RR8 f99999a = m23654c();

    /* renamed from: b */
    public static final RR8 f100000b = new C17564K();

    /* renamed from: a */
    public static RR8 m23656a() {
        return f99999a;
    }

    /* renamed from: b */
    public static RR8 m23655b() {
        return f100000b;
    }

    /* renamed from: c */
    public static RR8 m23654c() {
        try {
            return (RR8) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
