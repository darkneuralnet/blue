package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.internal.Constants;
/* renamed from: uB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49683uB1 {

    /* renamed from: h */
    public static final C49683uB1 f111914h = new C49683uB1(4201, 4096, 1);

    /* renamed from: i */
    public static final C49683uB1 f111915i = new C49683uB1(1033, 1024, 1);

    /* renamed from: j */
    public static final C49683uB1 f111916j;

    /* renamed from: k */
    public static final C49683uB1 f111917k;

    /* renamed from: l */
    public static final C49683uB1 f111918l;

    /* renamed from: m */
    public static final C49683uB1 f111919m;

    /* renamed from: n */
    public static final C49683uB1 f111920n;

    /* renamed from: o */
    public static final C49683uB1 f111921o;

    /* renamed from: a */
    public final int[] f111922a;

    /* renamed from: b */
    public final int[] f111923b;

    /* renamed from: c */
    public final C50275vB1 f111924c;

    /* renamed from: d */
    public final C50275vB1 f111925d;

    /* renamed from: e */
    public final int f111926e;

    /* renamed from: f */
    public final int f111927f;

    /* renamed from: g */
    public final int f111928g;

    static {
        C49683uB1 c49683uB1 = new C49683uB1(67, 64, 1);
        f111916j = c49683uB1;
        f111917k = new C49683uB1(19, 16, 1);
        f111918l = new C49683uB1(285, 256, 0);
        C49683uB1 c49683uB12 = new C49683uB1(Constants.BUCKET_REDIRECT_STATUS_CODE, 256, 1);
        f111919m = c49683uB12;
        f111920n = c49683uB12;
        f111921o = c49683uB1;
    }

    public C49683uB1(int i, int i2, int i3) {
        this.f111927f = i;
        this.f111926e = i2;
        this.f111928g = i3;
        this.f111922a = new int[i2];
        this.f111923b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f111922a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f111923b[this.f111922a[i6]] = i6;
        }
        this.f111924c = new C50275vB1(this, new int[]{0});
        this.f111925d = new C50275vB1(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m10685a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public C50275vB1 m10684b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f111924c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C50275vB1(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m10683c(int i) {
        return this.f111922a[i];
    }

    /* renamed from: d */
    public int m10682d() {
        return this.f111928g;
    }

    /* renamed from: e */
    public C50275vB1 m10681e() {
        return this.f111925d;
    }

    /* renamed from: f */
    public int m10680f() {
        return this.f111926e;
    }

    /* renamed from: g */
    public C50275vB1 m10679g() {
        return this.f111924c;
    }

    /* renamed from: h */
    public int m10678h(int i) {
        if (i != 0) {
            return this.f111922a[(this.f111926e - this.f111923b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public int m10677i(int i) {
        if (i != 0) {
            return this.f111923b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public int m10676j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f111922a;
        int[] iArr2 = this.f111923b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f111926e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f111927f) + CoreConstants.COMMA_CHAR + this.f111926e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
