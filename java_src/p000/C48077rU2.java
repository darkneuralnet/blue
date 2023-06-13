package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* renamed from: rU2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48077rU2 {

    /* renamed from: a */
    public static final PointF f107126a = new PointF();

    /* renamed from: a */
    public static PointF m15919a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m15918b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m15917c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: d */
    public static boolean m15916d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: e */
    public static int m15915e(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            return i3 - 1;
        }
        return i3;
    }

    /* renamed from: f */
    public static int m15914f(float f, float f2) {
        return m15913g((int) f, (int) f2);
    }

    /* renamed from: g */
    public static int m15913g(int i, int i2) {
        return i - (i2 * m15915e(i, i2));
    }

    /* renamed from: h */
    public static void m15912h(C45409my5 c45409my5, Path path) {
        path.reset();
        PointF m24605b = c45409my5.m24605b();
        path.moveTo(m24605b.x, m24605b.y);
        f107126a.set(m24605b.x, m24605b.y);
        for (int i = 0; i < c45409my5.m24606a().size(); i++) {
            VE0 ve0 = c45409my5.m24606a().get(i);
            PointF m80181a = ve0.m80181a();
            PointF m80180b = ve0.m80180b();
            PointF m80179c = ve0.m80179c();
            PointF pointF = f107126a;
            if (m80181a.equals(pointF) && m80180b.equals(m80179c)) {
                path.lineTo(m80179c.x, m80179c.y);
            } else {
                path.cubicTo(m80181a.x, m80181a.y, m80180b.x, m80180b.y, m80179c.x, m80179c.y);
            }
            pointF.set(m80179c.x, m80179c.y);
        }
        if (c45409my5.m24603d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static float m15911i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: j */
    public static int m15910j(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: k */
    public static void m15909k(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22, InterfaceC32407Dk2 interfaceC32407Dk2) {
        if (c31939Bk2.m113547c(interfaceC32407Dk2.getName(), i)) {
            list.add(c31939Bk22.m113549a(interfaceC32407Dk2.getName()).m113541i(interfaceC32407Dk2));
        }
    }
}
