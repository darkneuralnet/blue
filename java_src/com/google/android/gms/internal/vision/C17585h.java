package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.h */
/* loaded from: classes6.dex */
public final class C17585h extends AbstractC17554G<C17585h, C17586a> implements HQ8 {
    private static final C17585h zzj;
    private static volatile TS8<C17585h> zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.h$a */
    /* loaded from: classes6.dex */
    public static final class C17586a extends AbstractC17554G.AbstractC17556b<C17585h, C17586a> implements HQ8 {
        private C17586a() {
            super(C17585h.zzj);
        }

        public /* synthetic */ C17586a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17585h c17585h = new C17585h();
        zzj = c17585h;
        AbstractC17554G.m50988p(C17585h.class, c17585h);
    }

    private C17585h() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.h>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17585h> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17585h();
            case 2:
                return new C17586a(null);
            case 3:
                return AbstractC17554G.m50990n(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                TS8<C17585h> ts82 = zzk;
                TS8<C17585h> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17585h.class) {
                        TS8<C17585h> ts84 = zzk;
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
