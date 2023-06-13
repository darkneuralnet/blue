package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import kotlin.text.Typography;
/* renamed from: com.google.android.gms.internal.vision.e */
/* loaded from: classes6.dex */
public final class C17574e extends AbstractC17554G<C17574e, C17575a> implements HQ8 {
    private static final C17574e zzl;
    private static volatile TS8<C17574e> zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    /* renamed from: com.google.android.gms.internal.vision.e$a */
    /* loaded from: classes6.dex */
    public static final class C17575a extends AbstractC17554G.AbstractC17556b<C17574e, C17575a> implements HQ8 {
        private C17575a() {
            super(C17574e.zzl);
        }

        public /* synthetic */ C17575a(C17602p c17602p) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.e$b */
    /* loaded from: classes6.dex */
    public enum EnumC17576b implements InterfaceC45010mI8 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);
        

        /* renamed from: g */
        public static final WI8<EnumC17576b> f71266g = new C17603q();

        /* renamed from: b */
        public final int f71268b;

        EnumC17576b(int i) {
            this.f71268b = i;
        }

        /* renamed from: a */
        public static EnumC17576b m50909a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return REASON_INVALID;
                    }
                    return REASON_UPGRADE;
                }
                return REASON_MISSING;
            }
            return REASON_UNKNOWN;
        }

        /* renamed from: b */
        public static KI8 m50908b() {
            return C17604r.f71304a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + EnumC17576b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f71268b + " name=" + name() + Typography.greater;
        }

        @Override // p000.InterfaceC45010mI8
        public final int zza() {
            return this.f71268b;
        }
    }

    static {
        C17574e c17574e = new C17574e();
        zzl = c17574e;
        AbstractC17554G.m50988p(C17574e.class, c17574e);
    }

    private C17574e() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.e>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17574e> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17574e();
            case 2:
                return new C17575a(null);
            case 3:
                return AbstractC17554G.m50990n(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", EnumC17576b.m50908b(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                TS8<C17574e> ts82 = zzm;
                TS8<C17574e> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17574e.class) {
                        TS8<C17574e> ts84 = zzm;
                        ts8 = ts84;
                        if (ts84 == null) {
                            ?? c17555a = new AbstractC17554G.C17555a(zzl);
                            zzm = c17555a;
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
