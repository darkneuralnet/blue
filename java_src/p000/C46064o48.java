package p000;

import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
/* renamed from: o48  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46064o48 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C46064o48 zzb;
    private SO7 zzA;
    private WK7 zzB;
    private C39215cZ7 zzC;
    private B78 zzD;
    private boolean zzH;
    private int zzK;
    private int zzL;
    private C41250fx7 zzM;
    private boolean zzN;
    private boolean zzQ;
    private G28 zzR;
    private boolean zzS;
    private GA7 zzT;
    private C43482jj7 zzU;
    private C42610iF7 zzV;
    private WH7 zzW;
    private C33817Jk8 zzX;
    private C39265ce8 zzY;
    private C48809si8 zzZ;
    private C31873Bc8 zzaa;
    private YR7 zzab;
    private C33547Ig8 zzac;
    private int zzad;
    private boolean zzae;
    private int zzaf;
    private int zzag;
    private int zze;
    private int zzf;
    private C51772xi7 zzi;
    private C33385Ho8 zzl;
    private C51494xE7 zzo;
    private C36976Wx8 zzr;
    private C36076Tb8 zzs;
    private C40903fN7 zzt;
    private C47725qs9 zzu;
    private C50846w88 zzv;
    private C47893r98 zzw;
    private C45530nA7 zzx;
    private boolean zzy;
    private KM8 zzz;
    private byte zzai = 2;
    private InterfaceC45964nu7 zzg = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzj = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzk = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzm = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzn = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzp = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzq = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzE = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzF = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzG = AbstractC40627eu7.m42399s();
    private String zzI = "";
    private int zzJ = 1;
    private String zzO = "";
    private String zzP = "";
    private int zzah = 1;

    static {
        C46064o48 c46064o48 = new C46064o48();
        zzb = c46064o48;
        AbstractC40627eu7.m42395x(C46064o48.class, c46064o48);
    }

    private C46064o48() {
    }

    /* renamed from: D */
    public static C43089j38 m21843D() {
        return (C43089j38) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m21841F(C46064o48 c46064o48, C41250fx7 c41250fx7) {
        c46064o48.zzM = c41250fx7;
        c46064o48.zze |= 2097152;
    }

    /* renamed from: G */
    public static /* synthetic */ void m21840G(C46064o48 c46064o48, String str) {
        c46064o48.zze |= 8388608;
        c46064o48.zzO = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m21839H(C46064o48 c46064o48, String str) {
        c46064o48.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        c46064o48.zzP = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m21838I(C46064o48 c46064o48, VF8 vf8) {
        vf8.getClass();
        InterfaceC45964nu7 interfaceC45964nu7 = c46064o48.zzg;
        if (!interfaceC45964nu7.zzc()) {
            c46064o48.zzg = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        c46064o48.zzg.add(vf8);
    }

    /* renamed from: J */
    public static /* synthetic */ void m21837J(C46064o48 c46064o48, C36696Vs7 c36696Vs7) {
        c36696Vs7.getClass();
        InterfaceC45964nu7 interfaceC45964nu7 = c46064o48.zzn;
        if (!interfaceC45964nu7.zzc()) {
            c46064o48.zzn = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        c46064o48.zzn.add(c36696Vs7);
    }

    /* renamed from: K */
    public static /* synthetic */ void m21836K(C46064o48 c46064o48, boolean z) {
        c46064o48.zze |= 1024;
        c46064o48.zzy = true;
    }

    /* renamed from: L */
    public static /* synthetic */ void m21835L(C46064o48 c46064o48, KM8 km8) {
        km8.getClass();
        c46064o48.zzz = km8;
        c46064o48.zze |= 2048;
    }

    /* renamed from: M */
    public static /* synthetic */ void m21834M(C46064o48 c46064o48, SO7 so7) {
        so7.getClass();
        c46064o48.zzA = so7;
        c46064o48.zze |= 4096;
    }

    /* renamed from: N */
    public static /* synthetic */ void m21833N(C46064o48 c46064o48, B78 b78) {
        b78.getClass();
        c46064o48.zzD = b78;
        c46064o48.zze |= DateUtils.FORMAT_ABBREV_WEEKDAY;
    }

    /* renamed from: O */
    public static /* synthetic */ void m21832O(C46064o48 c46064o48, int i) {
        c46064o48.zzL = i - 1;
        c46064o48.zze |= 1048576;
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
                            this.zzai = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C43089j38(null);
                }
                return new C46064o48();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u00016\u0000\u0002\u0001B6\u0000\u000b\t\u0001\u001b\u0002Л\u0003ဉ\u0001\u0005\u001b\u0006Л\u0007ဇ\u0010\bဉ\u000f\nဉ\u000b\u000bဉ\f\fဉ\r\u000fဉ\u001e\u0010ᐉ\u0002\u0013\u001b\u0014ᐉ\u0003\u0015\u001a\u0016ဉ \u0017ဉ\u001a\u0018ဉ\u000e\u001aᐉ\u0004\u001b\u001b\u001cဉ\u0005\u001dဉ\u0006\u001eဉ\u001f\u001f\u001b ဈ\u0011!\u001a\"ဉ!$ဇ\u001b%ᐉ\u0007&ᐉ\b'ဉ\u0015)ဉ\u001d*\u001b+ဉ\",ဉ#-ဌ\u0014.ဇ\n/ဉ%1ဉ$3ဌ&4ဇ\u00165ᐉ\u001c6င\u00127င\u00138ဈ\u00179ဈ\u0018:ဌ)<ဇ'=ဇ\u0019>ဉ\u0000?\u001b@ဌ(Aᐉ\tBင*", new Object[]{"zze", "zzf", "zzg", VF8.class, "zzk", JF7.class, "zzl", "zzm", MC8.class, "zzn", C36696Vs7.class, "zzH", "zzD", "zzz", "zzA", "zzB", "zzV", "zzo", "zzp", FG8.class, "zzr", "zzE", "zzX", "zzR", "zzC", "zzs", "zzj", Ih9.class, "zzt", "zzu", "zzW", "zzF", C39275cf8.class, "zzI", "zzG", "zzY", "zzS", "zzv", "zzw", "zzM", "zzU", "zzh", VF8.class, "zzZ", "zzaa", "zzL", C36336Ue7.f37717a, "zzy", "zzac", "zzab", "zzad", C37745a48.f49790a, "zzN", "zzT", "zzJ", "zzK", "zzO", "zzP", "zzag", C51389x38.f117059a, "zzae", "zzQ", "zzi", "zzq", C50362vK7.class, "zzaf", L38.f20658a, "zzx", "zzah"});
        }
        return Byte.valueOf(this.zzai);
    }
}
