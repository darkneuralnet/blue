package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.view.C11273b;
/* renamed from: m24  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44854m24 extends ST2 {

    /* renamed from: d */
    public static final PointF f97212d = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    public final C11273b f97213b;

    /* renamed from: c */
    public Matrix f97214c;

    public C44854m24(C11273b c11273b) {
        this.f97213b = c11273b;
    }

    @Override // p000.ST2
    /* renamed from: a */
    public PointF mo26459a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.f97214c;
            if (matrix == null) {
                return f97212d;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    /* renamed from: e */
    public void m26458e(Size size, int i) {
        O36.m92961a();
        synchronized (this) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                this.f97214c = this.f97213b.m68948b(size, i);
                return;
            }
            this.f97214c = null;
        }
    }
}
