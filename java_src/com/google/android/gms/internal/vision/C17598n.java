package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.n */
/* loaded from: classes6.dex */
public final class C17598n extends AbstractC17554G<C17598n, C17599a> implements HQ8 {
    private static final C17598n zzh;
    private static volatile TS8<C17598n> zzi;
    private int zzc;
    private C17572d zzd;
    private int zze;
    private C17585h zzf;
    private C17570c zzg;

    /* renamed from: com.google.android.gms.internal.vision.n$a */
    /* loaded from: classes6.dex */
    public static final class C17599a extends AbstractC17554G.AbstractC17556b<C17598n, C17599a> implements HQ8 {
        private C17599a() {
            super(C17598n.zzh);
        }

        public /* synthetic */ C17599a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17598n c17598n = new C17598n();
        zzh = c17598n;
        AbstractC17554G.m50988p(C17598n.class, c17598n);
    }

    private C17598n() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.n>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17598n> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17598n();
            case 2:
                return new C17599a(null);
            case 3:
                return AbstractC17554G.m50990n(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                TS8<C17598n> ts82 = zzi;
                TS8<C17598n> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17598n.class) {
                        TS8<C17598n> ts84 = zzi;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzh);
                            zzi = c17555a;
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
}
