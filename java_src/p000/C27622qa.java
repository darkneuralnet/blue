package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.AnalyticsDebugEvent;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lqa;", "", "", "e", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "Lua;", DateTokenConverter.CONVERTER_KEY, "Lua;", "ui", "", "I", "numEvents", "<init>", "(LEa;Lcom/uber/autodispose/ScopeProvider;Le13;Lua;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnalyticsEventDebuggerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsEventDebuggerPresenter.kt\nco/bird/android/app/feature/settings/analytics/AnalyticsEventDebuggerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,54:1\n180#2:55\n180#2:56\n*S KotlinDebug\n*F\n+ 1 AnalyticsEventDebuggerPresenter.kt\nco/bird/android/app/feature/settings/analytics/AnalyticsEventDebuggerPresenter\n*L\n34#1:55\n48#1:56\n*E\n"})
/* renamed from: qa */
/* loaded from: classes2.dex */
public final class C27622qa {

    /* renamed from: a */
    public final InterfaceC1880Ea f105428a;

    /* renamed from: b */
    public final ScopeProvider f105429b;

    /* renamed from: c */
    public final InterfaceC40099e13 f105430c;

    /* renamed from: d */
    public final InterfaceC29255ua f105431d;

    /* renamed from: e */
    public int f105432e;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "events", "", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qa$a */
    /* loaded from: classes2.dex */
    public static final class C27623a extends Lambda implements Function1<List<? extends AnalyticsDebugEvent>, Unit> {
        public C27623a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AnalyticsDebugEvent> list) {
            invoke2((List<AnalyticsDebugEvent>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<AnalyticsDebugEvent> events) {
            List<AnalyticsDebugEvent> reversed;
            C27622qa.this.f105432e = events.size();
            InterfaceC29255ua interfaceC29255ua = C27622qa.this.f105431d;
            Intrinsics.checkNotNullExpressionValue(events, "events");
            reversed = CollectionsKt___CollectionsKt.reversed(events);
            interfaceC29255ua.mo8440a(reversed);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qa$b */
    /* loaded from: classes2.dex */
    public static final class C27624b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C27624b f105434g = new C27624b();

        public C27624b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "positionReversed", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qa$c */
    /* loaded from: classes2.dex */
    public static final class C27625c extends Lambda implements Function1<Integer, Integer> {
        public C27625c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Integer positionReversed) {
            Intrinsics.checkNotNullParameter(positionReversed, "positionReversed");
            return Integer.valueOf((C27622qa.this.f105432e - positionReversed.intValue()) - 1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "eventPosition", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qa$d */
    /* loaded from: classes2.dex */
    public static final class C27626d extends Lambda implements Function1<Integer, Unit> {
        public C27626d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer eventPosition) {
            InterfaceC40099e13 interfaceC40099e13 = C27622qa.this.f105430c;
            Intrinsics.checkNotNullExpressionValue(eventPosition, "eventPosition");
            interfaceC40099e13.mo36975n4(eventPosition.intValue());
        }
    }

    public C27622qa(InterfaceC1880Ea analyticsManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC29255ua ui) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f105428a = analyticsManager;
        this.f105429b = scopeProvider;
        this.f105430c = navigator;
        this.f105431d = ui;
    }

    /* renamed from: f */
    public static final void m17440f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m17439g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final Integer m17438h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m17437i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final void m17441e() {
        Observable<List<AnalyticsDebugEvent>> observeOn = this.f105428a.mo55935e().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "analyticsManager.tracked…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f105429b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27623a c27623a = new C27623a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ma
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27622qa.m17440f(Function1.this, obj);
            }
        };
        final C27624b c27624b = C27624b.f105434g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: na
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27622qa.m17439g(Function1.this, obj);
            }
        });
        Observable<Integer> analyticsEventClicks = this.f105431d.analyticsEventClicks();
        final C27625c c27625c = new C27625c();
        Observable observeOn2 = analyticsEventClicks.map(new InterfaceC23492o() { // from class: oa
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m17438h;
                m17438h = C27622qa.m17438h(Function1.this, obj);
                return m17438h;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onCreate() {\n    ana…ventPosition)\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f105429b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27626d c27626d = new C27626d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: pa
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27622qa.m17437i(Function1.this, obj);
            }
        });
    }
}
