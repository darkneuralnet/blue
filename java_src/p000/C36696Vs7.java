package p000;
/* renamed from: Vs7 */
/* loaded from: classes6.dex */
public final class C36696Vs7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C36696Vs7 zzb;
    private int zze;
    private JF7 zzf;
    private boolean zzg;
    private VF8 zzh;
    private boolean zzi;
    private C37651Zu8 zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzo;
    private float zzp;
    private int zzq;
    private C47417qM7 zzr;
    private byte zzs = 2;
    private int zzn = -1;

    static {
        C36696Vs7 c36696Vs7 = new C36696Vs7();
        zzb = c36696Vs7;
        AbstractC40627eu7.m42395x(C36696Vs7.class, c36696Vs7);
    }

    private C36696Vs7() {
    }

    /* renamed from: D */
    public static C40014ds7 m79320D() {
        return (C40014ds7) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m79318F(C36696Vs7 c36696Vs7, JF7 jf7) {
        jf7.getClass();
        c36696Vs7.zzf = jf7;
        c36696Vs7.zze |= 1;
    }

    /* renamed from: G */
    public static /* synthetic */ void m79317G(C36696Vs7 c36696Vs7, C37651Zu8 c37651Zu8) {
        c37651Zu8.getClass();
        c36696Vs7.zzj = c37651Zu8;
        c36696Vs7.zze |= 16;
    }

    /* renamed from: H */
    public static /* synthetic */ void m79316H(C36696Vs7 c36696Vs7, boolean z) {
        c36696Vs7.zze |= 128;
        c36696Vs7.zzm = z;
    }

    /* renamed from: I */
    public static /* synthetic */ void m79315I(C36696Vs7 c36696Vs7, int i) {
        c36696Vs7.zze |= 256;
        c36696Vs7.zzn = i;
    }

    /* renamed from: J */
    public static /* synthetic */ void m79314J(C36696Vs7 c36696Vs7, float f) {
        c36696Vs7.zze |= 1024;
        c36696Vs7.zzp = 0.6f;
    }

    /* renamed from: K */
    public static /* synthetic */ void m79313K(C36696Vs7 c36696Vs7, int i) {
        c36696Vs7.zze |= 2048;
        c36696Vs7.zzq = 0;
    }

    /* renamed from: L */
    public static /* synthetic */ void m79312L(C36696Vs7 c36696Vs7, VF8 vf8) {
        vf8.getClass();
        c36696Vs7.zzh = vf8;
        c36696Vs7.zze |= 4;
    }

    /* renamed from: M */
    public static /* synthetic */ void m79311M(C36696Vs7 c36696Vs7, boolean z) {
        c36696Vs7.zze |= 8;
        c36696Vs7.zzi = true;
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzs = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C40014ds7(null);
                }
                return new C36696Vs7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0002\u0003ဉ\u0004\u0004ဇ\u0007\u0005င\b\u0006ဇ\t\u0007ဇ\u0001\bခ\n\tင\u000b\nဇ\u0003\u000bဉ\f\fခ\u0005\rဇ\u0006", new Object[]{"zze", "zzf", "zzh", "zzj", "zzm", "zzn", "zzo", "zzg", "zzp", "zzq", "zzi", "zzr", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzs);
    }
}
