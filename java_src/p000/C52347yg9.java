package p000;
/* renamed from: yg9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52347yg9 {

    /* renamed from: a */
    public static C48198rg9 f120013a;

    /* renamed from: a */
    public static synchronized Se9 m2915a(Sd9 sd9) {
        Se9 se9;
        synchronized (C52347yg9.class) {
            if (f120013a == null) {
                f120013a = new C48198rg9(null);
            }
            se9 = (Se9) f120013a.m98291b(sd9);
        }
        return se9;
    }

    /* renamed from: b */
    public static synchronized Se9 m2914b(String str) {
        Se9 m2915a;
        synchronized (C52347yg9.class) {
            m2915a = m2915a(Sd9.m85175d(str).mo95116c());
        }
        return m2915a;
    }
}
