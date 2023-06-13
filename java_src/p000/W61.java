package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* renamed from: W61 */
/* loaded from: classes5.dex */
public final class W61 {

    /* renamed from: a */
    public static final InterfaceC20044eU f40414a = new C8934a();

    /* renamed from: W61$a */
    /* loaded from: classes5.dex */
    public class C8934a extends C20426fU {
        @Override // p000.C20426fU, p000.InterfaceC20044eU
        /* renamed from: c */
        public void mo16193c(Bitmap bitmap) {
        }
    }

    private W61() {
    }

    /* renamed from: a */
    public static VL4<Bitmap> m78831a(InterfaceC20044eU interfaceC20044eU, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m78830b(interfaceC20044eU, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            interfaceC20044eU = f40414a;
        }
        return C20872gU.m39360f(bitmap, interfaceC20044eU);
    }

    /* renamed from: b */
    public static Bitmap m78830b(InterfaceC20044eU interfaceC20044eU, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock m12986f = C49076t96.m12986f();
            m12986f.lock();
            Bitmap mo16192d = interfaceC20044eU.mo16192d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(mo16192d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return mo16192d;
            } finally {
                m12986f.unlock();
            }
        }
    }
}
