package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C11213q;
import p000.C43385ja0;
/* renamed from: b24  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38314b24 {

    /* renamed from: a */
    public static final Rational f56812a = new Rational(16, 9);

    private C38314b24() {
    }

    /* renamed from: a */
    public static boolean m65086a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    /* renamed from: b */
    public static void m65085b(Size size, C11213q.C11215b c11215b) {
        if (((C38907c24) S21.m86079a(C38907c24.class)) == null || m65086a(size, f56812a)) {
            return;
        }
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        c24930a.m30298e(CaptureRequest.TONEMAP_MODE, 2);
        c11215b.m69337g(c24930a.m30300a());
    }
}
