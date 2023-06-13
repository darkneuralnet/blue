package p000;

import android.view.View;
import co.bird.android.core.mvp.BaseActivity;
/* renamed from: y84  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52028y84 {

    /* renamed from: a */
    public final Y94<BaseActivity> f118804a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f118805b;

    /* renamed from: c */
    public final Y94<V74> f118806c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f118807d;

    public C52028y84(Y94<BaseActivity> y94, Y94<C36207Tq4> y942, Y94<V74> y943, Y94<InterfaceC1880Ea> y944) {
        this.f118804a = y94;
        this.f118805b = y942;
        this.f118806c = y943;
        this.f118807d = y944;
    }

    /* renamed from: a */
    public static C52028y84 m4078a(Y94<BaseActivity> y94, Y94<C36207Tq4> y942, Y94<V74> y943, Y94<InterfaceC1880Ea> y944) {
        return new C52028y84(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C50249v84 m4076c(BaseActivity baseActivity, C36207Tq4 c36207Tq4, V74 v74, InterfaceC1880Ea interfaceC1880Ea, View view) {
        return new C50249v84(baseActivity, c36207Tq4, v74, interfaceC1880Ea, view);
    }

    /* renamed from: b */
    public C50249v84 m4077b(View view) {
        return m4076c(this.f118804a.get(), this.f118805b.get(), this.f118806c.get(), this.f118807d.get(), view);
    }
}
