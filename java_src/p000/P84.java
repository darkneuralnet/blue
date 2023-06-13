package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.P84;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R8\u0010 \u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00050\u0005 \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LP84;", "LxE;", "", "LH6;", "sections", "", "Rl", "Lio/reactivex/Observable;", "Tl", "", "refreshing", "Sl", "LT4;", "b", "LT4;", "binding", "Lp84;", "c", "Lp84;", "adapter", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "Pl", "()Lio/reactivex/Observable;", "activateClicks", "e", "Ql", "addCodeEvents", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/Observable;", "swipeRefreshes", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LT4;Lp84;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P84 */
/* loaded from: classes3.dex */
public final class P84 extends AbstractC30071xE {

    /* renamed from: b */
    public final C7645T4 f27964b;

    /* renamed from: c */
    public final C46693p84 f27965c;

    /* renamed from: d */
    public final Lazy f27966d;

    /* renamed from: e */
    public final Lazy f27967e;

    /* renamed from: f */
    public final Observable<Unit> f27968f;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P84$a */
    /* loaded from: classes3.dex */
    public static final class C6274a extends Lambda implements Function0<Observable<String>> {
        public C6274a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return P84.this.f27965c.m19888v();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P84$b */
    /* loaded from: classes3.dex */
    public static final class C6275b extends Lambda implements Function0<Observable<String>> {
        public C6275b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return P84.this.f27965c.m19887w();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P84$c */
    /* loaded from: classes3.dex */
    public static final class C6276c extends Lambda implements Function1<InterfaceC24578y<Unit>, Unit> {
        public C6276c() {
            super(1);
        }

        /* renamed from: c */
        public static final void m90699c(InterfaceC24578y emitter) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onNext(Unit.INSTANCE);
        }

        /* renamed from: b */
        public final void m90700b(final InterfaceC24578y<Unit> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            P84.this.f27964b.f34722d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC11985j() { // from class: Q84
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC11985j
                public final void onRefresh() {
                    P84.C6276c.m90699c(InterfaceC24578y.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<Unit> interfaceC24578y) {
            m90700b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P84(BaseActivity activity, C7645T4 binding, C46693p84 adapter) {
        super(activity);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f27964b = binding;
        this.f27965c = adapter;
        lazy = LazyKt__LazyJVMKt.lazy(new C6274a());
        this.f27966d = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6275b());
        this.f27967e = lazy2;
        this.f27968f = C45832nh5.m23307i(new C6276c()).share();
        binding.f34721c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f34721c.setItemAnimator(new C11894g());
        binding.f34721c.setAdapter(adapter);
    }

    /* renamed from: Pl */
    public final Observable<String> m90708Pl() {
        return (Observable) this.f27966d.getValue();
    }

    /* renamed from: Ql */
    public final Observable<String> m90707Ql() {
        return (Observable) this.f27967e.getValue();
    }

    /* renamed from: Rl */
    public final void m90706Rl(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f27965c.mo24871u(sections);
    }

    /* renamed from: Sl */
    public final void m90705Sl(boolean z) {
        this.f27964b.f34722d.setRefreshing(z);
    }

    /* renamed from: Tl */
    public final Observable<Unit> m90704Tl() {
        Observable<Unit> swipeRefreshes = this.f27968f;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshes, "swipeRefreshes");
        return swipeRefreshes;
    }
}
