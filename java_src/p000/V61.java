package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* renamed from: V61 */
/* loaded from: classes5.dex */
public abstract class V61<T extends Drawable> implements VL4<T>, InterfaceC50187v22 {

    /* renamed from: b */
    public final T f38640b;

    public V61(T t) {
        this.f38640b = (T) C52865zZ3.m1111d(t);
    }

    /* renamed from: c */
    public void mo5711c() {
        T t = this.f38640b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C49692uC1) {
            ((C49692uC1) t).m10657e().prepareToDraw();
        }
    }

    @Override // p000.VL4
    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.f38640b.getConstantState();
        if (constantState == null) {
            return this.f38640b;
        }
        return (T) constantState.newDrawable();
    }
}
