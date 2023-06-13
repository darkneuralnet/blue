package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import java.io.IOException;
import p000.C40160e74;
/* renamed from: Y64 */
/* loaded from: classes.dex */
public final class Y64 implements InterfaceC37529Zh3<C40160e74.AbstractC19965b, MD3<InterfaceC11183i>> {
    /* renamed from: b */
    public static MD3<InterfaceC11183i> m75699b(C40753f74 c40753f74, C36357Uh1 c36357Uh1, InterfaceC11183i interfaceC11183i) {
        return MD3.m95564k(interfaceC11183i, c36357Uh1, c40753f74.m41991b(), c40753f74.m41988e(), c40753f74.m41987f(), m75697d(interfaceC11183i));
    }

    /* renamed from: c */
    public static MD3<InterfaceC11183i> m75698c(C40753f74 c40753f74, C36357Uh1 c36357Uh1, InterfaceC11183i interfaceC11183i) {
        Size size = new Size(interfaceC11183i.getWidth(), interfaceC11183i.getHeight());
        int m41988e = c40753f74.m41988e() - c36357Uh1.m81160s();
        Size m75696e = m75696e(m41988e, size);
        Matrix m19872c = C46705p96.m19872c(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, m75696e.getWidth(), m75696e.getHeight()), m41988e);
        return MD3.m95563l(interfaceC11183i, c36357Uh1, m75696e, m75695f(c40753f74.m41991b(), m19872c), c36357Uh1.m81160s(), m75694g(c40753f74.m41987f(), m19872c), m75697d(interfaceC11183i));
    }

    /* renamed from: d */
    public static InterfaceC51685xa0 m75697d(InterfaceC11183i interfaceC11183i) {
        return ((C52278ya0) interfaceC11183i.mo40428i1()).m3252d();
    }

    /* renamed from: e */
    public static Size m75696e(int i, Size size) {
        if (C46705p96.m19868g(C46705p96.m19856s(i))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    /* renamed from: f */
    public static Rect m75695f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: g */
    public static Matrix m75694g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public MD3<InterfaceC11183i> apply(C40160e74.AbstractC19965b abstractC19965b) throws ImageCaptureException {
        C36357Uh1 m81169j;
        InterfaceC11183i mo43248a = abstractC19965b.mo43248a();
        C40753f74 mo43247b = abstractC19965b.mo43247b();
        if (mo43248a.getFormat() == 256) {
            try {
                m81169j = C36357Uh1.m81169j(mo43248a);
                mo43248a.mo69480A0()[0].mo69476e().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            m81169j = null;
        }
        if (EX1.f7633g.m61030b(mo43248a)) {
            HZ3.m103730h(m81169j, "JPEG image must have exif.");
            return m75698c(mo43247b, m81169j, mo43248a);
        }
        return m75699b(mo43247b, m81169j, mo43248a);
    }
}
