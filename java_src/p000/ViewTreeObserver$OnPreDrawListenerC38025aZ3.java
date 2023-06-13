package p000;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: aZ3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ViewTreeObserver$OnPreDrawListenerC38025aZ3 implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b */
    public final Handler f50640b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final AtomicReference<View> f50641c;

    /* renamed from: d */
    public final Runnable f50642d;

    /* renamed from: e */
    public final Runnable f50643e;

    public ViewTreeObserver$OnPreDrawListenerC38025aZ3(View view, Runnable runnable, Runnable runnable2) {
        this.f50641c = new AtomicReference<>(view);
        this.f50642d = runnable;
        this.f50643e = runnable2;
    }

    /* renamed from: a */
    public static void m71216a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC38025aZ3(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f50641c.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f50640b.post(this.f50642d);
        this.f50640b.postAtFrontOfQueue(this.f50643e);
        return true;
    }
}
