package com.uber.autodispose.android;

import android.view.View;
import com.uber.autodispose.OutsideScopeException;
import com.uber.autodispose.android.internal.AutoDisposeAndroidUtil;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.android.AbstractC23451a;
/* loaded from: classes7.dex */
final class DetachEventCompletable implements InterfaceC23496h {

    /* renamed from: b */
    public final View f75559b;

    /* loaded from: classes7.dex */
    public static final class Listener extends AbstractC23451a implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        public final View f75560c;

        /* renamed from: d */
        public final InterfaceC23476f f75561d;

        public Listener(View view, InterfaceC23476f interfaceC23476f) {
            this.f75560c = view;
            this.f75561d = interfaceC23476f;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f75560c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (!mo1769e()) {
                this.f75561d.onComplete();
            }
        }
    }

    public DetachEventCompletable(View view) {
        this.f75559b = view;
    }

    @Override // io.reactivex.InterfaceC23496h
    /* renamed from: g */
    public void mo33003g(InterfaceC23476f interfaceC23476f) {
        boolean z;
        Listener listener = new Listener(this.f75559b, interfaceC23476f);
        interfaceC23476f.onSubscribe(listener);
        if (!AutoDisposeAndroidUtil.m45200b()) {
            interfaceC23476f.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        if (!this.f75559b.isAttachedToWindow() && this.f75559b.getWindowToken() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            interfaceC23476f.onError(new OutsideScopeException("View is not attached!"));
            return;
        }
        this.f75559b.addOnAttachStateChangeListener(listener);
        if (listener.mo1769e()) {
            this.f75559b.removeOnAttachStateChangeListener(listener);
        }
    }
}
