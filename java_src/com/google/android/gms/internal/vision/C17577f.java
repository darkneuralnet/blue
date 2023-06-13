package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import kotlin.text.Typography;
/* renamed from: com.google.android.gms.internal.vision.f */
/* loaded from: classes6.dex */
public final class C17577f extends AbstractC17554G<C17577f, C17579b> implements HQ8 {
    private static final C17577f zzl;
    private static volatile TS8<C17577f> zzm;
    private int zzc;
    private int zzg;
    private long zzi;
    private long zzj;
    private String zzd = "";
    private String zze = "";
    private RJ8<String> zzf = AbstractC17554G.m50984t();
    private String zzh = "";
    private RJ8<C17598n> zzk = AbstractC17554G.m50984t();

    /* renamed from: com.google.android.gms.internal.vision.f$a */
    /* loaded from: classes6.dex */
    public enum EnumC17578a implements InterfaceC45010mI8 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);
        

        /* renamed from: g */
        public static final WI8<EnumC17578a> f71273g = new C17606t();

        /* renamed from: b */
        public final int f71275b;

        EnumC17578a(int i) {
            this.f71275b = i;
        }

        /* renamed from: a */
        public static EnumC17578a m50897a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return RESULT_SKIPPED;
                    }
                    return RESULT_FAIL;
                }
                return RESULT_SUCCESS;
            }
            return RESULT_UNKNOWN;
        }

        /* renamed from: b */
        public static KI8 m50896b() {
            return C17605s.f71305a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + EnumC17578a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f71275b + " name=" + name() + Typography.greater;
        }

        @Override // p000.InterfaceC45010mI8
        public final int zza() {
            return this.f71275b;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.f$b */
    /* loaded from: classes6.dex */
    public static final class C17579b extends AbstractC17554G.AbstractC17556b<C17577f, C17579b> implements HQ8 {
        private C17579b() {
            super(C17577f.zzl);
        }

        /* renamed from: A */
        public final C17579b m50895A(long j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17577f) this.f71224c).m50904D(j);
            return this;
        }

        /* renamed from: w */
        public final C17579b m50894w(long j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17577f) this.f71224c).m50901v(j);
            return this;
        }

        /* renamed from: y */
        public final C17579b m50893y(Iterable<? extends C17598n> iterable) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17577f) this.f71224c).m50907A(iterable);
            return this;
        }

        /* renamed from: z */
        public final C17579b m50892z(String str) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17577f) this.f71224c).m50906B(str);
            return this;
        }

        public /* synthetic */ C17579b(C17602p c17602p) {
            this();
        }
    }

    static {
        C17577f c17577f = new C17577f();
        zzl = c17577f;
        AbstractC17554G.m50988p(C17577f.class, c17577f);
    }

    private C17577f() {
    }

    /* renamed from: u */
    public static C17579b m50902u() {
        return zzl.m50986r();
    }

    /* renamed from: A */
    public final void m50907A(Iterable<? extends C17598n> iterable) {
        RJ8<C17598n> rj8 = this.zzk;
        if (!rj8.zza()) {
            this.zzk = AbstractC17554G.m50989o(rj8);
        }
        AbstractC17549C.m51017c(iterable, this.zzk);
    }

    /* renamed from: B */
    public final void m50906B(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* renamed from: D */
    public final void m50904D(long j) {
        this.zzc |= 32;
        this.zzj = j;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.f>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17577f> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17577f();
            case 2:
                return new C17579b(null);
            case 3:
                return AbstractC17554G.m50990n(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", EnumC17578a.m50896b(), "zzh", "zzi", "zzj", "zzk", C17598n.class});
            case 4:
                return zzl;
            case 5:
                TS8<C17577f> ts82 = zzm;
                TS8<C17577f> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17577f.class) {
                        TS8<C17577f> ts84 = zzm;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzl);
                            zzm = c17555a;
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
    public final void m50901v(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }
}
