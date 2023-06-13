package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.o */
/* loaded from: classes6.dex */
public final class C17600o extends AbstractC17554G<C17600o, C17601a> implements HQ8 {
    private static final C17600o zzi;
    private static volatile TS8<C17600o> zzj;
    private int zzc;
    private C17574e zzd;
    private C17592k zze;
    private C17587i zzf;
    private int zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.vision.o$a */
    /* loaded from: classes6.dex */
    public static final class C17601a extends AbstractC17554G.AbstractC17556b<C17600o, C17601a> implements HQ8 {
        private C17601a() {
            super(C17600o.zzi);
        }

        /* renamed from: w */
        public final C17601a m50849w(C17587i c17587i) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17600o) this.f71224c).m50852v(c17587i);
            return this;
        }

        public /* synthetic */ C17601a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17600o c17600o = new C17600o();
        zzi = c17600o;
        AbstractC17554G.m50988p(C17600o.class, c17600o);
    }

    private C17600o() {
    }

    /* renamed from: u */
    public static C17601a m50853u() {
        return zzi.m50986r();
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.o>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17600o> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17600o();
            case 2:
                return new C17601a(null);
            case 3:
                return AbstractC17554G.m50990n(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                TS8<C17600o> ts82 = zzj;
                TS8<C17600o> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17600o.class) {
                        TS8<C17600o> ts84 = zzj;
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
    public final void m50852v(C17587i c17587i) {
        c17587i.getClass();
        this.zzf = c17587i;
        this.zzc |= 4;
    }
}
