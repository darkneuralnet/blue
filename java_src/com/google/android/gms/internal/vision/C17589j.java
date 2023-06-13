package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import kotlin.text.Typography;
/* renamed from: com.google.android.gms.internal.vision.j */
/* loaded from: classes6.dex */
public final class C17589j extends AbstractC17554G<C17589j, C17591b> implements HQ8 {
    private static final C17589j zzi;
    private static volatile TS8<C17589j> zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    /* loaded from: classes6.dex */
    public enum EnumC17590a implements InterfaceC45010mI8 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);
        

        /* renamed from: g */
        public static final WI8<EnumC17590a> f71300g = new C17548B();

        /* renamed from: b */
        public final int f71302b;

        EnumC17590a(int i) {
            this.f71302b = i;
        }

        /* renamed from: a */
        public static EnumC17590a m50864a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return FORMAT_MONOCHROME;
                    }
                    return FORMAT_RGB8;
                }
                return FORMAT_LUMINANCE;
            }
            return FORMAT_UNKNOWN;
        }

        /* renamed from: b */
        public static KI8 m50863b() {
            return C17547A.f71215a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + EnumC17590a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f71302b + " name=" + name() + Typography.greater;
        }

        @Override // p000.InterfaceC45010mI8
        public final int zza() {
            return this.f71302b;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.j$b */
    /* loaded from: classes6.dex */
    public static final class C17591b extends AbstractC17554G.AbstractC17556b<C17589j, C17591b> implements HQ8 {
        private C17591b() {
            super(C17589j.zzi);
        }

        /* renamed from: A */
        public final C17591b m50862A(long j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17589j) this.f71224c).m50871D(j);
            return this;
        }

        /* renamed from: w */
        public final C17591b m50861w(long j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17589j) this.f71224c).m50868v(j);
            return this;
        }

        /* renamed from: y */
        public final C17591b m50860y(long j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17589j) this.f71224c).m50865z(j);
            return this;
        }

        /* renamed from: z */
        public final C17591b m50859z(long j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17589j) this.f71224c).m50873B(j);
            return this;
        }

        public /* synthetic */ C17591b(C17602p c17602p) {
            this();
        }
    }

    static {
        C17589j c17589j = new C17589j();
        zzi = c17589j;
        AbstractC17554G.m50988p(C17589j.class, c17589j);
    }

    private C17589j() {
    }

    /* renamed from: u */
    public static C17591b m50869u() {
        return zzi.m50986r();
    }

    /* renamed from: B */
    public final void m50873B(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* renamed from: D */
    public final void m50871D(long j) {
        this.zzc |= 16;
        this.zzh = j;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.j>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17589j> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17589j();
            case 2:
                return new C17591b(null);
            case 3:
                return AbstractC17554G.m50990n(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", EnumC17590a.m50863b(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                TS8<C17589j> ts82 = zzj;
                TS8<C17589j> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17589j.class) {
                        TS8<C17589j> ts84 = zzj;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzi);
                            zzj = c17555a;
                            ts8 = c17555a;
                        }
                    }
                    ts83 = ts8;
                }
                return ts83;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: v */
    public final void m50868v(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* renamed from: z */
    public final void m50865z(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }
}
