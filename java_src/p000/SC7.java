package p000;

import com.google.android.gms.internal.places.AbstractC17530c;
/* renamed from: SC7 */
/* loaded from: classes5.dex */
public final class SC7 implements GS7 {

    /* renamed from: a */
    public static final SC7 f33327a = new SC7();

    private SC7() {
    }

    /* renamed from: a */
    public static SC7 m85841a() {
        return f33327a;
    }

    @Override // p000.GS7
    public final boolean zzb(Class<?> cls) {
        return AbstractC17530c.class.isAssignableFrom(cls);
    }

    @Override // p000.GS7
    public final WS7 zzc(Class<?> cls) {
        String str;
        String str2;
        if (!AbstractC17530c.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (WS7) AbstractC17530c.m51220r(cls.asSubclass(AbstractC17530c.class)).mo51148k(AbstractC17530c.C17534d.f71155c, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }
}
