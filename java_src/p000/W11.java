package p000;

import java.util.Formatter;
/* renamed from: W11 */
/* loaded from: classes6.dex */
public class W11 {

    /* renamed from: a */
    public final C50758w00 f40257a;

    /* renamed from: b */
    public final C36158Tl0[] f40258b;

    public W11(C50758w00 c50758w00) {
        this.f40257a = new C50758w00(c50758w00);
        this.f40258b = new C36158Tl0[(c50758w00.m7579e() - c50758w00.m7577g()) + 1];
    }

    /* renamed from: a */
    public final C50758w00 m78931a() {
        return this.f40257a;
    }

    /* renamed from: b */
    public final C36158Tl0 m78930b(int i) {
        return this.f40258b[m78927e(i)];
    }

    /* renamed from: c */
    public final C36158Tl0 m78929c(int i) {
        C36158Tl0 c36158Tl0;
        C36158Tl0 c36158Tl02;
        C36158Tl0 m78930b = m78930b(i);
        if (m78930b != null) {
            return m78930b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int m78927e = m78927e(i) - i2;
            if (m78927e >= 0 && (c36158Tl02 = this.f40258b[m78927e]) != null) {
                return c36158Tl02;
            }
            int m78927e2 = m78927e(i) + i2;
            C36158Tl0[] c36158Tl0Arr = this.f40258b;
            if (m78927e2 < c36158Tl0Arr.length && (c36158Tl0 = c36158Tl0Arr[m78927e2]) != null) {
                return c36158Tl0;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C36158Tl0[] m78928d() {
        return this.f40258b;
    }

    /* renamed from: e */
    public final int m78927e(int i) {
        return i - this.f40257a.m7577g();
    }

    /* renamed from: f */
    public final void m78926f(int i, C36158Tl0 c36158Tl0) {
        this.f40258b[m78927e(i)] = c36158Tl0;
    }

    public String toString() {
        C36158Tl0[] c36158Tl0Arr;
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (C36158Tl0 c36158Tl0 : this.f40258b) {
                if (c36158Tl0 == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(c36158Tl0.m83011c()), Integer.valueOf(c36158Tl0.m83009e()));
                    i++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
