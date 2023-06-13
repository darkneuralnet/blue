package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
/* renamed from: QM2 */
/* loaded from: classes6.dex */
public class QM2 {
    private QM2() {
    }

    /* renamed from: a */
    public static QC0 m88643a(int i) {
        if (i != 0) {
            if (i != 1) {
                return m88642b();
            }
            return new EF0();
        }
        return new C39853dc5();
    }

    /* renamed from: b */
    public static QC0 m88642b() {
        return new C39853dc5();
    }

    /* renamed from: c */
    public static L91 m88641c() {
        return new L91();
    }

    /* renamed from: d */
    public static void m88640d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof PM2) {
            ((PM2) background).m90417Z(f);
        }
    }

    /* renamed from: e */
    public static void m88639e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof PM2) {
            m88638f(view, (PM2) background);
        }
    }

    /* renamed from: f */
    public static void m88638f(View view, PM2 pm2) {
        if (pm2.m90425R()) {
            pm2.m90408e0(C36704Vt6.m79297k(view));
        }
    }
}
