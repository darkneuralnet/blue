package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.c */
/* loaded from: classes6.dex */
public final class C17570c extends AbstractC17554G<C17570c, C17571a> implements HQ8 {
    private static final C17570c zzg;
    private static volatile TS8<C17570c> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    /* renamed from: com.google.android.gms.internal.vision.c$a */
    /* loaded from: classes6.dex */
    public static final class C17571a extends AbstractC17554G.AbstractC17556b<C17570c, C17571a> implements HQ8 {
        private C17571a() {
            super(C17570c.zzg);
        }

        public /* synthetic */ C17571a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17570c c17570c = new C17570c();
        zzg = c17570c;
        AbstractC17554G.m50988p(C17570c.class, c17570c);
    }

    private C17570c() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.c>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17570c> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17570c();
            case 2:
                return new C17571a(null);
            case 3:
                return AbstractC17554G.m50990n(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", EnumC35293Ps8.m89661b(), "zze", EnumC35068Ot8.m91202b(), "zzf"});
            case 4:
                return zzg;
            case 5:
                TS8<C17570c> ts82 = zzh;
                TS8<C17570c> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17570c.class) {
                        TS8<C17570c> ts84 = zzh;
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
}
