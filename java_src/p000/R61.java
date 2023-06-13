package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p000.G96;
/* renamed from: R61 */
/* loaded from: classes5.dex */
public class R61 implements G96<Drawable> {

    /* renamed from: a */
    public final int f31524a;

    /* renamed from: b */
    public final boolean f31525b;

    public R61(int i, boolean z) {
        this.f31524a = i;
        this.f31525b = z;
    }

    @Override // p000.G96
    /* renamed from: b */
    public boolean mo87323a(Drawable drawable, G96.InterfaceC2677a interfaceC2677a) {
        Drawable mo3345a = interfaceC2677a.mo3345a();
        if (mo3345a == null) {
            mo3345a = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mo3345a, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f31525b);
        transitionDrawable.startTransition(this.f31524a);
        interfaceC2677a.mo3344b(transitionDrawable);
        return true;
    }
}
