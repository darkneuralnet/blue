package p000;
/* renamed from: vn4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50633vn4 {

    /* renamed from: a */
    public C52053yB0 f114661a;

    /* renamed from: b */
    public int f114662b = 0;

    /* renamed from: c */
    public boolean f114663c = false;

    public C50633vn4(C52053yB0 c52053yB0) {
        this.f114661a = c52053yB0;
    }

    /* renamed from: d */
    public static int m8032d(C52053yB0 c52053yB0, C52053yB0[] c52053yB0Arr) {
        C50633vn4 c50633vn4 = new C50633vn4(c52053yB0);
        for (int i = 1; i < c52053yB0Arr.length; i++) {
            c50633vn4.m8035a(c52053yB0Arr[i], c52053yB0Arr[i - 1]);
            if (c50633vn4.m8033c()) {
                return c50633vn4.m8034b();
            }
        }
        return c50633vn4.m8034b();
    }

    /* renamed from: a */
    public void m8035a(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        double d = c52053yB0.f118922b;
        C52053yB0 c52053yB03 = this.f114661a;
        double d2 = c52053yB03.f118922b;
        if (d < d2 && c52053yB02.f118922b < d2) {
            return;
        }
        double d3 = c52053yB02.f118922b;
        if (d2 == d3 && c52053yB03.f118923c == c52053yB02.f118923c) {
            this.f114663c = true;
            return;
        }
        double d4 = c52053yB0.f118923c;
        double d5 = c52053yB03.f118923c;
        if (d4 == d5 && c52053yB02.f118923c == d5) {
            if (d > d3) {
                d = d3;
                d3 = d;
            }
            if (d2 >= d && d2 <= d3) {
                this.f114663c = true;
            }
        } else if ((d4 > d5 && c52053yB02.f118923c <= d5) || (c52053yB02.f118923c > d5 && d4 <= d5)) {
            int m109571a = C32534Dy3.m109571a(c52053yB0, c52053yB02, c52053yB03);
            if (m109571a == 0) {
                this.f114663c = true;
                return;
            }
            if (c52053yB02.f118923c < c52053yB0.f118923c) {
                m109571a = -m109571a;
            }
            if (m109571a == 1) {
                this.f114662b++;
            }
        }
    }

    /* renamed from: b */
    public int m8034b() {
        if (this.f114663c) {
            return 1;
        }
        if (this.f114662b % 2 != 1) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public boolean m8033c() {
        return this.f114663c;
    }
}
