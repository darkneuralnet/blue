package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
/* renamed from: Jk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33811Jk2 {

    /* renamed from: a */
    public final C34045Kk2 f18114a;

    /* renamed from: Jk2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C4219a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18115a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f18116b;

        static {
            int[] iArr = new int[EnumC4220b.values().length];
            f18116b = iArr;
            try {
                iArr[EnumC4220b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18116b[EnumC4220b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18116b[EnumC4220b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18116b[EnumC4220b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC40189eA3.values().length];
            f18115a = iArr2;
            try {
                iArr2[EnumC40189eA3.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18115a[EnumC40189eA3.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18115a[EnumC40189eA3.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18115a[EnumC40189eA3.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: Jk2$b */
    /* loaded from: classes6.dex */
    public enum EnumC4220b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public C33811Jk2(C34045Kk2 c34045Kk2) {
        this.f18114a = c34045Kk2;
    }

    /* renamed from: a */
    public static C33811Jk2 m99873a(String str, byte[] bArr, EnumC4220b enumC4220b) {
        return new C33811Jk2(C34045Kk2.m98328N().m98322z(str).m98324A(AbstractC18199g.m47699f(bArr)).m98323y(m99871c(enumC4220b)).build());
    }

    /* renamed from: c */
    public static EnumC40189eA3 m99871c(EnumC4220b enumC4220b) {
        int i = C4219a.f18116b[enumC4220b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC40189eA3.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return EnumC40189eA3.RAW;
            }
            return EnumC40189eA3.LEGACY;
        }
        return EnumC40189eA3.TINK;
    }

    /* renamed from: b */
    public C34045Kk2 m99872b() {
        return this.f18114a;
    }
}
