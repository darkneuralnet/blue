package p000;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: OH8 */
/* loaded from: classes6.dex */
public final class OH8 implements InterfaceC51010wQ8 {

    /* renamed from: a */
    public static final OH8 f26301a = new OH8();

    private OH8() {
    }

    /* renamed from: a */
    public static OH8 m92561a() {
        return f26301a;
    }

    @Override // p000.InterfaceC51010wQ8
    public final boolean zza(Class<?> cls) {
        return AbstractC17554G.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC51010wQ8
    public final PP8 zzb(Class<?> cls) {
        String str;
        String str2;
        if (!AbstractC17554G.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (PP8) AbstractC17554G.m50992j(cls.asSubclass(AbstractC17554G.class)).mo50854l(AbstractC17554G.C17560f.f71233c, null, null);
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
