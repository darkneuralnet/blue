package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: Zn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ViewTreeObserver$OnDrawListenerC37581Zn1 implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b */
    public final Handler f49237b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final AtomicReference<View> f49238c;

    /* renamed from: d */
    public final Runnable f49239d;

    /* renamed from: Zn1$a */
    /* loaded from: classes6.dex */
    public class View$OnAttachStateChangeListenerC10377a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC10377a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(ViewTreeObserver$OnDrawListenerC37581Zn1.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewTreeObserver$OnDrawListenerC37581Zn1(View view, Runnable runnable) {
        this.f49238c = new AtomicReference<>(view);
        this.f49239d = runnable;
    }

    /* renamed from: b */
    public static boolean m72524b(View view) {
        return view.getViewTreeObserver().isAlive() && m72523c(view);
    }

    /* renamed from: c */
    public static boolean m72523c(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m72522d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m72521e(View view, Runnable runnable) {
        ViewTreeObserver$OnDrawListenerC37581Zn1 viewTreeObserver$OnDrawListenerC37581Zn1 = new ViewTreeObserver$OnDrawListenerC37581Zn1(view, runnable);
        if (Build.VERSION.SDK_INT < 26 && !m72524b(view)) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC10377a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC37581Zn1);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f49238c.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Yn1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver$OnDrawListenerC37581Zn1.this.m72522d(andSet);
            }
        });
        this.f49237b.postAtFrontOfQueue(this.f49239d);
    }
}
