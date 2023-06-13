package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.k */
/* loaded from: classes6.dex */
public final class C17592k extends AbstractC17554G<C17592k, C17593a> implements HQ8 {
    private static final C17592k zzj;
    private static volatile TS8<C17592k> zzk;
    private int zzc;
    private long zze;
    private C17566a zzf;
    private C17580g zzh;
    private C17568b zzi;
    private String zzd = "";
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    /* loaded from: classes6.dex */
    public static final class C17593a extends AbstractC17554G.AbstractC17556b<C17592k, C17593a> implements HQ8 {
        private C17593a() {
            super(C17592k.zzj);
        }

        public /* synthetic */ C17593a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17592k c17592k = new C17592k();
        zzj = c17592k;
        AbstractC17554G.m50988p(C17592k.class, c17592k);
    }

    private C17592k() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.k>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17592k> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17592k();
            case 2:
                return new C17593a(null);
            case 3:
                return AbstractC17554G.m50990n(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                TS8<C17592k> ts82 = zzk;
                TS8<C17592k> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17592k.class) {
                        TS8<C17592k> ts84 = zzk;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzj);
                            zzk = c17555a;
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
