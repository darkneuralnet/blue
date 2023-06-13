package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import kotlin.text.Typography;
/* renamed from: com.google.android.gms.internal.vision.g */
/* loaded from: classes6.dex */
public final class C17580g extends AbstractC17554G<C17580g, C17581a> implements HQ8 {
    private static final C17580g zzj;
    private static volatile TS8<C17580g> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.g$a */
    /* loaded from: classes6.dex */
    public static final class C17581a extends AbstractC17554G.AbstractC17556b<C17580g, C17581a> implements HQ8 {
        private C17581a() {
            super(C17580g.zzj);
        }

        public /* synthetic */ C17581a(C17602p c17602p) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.g$b */
    /* loaded from: classes6.dex */
    public enum EnumC17582b implements InterfaceC45010mI8 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);
        

        /* renamed from: f */
        public static final WI8<EnumC17582b> f71279f = new C17607u();

        /* renamed from: b */
        public final int f71281b;

        EnumC17582b(int i) {
            this.f71281b = i;
        }

        /* renamed from: a */
        public static EnumC17582b m50890a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return CLASSIFICATION_ALL;
                }
                return CLASSIFICATION_NONE;
            }
            return CLASSIFICATION_UNKNOWN;
        }

        /* renamed from: b */
        public static KI8 m50889b() {
            return C17608v.f71306a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + EnumC17582b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f71281b + " name=" + name() + Typography.greater;
        }

        @Override // p000.InterfaceC45010mI8
        public final int zza() {
            return this.f71281b;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.g$c */
    /* loaded from: classes6.dex */
    public enum EnumC17583c implements InterfaceC45010mI8 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);
        

        /* renamed from: g */
        public static final WI8<EnumC17583c> f71286g = new C17610x();

        /* renamed from: b */
        public final int f71288b;

        EnumC17583c(int i) {
            this.f71288b = i;
        }

        /* renamed from: a */
        public static EnumC17583c m50888a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return LANDMARK_CONTOUR;
                    }
                    return LANDMARK_ALL;
                }
                return LANDMARK_NONE;
            }
            return LANDMARK_UNKNOWN;
        }

        /* renamed from: b */
        public static KI8 m50887b() {
            return C17609w.f71307a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + EnumC17583c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f71288b + " name=" + name() + Typography.greater;
        }

        @Override // p000.InterfaceC45010mI8
        public final int zza() {
            return this.f71288b;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.g$d */
    /* loaded from: classes6.dex */
    public enum EnumC17584d implements InterfaceC45010mI8 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);
        

        /* renamed from: g */
        public static final WI8<EnumC17584d> f71293g = new C17611y();

        /* renamed from: b */
        public final int f71295b;

        EnumC17584d(int i) {
            this.f71295b = i;
        }

        /* renamed from: a */
        public static EnumC17584d m50886a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return MODE_SELFIE;
                    }
                    return MODE_FAST;
                }
                return MODE_ACCURATE;
            }
            return MODE_UNKNOWN;
        }

        /* renamed from: b */
        public static KI8 m50885b() {
            return C17612z.f71308a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + EnumC17584d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f71295b + " name=" + name() + Typography.greater;
        }

        @Override // p000.InterfaceC45010mI8
        public final int zza() {
            return this.f71295b;
        }
    }

    static {
        C17580g c17580g = new C17580g();
        zzj = c17580g;
        AbstractC17554G.m50988p(C17580g.class, c17580g);
    }

    private C17580g() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.G$a, TS8<com.google.android.gms.internal.vision.g>] */
    @Override // com.google.android.gms.internal.vision.AbstractC17554G
    /* renamed from: l */
    public final Object mo50854l(int i, Object obj, Object obj2) {
        TS8<C17580g> ts8;
        switch (C17602p.f71303a[i - 1]) {
            case 1:
                return new C17580g();
            case 2:
                return new C17581a(null);
            case 3:
                return AbstractC17554G.m50990n(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", EnumC17584d.m50885b(), "zze", EnumC17583c.m50887b(), "zzf", EnumC17582b.m50889b(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                TS8<C17580g> ts82 = zzk;
                TS8<C17580g> ts83 = ts82;
                if (ts82 == null) {
                    synchronized (C17580g.class) {
                        TS8<C17580g> ts84 = zzk;
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
