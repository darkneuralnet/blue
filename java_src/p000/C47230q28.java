package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: q28  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47230q28 extends Em9<C47230q28, C38318b28> implements Pp9 {
    private static final InterfaceC46489on9<Integer, Au9> zzb = new N18();
    private static final C47230q28 zze;
    private static volatile InterfaceC42368hq9<C47230q28> zzf;
    private Kr9 zzh;
    private C48930su9 zzk;
    private String zzg = "";
    private An9<String> zzi = Em9.m108365v();
    private InterfaceC42931in9 zzj = Em9.m108366u();

    static {
        C47230q28 c47230q28 = new C47230q28();
        zze = c47230q28;
        Em9.m108371m(C47230q28.class, c47230q28);
    }

    private C47230q28() {
    }

    /* renamed from: F */
    public static /* synthetic */ void m18267F(C47230q28 c47230q28, Iterable iterable) {
        int i;
        An9<String> an9 = c47230q28.zzi;
        if (!an9.zzc()) {
            int size = an9.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            c47230q28.zzi = an9.mo16911d(i);
        }
        Ne9.m93594c(iterable, c47230q28.zzi);
    }

    /* renamed from: G */
    public static /* synthetic */ void m18266G(C47230q28 c47230q28, Iterable iterable) {
        int i;
        InterfaceC42931in9 interfaceC42931in9 = c47230q28.zzj;
        if (!interfaceC42931in9.zzc()) {
            int size = interfaceC42931in9.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            c47230q28.zzj = interfaceC42931in9.mo33482p(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c47230q28.zzj.zzh(((Au9) it.next()).zza());
        }
    }

    /* renamed from: H */
    public static /* synthetic */ void m18265H(C47230q28 c47230q28, C48930su9 c48930su9) {
        c48930su9.getClass();
        c47230q28.zzk = c48930su9;
    }

    /* renamed from: I */
    public static /* synthetic */ void m18264I(C47230q28 c47230q28, String str) {
        str.getClass();
        c47230q28.zzg = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m18263J(C47230q28 c47230q28, Kr9 kr9) {
        kr9.getClass();
        c47230q28.zzh = kr9;
    }

    /* renamed from: w */
    public static C38318b28 m18262w() {
        return zze.m108370o();
    }

    /* renamed from: y */
    public static C47230q28 m18260y() {
        return zze;
    }

    /* renamed from: A */
    public final Kr9 m18272A() {
        Kr9 kr9 = this.zzh;
        if (kr9 == null) {
            return Kr9.m98223B();
        }
        return kr9;
    }

    /* renamed from: B */
    public final C48930su9 m18271B() {
        C48930su9 c48930su9 = this.zzk;
        if (c48930su9 == null) {
            return C48930su9.m13396D();
        }
        return c48930su9;
    }

    /* renamed from: C */
    public final String m18270C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final List<String> m18269D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final List<Au9> m18268E() {
        return new C50046un9(this.zzj, zzb);
    }

    @Override // p000.Em9
    /* renamed from: n */
    public final Object mo1998n(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return null;
                            }
                            InterfaceC42368hq9<C47230q28> interfaceC42368hq9 = zzf;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C47230q28.class) {
                                    interfaceC42368hq9 = zzf;
                                    if (interfaceC42368hq9 == null) {
                                        interfaceC42368hq9 = new C42328hm9<>(zze);
                                        zzf = interfaceC42368hq9;
                                    }
                                }
                            }
                            return interfaceC42368hq9;
                        }
                        return zze;
                    }
                    return new C38318b28(null);
                }
                return new C47230q28();
            }
            return Em9.m108372l(zze, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\t\u0003Ț\u0004,\u0005\t", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
