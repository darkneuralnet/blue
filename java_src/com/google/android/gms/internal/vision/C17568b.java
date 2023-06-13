package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.b */
/* loaded from: classes6.dex */
public final class C17568b extends AbstractC17554G<C17568b, C17569a> implements HQ8 {
    private static final InterfaceC42647iJ8<Integer, EnumC35293Ps8> zzd = new C43473ji8();
    private static final C17568b zze;
    private static volatile TS8<C17568b> zzf;
    private InterfaceC49762uJ8 zzc = AbstractC17554G.m50985s();

    /* renamed from: com.google.android.gms.internal.vision.b$a */
    /* loaded from: classes6.dex */
    public static final class C17569a extends AbstractC17554G.AbstractC17556b<C17568b, C17569a> implements HQ8 {
        private C17569a() {
            super(C17568b.zze);
        }

        public /* synthetic */ C17569a(C17602p c17602p) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ji8, iJ8<java.lang.Integer, Ps8>] */
    static {
        C17568b c17568b = new C17568b();
        zze = c17568b;
        AbstractC17554G.m50988p(C17568b.class, c17568b);
    }

    private C17568b() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.b>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17568b> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17568b();
            case 2:
                return new C17569a(null);
            case 3:
                return AbstractC17554G.m50990n(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", EnumC35293Ps8.m89661b()});
            case 4:
                return zze;
            case 5:
                TS8<C17568b> ts82 = zzf;
                TS8<C17568b> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17568b.class) {
                        TS8<C17568b> ts84 = zzf;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zze);
                            zzf = c17555a;
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
