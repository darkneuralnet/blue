package p000;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: Eh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC32615Eh3 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f7948b;

    /* renamed from: c */
    public ViewTreeObserver f7949c;

    /* renamed from: d */
    public final Runnable f7950d;

    public ViewTreeObserver$OnPreDrawListenerC32615Eh3(View view, Runnable runnable) {
        this.f7948b = view;
        this.f7949c = view.getViewTreeObserver();
        this.f7950d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC32615Eh3 m108576a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC32615Eh3 viewTreeObserver$OnPreDrawListenerC32615Eh3 = new ViewTreeObserver$OnPreDrawListenerC32615Eh3(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC32615Eh3);
                view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC32615Eh3);
                return viewTreeObserver$OnPreDrawListenerC32615Eh3;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m108575b() {
        if (this.f7949c.isAlive()) {
            this.f7949c.removeOnPreDrawListener(this);
        } else {
            this.f7948b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f7948b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m108575b();
        this.f7950d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f7949c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m108575b();
    }
}
