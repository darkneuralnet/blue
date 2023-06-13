package p000;

import co.bird.android.app.feature.autopay.C13674a;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideState;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Lazy;
import java.util.Set;
/* renamed from: ba5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38629ba5 {

    /* renamed from: a */
    public final Y94<YR4> f57725a;

    /* renamed from: b */
    public final Y94<C13674a> f57726b;

    /* renamed from: c */
    public final Y94<C34192La5> f57727c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f57728d;

    /* renamed from: e */
    public final Y94<InterfaceC44791lw0> f57729e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f57730f;

    public C38629ba5(Y94<YR4> y94, Y94<C13674a> y942, Y94<C34192La5> y943, Y94<C36207Tq4> y944, Y94<InterfaceC44791lw0> y945, Y94<InterfaceC40099e13> y946) {
        this.f57725a = y94;
        this.f57726b = y942;
        this.f57727c = y943;
        this.f57728d = y944;
        this.f57729e = y945;
        this.f57730f = y946;
    }

    /* renamed from: a */
    public static C38629ba5 m64341a(Y94<YR4> y94, Y94<C13674a> y942, Y94<C34192La5> y943, Y94<C36207Tq4> y944, Y94<InterfaceC44791lw0> y945, Y94<InterfaceC40099e13> y946) {
        return new C38629ba5(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static Y95 m64339c(YR4 yr4, Lazy<C13674a> lazy, Lazy<C34192La5> lazy2, C36207Tq4 c36207Tq4, InterfaceC44791lw0 interfaceC44791lw0, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity, Set<? extends RideState.Status> set) {
        return new Y95(yr4, lazy, lazy2, c36207Tq4, interfaceC44791lw0, interfaceC40099e13, lifecycleScopeProvider, baseActivity, set);
    }

    /* renamed from: b */
    public Y95 m64340b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, BaseActivity baseActivity, Set<? extends RideState.Status> set) {
        return m64339c(this.f57725a.get(), V51.m80430a(this.f57726b), V51.m80430a(this.f57727c), this.f57728d.get(), this.f57729e.get(), this.f57730f.get(), lifecycleScopeProvider, baseActivity, set);
    }
}
