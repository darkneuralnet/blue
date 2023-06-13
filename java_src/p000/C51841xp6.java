package p000;

import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: xp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51841xp6 {

    /* renamed from: a */
    public final InterfaceC45469n46 f118191a;

    /* renamed from: b */
    public long f118192b = -1;

    /* renamed from: c */
    public EnumC47841r46 f118193c;

    /* renamed from: xp6$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C30319a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f118194a;

        static {
            int[] iArr = new int[EnumC47841r46.values().length];
            f118194a = iArr;
            try {
                iArr[EnumC47841r46.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118194a[EnumC47841r46.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C51841xp6(InterfaceC45469n46 interfaceC45469n46, EnumC47841r46 enumC47841r46) {
        this.f118191a = interfaceC45469n46;
        this.f118193c = enumC47841r46;
    }

    /* renamed from: a */
    public final long m4588a() {
        long j = LongCompanionObject.MAX_VALUE;
        long j2 = 0;
        for (int i = 0; i < 3; i++) {
            long mo24489b = this.f118191a.mo24489b();
            long mo24490a = this.f118191a.mo24490a();
            long mo24489b2 = this.f118191a.mo24489b();
            long j3 = mo24489b2 - mo24489b;
            if (i == 0 || j3 < j) {
                j2 = mo24490a - ((mo24489b + mo24489b2) >> 1);
                j = j3;
            }
        }
        return Math.max(0L, j2);
    }

    /* renamed from: b */
    public long m4587b(long j) {
        if (this.f118193c == null) {
            if (m4586c(j)) {
                C33928Jx2.m99522l("VideoTimebaseConverter", "Detected video buffer timestamp is close to realtime.");
                this.f118193c = EnumC47841r46.REALTIME;
            } else {
                this.f118193c = EnumC47841r46.UPTIME;
            }
        }
        int i = C30319a.f118194a[this.f118193c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return j;
            }
            throw new AssertionError("Unknown timebase: " + this.f118193c);
        }
        if (this.f118192b == -1) {
            this.f118192b = m4588a();
        }
        return j - this.f118192b;
    }

    /* renamed from: c */
    public final boolean m4586c(long j) {
        if (Math.abs(j - this.f118191a.mo24490a()) < Math.abs(j - this.f118191a.mo24489b())) {
            return true;
        }
        return false;
    }
}
