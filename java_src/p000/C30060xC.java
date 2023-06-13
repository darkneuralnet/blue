package p000;

import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016JF\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0006R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LxC;", "", "", "onDestroy", "T", "Lio/reactivex/Observable;", "Lkotlin/Function1;", "next", "", "error", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "u", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "t", "()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lio/reactivex/disposables/b;", "b", "Lio/reactivex/disposables/b;", "trash", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBasePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePresenter.kt\nco/bird/android/core/mvp/BasePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,24:1\n180#2:25\n*S KotlinDebug\n*F\n+ 1 BasePresenter.kt\nco/bird/android/core/mvp/BasePresenter\n*L\n22#1:25\n*E\n"})
/* renamed from: xC */
/* loaded from: classes2.dex */
public class C30060xC {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f117181a;

    /* renamed from: b */
    public final C23464b f117182b;

    public C30060xC(LifecycleScopeProvider<EnumC7097RE> scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f117181a = scopeProvider;
        this.f117182b = new C23464b();
    }

    /* renamed from: v */
    public static final void m5715v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m5714w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public void onDestroy() {
        this.f117182b.m33026d();
    }

    /* renamed from: t */
    public final LifecycleScopeProvider<EnumC7097RE> m5717t() {
        return this.f117181a;
    }

    /* renamed from: u */
    public final <T> InterfaceC23465c m5716u(Observable<T> observable, final Function1<? super T, Unit> next, final Function1<? super Throwable, Unit> error) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(error, "error");
        Object m33094as = observable.m33094as(AutoDispose.m45239a(this.f117181a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        return ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30060xC.m5715v(Function1.this, obj);
            }
        }, new InterfaceC23484g() { // from class: wC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C30060xC.m5714w(Function1.this, obj);
            }
        });
    }
}
