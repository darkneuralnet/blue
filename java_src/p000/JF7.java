package p000;

import net.danlew.android.joda.DateUtils;
/* renamed from: JF7 */
/* loaded from: classes5.dex */
public final class JF7 extends AbstractC38831bu7 {
    private static final JF7 zze;
    private int zzA;
    private int zzf;
    private float zzj;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private MF7 zzq;
    private VE7 zzr;
    private C44371lD7 zzs;
    private BF7 zzt;
    private FF7 zzu;
    private C34860Nw7 zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;
    private byte zzB = 2;
    private String zzg = "";
    private int zzh = 10;
    private int zzi = 1;
    private float zzk = 0.3f;
    private InterfaceC45964nu7 zzl = AbstractC40627eu7.m42399s();
    private int zzv = 1;

    static {
        JF7 jf7 = new JF7();
        zze = jf7;
        AbstractC40627eu7.m42395x(JF7.class, jf7);
    }

    private JF7() {
    }

    /* renamed from: E */
    public static DF7 m100775E() {
        return (DF7) zze.m42408f();
    }

    /* renamed from: G */
    public static /* synthetic */ void m100773G(JF7 jf7, String str) {
        jf7.zzf |= 1;
        jf7.zzg = "MobileSSDTfLiteClient";
    }

    /* renamed from: H */
    public static /* synthetic */ void m100772H(JF7 jf7, boolean z) {
        jf7.zzf |= 32;
        jf7.zzm = true;
    }

    /* renamed from: I */
    public static /* synthetic */ void m100771I(JF7 jf7, FF7 ff7) {
        ff7.getClass();
        jf7.zzu = ff7;
        jf7.zzf |= 8192;
    }

    /* renamed from: J */
    public static /* synthetic */ void m100770J(JF7 jf7, C34860Nw7 c34860Nw7) {
        c34860Nw7.getClass();
        jf7.zzw = c34860Nw7;
        jf7.zzf |= DateUtils.FORMAT_ABBREV_WEEKDAY;
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
                            this.zzB = b;
                            return null;
                        }
                        return zze;
                    }
                    return new DF7(null);
                }
                return new JF7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006\u001a\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဋ\b\u000bဉ\t\fဉ\n\rဉ\f\u000fင\u000e\u0010ဉ\r\u0011ဉ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014င\u0012\u0015ဉ\u000b\u0016ဌ\u0013", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzt", "zzv", "zzu", "zzw", "zzx", "zzy", "zzz", "zzs", "zzA", IF7.f14944a});
        }
        return Byte.valueOf(this.zzB);
    }
}
