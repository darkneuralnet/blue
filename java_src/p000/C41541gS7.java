package p000;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
/* renamed from: gS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41541gS7 implements InterfaceC49008t28 {

    /* renamed from: a */
    public static final C41541gS7 f82262a = new C41541gS7();

    private C41541gS7() {
    }

    /* renamed from: a */
    public static C41541gS7 m39367a() {
        return f82262a;
    }

    @Override // p000.InterfaceC49008t28
    public final boolean zza(Class<?> cls) {
        return AbstractC17497c.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC49008t28
    public final InterfaceC40114e28 zzb(Class<?> cls) {
        if (!AbstractC17497c.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC40114e28) AbstractC17497c.m51557j(cls.asSubclass(AbstractC17497c.class)).mo51468d(AbstractC17497c.C17502e.f70405c, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
