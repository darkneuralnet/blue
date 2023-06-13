package p000;
/* renamed from: Za8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37471Za8 implements InterfaceC43483jj8 {

    /* renamed from: a */
    public static final C37471Za8 f48794a = new C37471Za8();

    private C37471Za8() {
    }

    /* renamed from: a */
    public static C37471Za8 m72909a() {
        return f48794a;
    }

    @Override // p000.InterfaceC43483jj8
    public final InterfaceC36841Wi8 zzb(Class<?> cls) {
        String str;
        String str2;
        if (!AbstractC35140Pb8.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC36841Wi8) AbstractC35140Pb8.m90069a(cls.asSubclass(AbstractC35140Pb8.class)).mo42375h(3, null, null);
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

    @Override // p000.InterfaceC43483jj8
    public final boolean zzc(Class<?> cls) {
        return AbstractC35140Pb8.class.isAssignableFrom(cls);
    }
}
