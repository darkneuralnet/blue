package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.i */
/* loaded from: classes6.dex */
public final class C17587i extends AbstractC17554G<C17587i, C17588a> implements HQ8 {
    private static final C17587i zzg;
    private static volatile TS8<C17587i> zzh;
    private int zzc;
    private C17589j zzd;
    private C17594l zze;
    private RJ8<C17577f> zzf = AbstractC17554G.m50984t();

    /* renamed from: com.google.android.gms.internal.vision.i$a */
    /* loaded from: classes6.dex */
    public static final class C17588a extends AbstractC17554G.AbstractC17556b<C17587i, C17588a> implements HQ8 {
        private C17588a() {
            super(C17587i.zzg);
        }

        /* renamed from: w */
        public final C17588a m50876w(C17589j c17589j) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17587i) this.f71224c).m50878y(c17589j);
            return this;
        }

        /* renamed from: y */
        public final C17588a m50875y(Iterable<? extends C17577f> iterable) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17587i) this.f71224c).m50877z(iterable);
            return this;
        }

        public /* synthetic */ C17588a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17587i c17587i = new C17587i();
        zzg = c17587i;
        AbstractC17554G.m50988p(C17587i.class, c17587i);
    }

    private C17587i() {
    }

    /* renamed from: u */
    public static C17588a m50881u() {
        return zzg.m50986r();
    }

    /* renamed from: B */
    public final void m50882B() {
        RJ8<C17577f> rj8 = this.zzf;
        if (!rj8.zza()) {
            this.zzf = AbstractC17554G.m50989o(rj8);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.i>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17587i> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17587i();
            case 2:
                return new C17588a(null);
            case 3:
                return AbstractC17554G.m50990n(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C17577f.class});
            case 4:
                return zzg;
            case 5:
                TS8<C17587i> ts82 = zzh;
                TS8<C17587i> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17587i.class) {
                        TS8<C17587i> ts84 = zzh;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzg);
                            zzh = c17555a;
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

    /* renamed from: y */
    public final void m50878y(C17589j c17589j) {
        c17589j.getClass();
        this.zzd = c17589j;
        this.zzc |= 1;
    }

    /* renamed from: z */
    public final void m50877z(Iterable<? extends C17577f> iterable) {
        m50882B();
        AbstractC17549C.m51017c(iterable, this.zzf);
    }
}
