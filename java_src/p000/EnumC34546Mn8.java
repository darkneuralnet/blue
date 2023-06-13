package p000;
/* renamed from: Mn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC34546Mn8 implements InterfaceC46887pT7 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    

    /* renamed from: h */
    public static final DT7<EnumC34546Mn8> f23594h = new DT7<EnumC34546Mn8>() { // from class: Uq8
        @Override // p000.DT7
        /* renamed from: g */
        public final /* synthetic */ EnumC34546Mn8 mo51476g(int i) {
            return EnumC34546Mn8.m94798a(i);
        }
    };

    /* renamed from: b */
    public final int f23596b;

    EnumC34546Mn8(int i) {
        this.f23596b = i;
    }

    /* renamed from: a */
    public static EnumC34546Mn8 m94798a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    @Override // p000.InterfaceC46887pT7
    public final int zzc() {
        return this.f23596b;
    }
}
