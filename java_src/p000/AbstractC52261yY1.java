package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p000.G96;
/* renamed from: yY1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52261yY1<Z> extends AbstractC33662It6<ImageView, Z> implements G96.InterfaceC2677a {

    /* renamed from: j */
    public Animatable f119699j;

    public AbstractC52261yY1(ImageView imageView) {
        super(imageView);
    }

    @Override // p000.G96.InterfaceC2677a
    /* renamed from: a */
    public Drawable mo3345a() {
        return ((ImageView) this.f16388c).getDrawable();
    }

    @Override // p000.G96.InterfaceC2677a
    /* renamed from: b */
    public void mo3344b(Drawable drawable) {
        ((ImageView) this.f16388c).setImageDrawable(drawable);
    }

    /* renamed from: g */
    public final void m3343g(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f119699j = animatable;
            animatable.start();
            return;
        }
        this.f119699j = null;
    }

    /* renamed from: h */
    public abstract void mo3342h(Z z);

    /* renamed from: i */
    public final void m3341i(Z z) {
        mo3342h(z);
        m3343g(z);
    }

    @Override // p000.AbstractC33662It6, p000.AbstractC28661tE, p000.LY5
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f119699j;
        if (animatable != null) {
            animatable.stop();
        }
        m3341i(null);
        mo3344b(drawable);
    }

    @Override // p000.AbstractC28661tE, p000.LY5
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m3341i(null);
        mo3344b(drawable);
    }

    @Override // p000.AbstractC33662It6, p000.AbstractC28661tE, p000.LY5
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m3341i(null);
        mo3344b(drawable);
    }

    @Override // p000.LY5
    public void onResourceReady(Z z, G96<? super Z> g96) {
        if (g96 != null && g96.mo87323a(z, this)) {
            m3343g(z);
        } else {
            m3341i(z);
        }
    }

    @Override // p000.AbstractC28661tE, p000.InterfaceC32227Cq2
    public void onStart() {
        Animatable animatable = this.f119699j;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p000.AbstractC28661tE, p000.InterfaceC32227Cq2
    public void onStop() {
        Animatable animatable = this.f119699j;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
