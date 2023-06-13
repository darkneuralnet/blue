package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.l */
/* loaded from: classes6.dex */
public final class C17594l extends AbstractC17554G<C17594l, C17595a> implements HQ8 {
    private static final C17594l zzf;
    private static volatile TS8<C17594l> zzg;
    private int zzc;
    private long zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.vision.l$a */
    /* loaded from: classes6.dex */
    public static final class C17595a extends AbstractC17554G.AbstractC17556b<C17594l, C17595a> implements HQ8 {
        private C17595a() {
            super(C17594l.zzf);
        }

        public /* synthetic */ C17595a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17594l c17594l = new C17594l();
        zzf = c17594l;
        AbstractC17554G.m50988p(C17594l.class, c17594l);
    }

    private C17594l() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.l>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17594l> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17594l();
            case 2:
                return new C17595a(null);
            case 3:
                return AbstractC17554G.m50990n(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                TS8<C17594l> ts82 = zzg;
                TS8<C17594l> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17594l.class) {
                        TS8<C17594l> ts84 = zzg;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzf);
                            zzg = c17555a;
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
