package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.d */
/* loaded from: classes6.dex */
public final class C17572d extends AbstractC17554G<C17572d, C17573a> implements HQ8 {
    private static final C17572d zzd;
    private static volatile TS8<C17572d> zze;
    private RJ8<C17596m> zzc = AbstractC17554G.m50984t();

    /* renamed from: com.google.android.gms.internal.vision.d$a */
    /* loaded from: classes6.dex */
    public static final class C17573a extends AbstractC17554G.AbstractC17556b<C17572d, C17573a> implements HQ8 {
        private C17573a() {
            super(C17572d.zzd);
        }

        public /* synthetic */ C17573a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17572d c17572d = new C17572d();
        zzd = c17572d;
        AbstractC17554G.m50988p(C17572d.class, c17572d);
    }

    private C17572d() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.d>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17572d> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17572d();
            case 2:
                return new C17573a(null);
            case 3:
                return AbstractC17554G.m50990n(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C17596m.class});
            case 4:
                return zzd;
            case 5:
                TS8<C17572d> ts82 = zze;
                TS8<C17572d> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17572d.class) {
                        TS8<C17572d> ts84 = zze;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzd);
                            zze = c17555a;
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
