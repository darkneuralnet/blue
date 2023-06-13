package p000;

import java.util.Collections;
import java.util.Map;
/* renamed from: z18  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52555z18 extends Em9<C52555z18, H08> implements Pp9 {
    private static final C52555z18 zzb;
    private static volatile InterfaceC42368hq9<C52555z18> zze;
    private C52437yp9<String, C47230q28> zzf = C52437yp9.m2510d();
    private C52437yp9<String, R28> zzg = C52437yp9.m2510d();

    static {
        C52555z18 c52555z18 = new C52555z18();
        zzb = c52555z18;
        Em9.m108371m(C52555z18.class, c52555z18);
    }

    private C52555z18() {
    }

    /* renamed from: A */
    public static /* synthetic */ Map m2002A(C52555z18 c52555z18) {
        if (!c52555z18.zzg.m2506h()) {
            c52555z18.zzg = c52555z18.zzg.m2509e();
        }
        return c52555z18.zzg;
    }

    /* renamed from: x */
    public static C52555z18 m1996x() {
        return zzb;
    }

    /* renamed from: y */
    public static /* synthetic */ Map m1995y(C52555z18 c52555z18) {
        if (!c52555z18.zzf.m2506h()) {
            c52555z18.zzf = c52555z18.zzf.m2509e();
        }
        return c52555z18.zzf;
    }

    /* renamed from: B */
    public final Map<String, R28> m2001B() {
        return Collections.unmodifiableMap(this.zzg);
    }

    /* renamed from: C */
    public final Map<String, C47230q28> m2000C() {
        return Collections.unmodifiableMap(this.zzf);
    }

    /* renamed from: D */
    public final boolean m1999D(String str) {
        str.getClass();
        return this.zzf.containsKey(str);
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
                            InterfaceC42368hq9<C52555z18> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C52555z18.class) {
                                    interfaceC42368hq9 = zze;
                                    if (interfaceC42368hq9 == null) {
                                        interfaceC42368hq9 = new C42328hm9<>(zzb);
                                        zze = interfaceC42368hq9;
                                    }
                                }
                            }
                            return interfaceC42368hq9;
                        }
                        return zzb;
                    }
                    return new H08(null);
                }
                return new C52555z18();
            }
            return Em9.m108372l(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"zzf", C44255l18.f95371a, "zzg", W08.f40251a});
        }
        return (byte) 1;
    }
}
