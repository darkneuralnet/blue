package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.m */
/* loaded from: classes6.dex */
public final class C17596m extends AbstractC17554G<C17596m, C17597a> implements HQ8 {
    private static final C17596m zzf;
    private static volatile TS8<C17596m> zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.vision.m$a */
    /* loaded from: classes6.dex */
    public static final class C17597a extends AbstractC17554G.AbstractC17556b<C17596m, C17597a> implements HQ8 {
        private C17597a() {
            super(C17596m.zzf);
        }

        public /* synthetic */ C17597a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17596m c17596m = new C17596m();
        zzf = c17596m;
        AbstractC17554G.m50988p(C17596m.class, c17596m);
    }

    private C17596m() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.m>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17596m> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17596m();
            case 2:
                return new C17597a(null);
            case 3:
                return AbstractC17554G.m50990n(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                TS8<C17596m> ts82 = zzg;
                TS8<C17596m> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17596m.class) {
                        TS8<C17596m> ts84 = zzg;
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
