package p000;
/* renamed from: Yt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37407Yt7 implements InterfaceC40044dv7 {

    /* renamed from: a */
    public static final C37407Yt7 f47600a = new C37407Yt7();

    private C37407Yt7() {
    }

    /* renamed from: a */
    public static C37407Yt7 m74025a() {
        return f47600a;
    }

    @Override // p000.InterfaceC40044dv7
    public final InterfaceC39452cv7 zzb(Class cls) {
        String str;
        String str2;
        if (!AbstractC40627eu7.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC39452cv7) AbstractC40627eu7.m42406j(cls.asSubclass(AbstractC40627eu7.class)).mo5B(3, null, null);
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

    @Override // p000.InterfaceC40044dv7
    public final boolean zzc(Class cls) {
        return AbstractC40627eu7.class.isAssignableFrom(cls);
    }
}
