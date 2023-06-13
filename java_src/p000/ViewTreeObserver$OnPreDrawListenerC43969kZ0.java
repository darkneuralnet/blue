package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* renamed from: kZ0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ViewTreeObserver$OnPreDrawListenerC43969kZ0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final FI4 f94496b;

    /* renamed from: c */
    public final WeakReference<ImageView> f94497c;

    /* renamed from: d */
    public I80 f94498d;

    public ViewTreeObserver$OnPreDrawListenerC43969kZ0(FI4 fi4, ImageView imageView, I80 i80) {
        this.f94496b = fi4;
        this.f94497c = new WeakReference<>(imageView);
        this.f94498d = i80;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* renamed from: a */
    public void m28836a() {
        this.f94496b.m107345b();
        this.f94498d = null;
        ImageView imageView = this.f94497c.get();
        if (imageView == null) {
            return;
        }
        this.f94497c.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f94497c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f94497c.clear();
            this.f94496b.m107334m().m107336k(width, height).m107339h(imageView, this.f94498d);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
