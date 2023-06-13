package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
/* renamed from: com.google.android.gms.internal.vision.a */
/* loaded from: classes6.dex */
public final class C17566a extends AbstractC17554G<C17566a, C17567a> implements HQ8 {
    private static final C17566a zzf;
    private static volatile TS8<C17566a> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.vision.a$a */
    /* loaded from: classes6.dex */
    public static final class C17567a extends AbstractC17554G.AbstractC17556b<C17566a, C17567a> implements HQ8 {
        private C17567a() {
            super(C17566a.zzf);
        }

        /* renamed from: w */
        public final C17567a m50915w(String str) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17566a) this.f71224c).m50918w(str);
            return this;
        }

        /* renamed from: y */
        public final C17567a m50914y(String str) {
            if (this.f71225d) {
                m50974q();
                this.f71225d = false;
            }
            ((C17566a) this.f71224c).m50921A(str);
            return this;
        }

        public /* synthetic */ C17567a(C17602p c17602p) {
            this();
        }
    }

    static {
        C17566a c17566a = new C17566a();
        zzf = c17566a;
        AbstractC17554G.m50988p(C17566a.class, c17566a);
    }

    private C17566a() {
    }

    /* renamed from: u */
    public static C17567a m50920u() {
        return zzf.m50986r();
    }

    /* renamed from: A */
    public final void m50921A(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.a>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17566a> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17566a();
            case 2:
                return new C17567a(null);
            case 3:
                return AbstractC17554G.m50990n(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                TS8<C17566a> ts82 = zzg;
                TS8<C17566a> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17566a.class) {
                        TS8<C17566a> ts84 = zzg;
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

    /* renamed from: w */
    public final void m50918w(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }
}
