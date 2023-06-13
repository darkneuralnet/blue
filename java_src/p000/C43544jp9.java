package p000;

import java.util.List;
/* renamed from: jp9 */
/* loaded from: classes5.dex */
public final class C43544jp9 extends Ta9 {
    private static final C43544jp9 zze;
    private int zzf;
    private Nn9 zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private long zzp;
    private long zzq;
    private long zzr;
    private float zzs;
    private byte zzt = 2;
    private InterfaceC39857dc9 zzh = AbstractC49926ub9.m9991e();
    private InterfaceC39857dc9 zzn = AbstractC49926ub9.m9991e();
    private InterfaceC39857dc9 zzo = AbstractC49926ub9.m9991e();

    static {
        C43544jp9 c43544jp9 = new C43544jp9();
        zze = c43544jp9;
        AbstractC49926ub9.m9987k(C43544jp9.class, c43544jp9);
    }

    private C43544jp9() {
    }

    /* renamed from: F */
    public static C43544jp9 m29858F() {
        return zze;
    }

    /* renamed from: A */
    public final float m29863A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final float m29862B() {
        return this.zzl;
    }

    /* renamed from: C */
    public final long m29861C() {
        return this.zzq;
    }

    /* renamed from: D */
    public final Nn9 m29860D() {
        Nn9 nn9 = this.zzg;
        return nn9 == null ? Nn9.m93397z() : nn9;
    }

    /* renamed from: G */
    public final List m29857G() {
        return this.zzo;
    }

    @Override // p000.AbstractC49926ub9
    /* renamed from: n */
    public final Object mo9690n(int i, Object obj, Object obj2) {
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
                            this.zzt = b;
                            return null;
                        }
                        return zze;
                    }
                    return new Sn9(null);
                }
                return new C43544jp9();
            }
            return AbstractC49926ub9.m9988j(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005", new Object[]{"zzf", "zzg", "zzh", C41765gp9.class, "zzi", "zzj", "zzk", "zzl", "zzn", C39366co9.class, "zzo", Hn9.class, "zzq", "zzs", "zzr", "zzp", "zzm"});
        }
        return Byte.valueOf(this.zzt);
    }

    /* renamed from: w */
    public final List m29856w() {
        return this.zzh;
    }

    /* renamed from: x */
    public final boolean m29855x() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: y */
    public final float m29854y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final float m29853z() {
        return this.zzk;
    }
}
