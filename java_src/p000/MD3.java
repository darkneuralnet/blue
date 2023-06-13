package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC11183i;
/* renamed from: MD3 */
/* loaded from: classes.dex */
public abstract class MD3<T> {
    /* renamed from: j */
    public static MD3<Bitmap> m95565j(Bitmap bitmap, C36357Uh1 c36357Uh1, Rect rect, int i, Matrix matrix, InterfaceC51685xa0 interfaceC51685xa0) {
        return new C8490Ut(bitmap, c36357Uh1, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, interfaceC51685xa0);
    }

    /* renamed from: k */
    public static MD3<InterfaceC11183i> m95564k(InterfaceC11183i interfaceC11183i, C36357Uh1 c36357Uh1, Rect rect, int i, Matrix matrix, InterfaceC51685xa0 interfaceC51685xa0) {
        return m95563l(interfaceC11183i, c36357Uh1, new Size(interfaceC11183i.getWidth(), interfaceC11183i.getHeight()), rect, i, matrix, interfaceC51685xa0);
    }

    /* renamed from: l */
    public static MD3<InterfaceC11183i> m95563l(InterfaceC11183i interfaceC11183i, C36357Uh1 c36357Uh1, Size size, Rect rect, int i, Matrix matrix, InterfaceC51685xa0 interfaceC51685xa0) {
        if (interfaceC11183i.getFormat() == 256) {
            HZ3.m103730h(c36357Uh1, "JPEG image must have Exif.");
        }
        return new C8490Ut(interfaceC11183i, c36357Uh1, interfaceC11183i.getFormat(), size, rect, i, matrix, interfaceC51685xa0);
    }

    /* renamed from: m */
    public static MD3<byte[]> m95562m(byte[] bArr, C36357Uh1 c36357Uh1, int i, Size size, Rect rect, int i2, Matrix matrix, InterfaceC51685xa0 interfaceC51685xa0) {
        return new C8490Ut(bArr, c36357Uh1, i, size, rect, i2, matrix, interfaceC51685xa0);
    }

    /* renamed from: a */
    public abstract InterfaceC51685xa0 mo80668a();

    /* renamed from: b */
    public abstract Rect mo80667b();

    /* renamed from: c */
    public abstract T mo80666c();

    /* renamed from: d */
    public abstract C36357Uh1 mo80665d();

    /* renamed from: e */
    public abstract int mo80664e();

    /* renamed from: f */
    public abstract int mo80663f();

    /* renamed from: g */
    public abstract Matrix mo80662g();

    /* renamed from: h */
    public abstract Size mo80661h();

    /* renamed from: i */
    public boolean m95566i() {
        return C46705p96.m19869f(mo80667b(), mo80661h());
    }
}
