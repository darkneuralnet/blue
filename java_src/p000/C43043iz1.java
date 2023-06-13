package p000;

import android.content.Context;
import android.view.View;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: iz1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43043iz1 implements InterfaceC48812sj1<InterfaceC43636jz1> {

    /* renamed from: a */
    public final C42450hz1 f91942a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f91943b;

    /* renamed from: c */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f91944c;

    /* renamed from: d */
    public final Y94<Context> f91945d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f91946e;

    /* renamed from: f */
    public final Y94<V74> f91947f;

    /* renamed from: g */
    public final Y94<InterfaceC1880Ea> f91948g;

    /* renamed from: h */
    public final Y94<BaseActivity> f91949h;

    /* renamed from: i */
    public final Y94<View> f91950i;

    public C43043iz1(C42450hz1 c42450hz1, Y94<ScopeProvider> y94, Y94<LifecycleScopeProvider<EnumC7097RE>> y942, Y94<Context> y943, Y94<C36207Tq4> y944, Y94<V74> y945, Y94<InterfaceC1880Ea> y946, Y94<BaseActivity> y947, Y94<View> y948) {
        this.f91942a = c42450hz1;
        this.f91943b = y94;
        this.f91944c = y942;
        this.f91945d = y943;
        this.f91946e = y944;
        this.f91947f = y945;
        this.f91948g = y946;
        this.f91949h = y947;
        this.f91950i = y948;
    }

    /* renamed from: a */
    public static C43043iz1 m31326a(C42450hz1 c42450hz1, Y94<ScopeProvider> y94, Y94<LifecycleScopeProvider<EnumC7097RE>> y942, Y94<Context> y943, Y94<C36207Tq4> y944, Y94<V74> y945, Y94<InterfaceC1880Ea> y946, Y94<BaseActivity> y947, Y94<View> y948) {
        return new C43043iz1(c42450hz1, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static InterfaceC43636jz1 m31324c(C42450hz1 c42450hz1, ScopeProvider scopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, Context context, C36207Tq4 c36207Tq4, V74 v74, InterfaceC1880Ea interfaceC1880Ea, BaseActivity baseActivity, View view) {
        return (InterfaceC43636jz1) C51679xZ3.m5002e(c42450hz1.m35423a(scopeProvider, lifecycleScopeProvider, context, c36207Tq4, v74, interfaceC1880Ea, baseActivity, view));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC43636jz1 get() {
        return m31324c(this.f91942a, this.f91943b.get(), this.f91944c.get(), this.f91945d.get(), this.f91946e.get(), this.f91947f.get(), this.f91948g.get(), this.f91949h.get(), this.f91950i.get());
    }
}
